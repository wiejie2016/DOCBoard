
<#
.Synopsis
   Short description
.DESCRIPTION
   Long description
.EXAMPLE
   Example of how to use this cmdlet
.EXAMPLE
   Another example of how to use this cmdlet
.INPUTS
   Inputs to this cmdlet (if any)
.OUTPUTS
   Output from this cmdlet (if any)
.NOTES
   General notes
.COMPONENT
   The component this cmdlet belongs to
.ROLE
   The role this cmdlet belongs to
.FUNCTIONALITY
   The functionality that best describes this cmdlet
#>
 
#>

<#
.DESCRIPTION
    Used to create and return a Win32_ComputerSystem object.
.INPUTS
    server: The server you which to execute this on and get the results.
.OUTPUTS
    Win32_ComputerSystem object
#>
function Get-ComputerSystem($server)
{
    return (Get-WmiObject Win32_ComputerSystem -ComputerName $server | Select *)
}

<#
.DESCRIPTION
    Used to create and return a Win32_OperatingSystem object.
.INPUTS
    server: The server you which to execute this on and get the results.
.OUTPUTS
    Win32_OperatingSystem object

#>
function Get-Win32-OS($server)
{
    return (Get-WmiObject Win32_OperatingSystem -ComputerName $server | select *)
}

<#
.DESCRIPTION
    Return IP address of the server.
.INPUTS
    server: The server you which to execute this on and get the results.
.OUTPUTS
    IP address

#>
function Get-IPAddresses($server)
{
    return ((Get-WmiObject Win32_NetworkAdapterConfiguration -ComputerName $server | Where-Object { $_.IpEnabled }).IPAddress)[0]
}

<#
.DESCRIPTION
    Return CPU information of the server specified.
.INPUTS
    server: The server you which to execute this on and get the results.
.OUTPUTS
    CPU Object consisting of the following variables/values:
        NumberOfCores
        Manufacturer
        Family
        Revision
        Description

#>
function Get-CPU($server)
{
   $cpu =  Get-WmiObject –class Win32_processor -ComputerName $server | Select NumberOfCores,Manufacturer,Family,Revision,Description 

   return $cpu
}

<#
.DESCRIPTION
    Return file system information of the server specified.
.INPUTS
    server: The server you which to execute this on and get the results.
.OUTPUTS
    An Object Array of FileSystem Objects consisting of the following variables/values:
        drive 
        total_size(GB)
        available(GB) 
        used(GB) 
        percent_used

#>
function Get-FileSystem($server)
{
 
    $fileSys = Get-WmiObject Win32_LogicalDisk -ComputerName $server
    $fileSystemArray = New-Object System.Collections.ArrayList
    $fsTable = @{}

    foreach ($item in $fileSys)
    {
        #Drive Letter
        $drive = $item.DeviceID
        #Size
        $totalSpace =  ([string]($item.Size / 1GB)).Substring(0,5)
        #Freespace
        $freeSpace = (([string]($item.FreeSpace / 1GB)).Substring(0,5))
        #Used
        $used = ($item.Size - $item.FreeSpace)
        $usedSpace = (([string]( $used / 1GB)).Substring(0,5))
        #Percent used
        $usedPercent = ([math]::Truncate(($used / $item.Size) * 100))

        $tmpHashTable = @{drive = $drive; 
            total_size = $totalspace; 
            available = $freeSpace; 
            used = $usedSpace; 
            percent_used = $usedPercent}
        
        [void] $fileSystemArray.Add($tmpHashTable)

    }

    return $fileSystemArray
}

<#
.DESCRIPTION
    Return Window services installed on the server specified.
.INPUTS
    server: The server you which to execute this on and get the results.
.OUTPUTS
    An Object Array of WinService Objects consisting of the following variables/values:
        name 
        status

#>
function Get-Win-Services($server)
{
    $services = Get-Service -ComputerName $server
    $servicesArray = New-Object System.Collections.ArrayList

    foreach ($service in $services)
    {
        #Typecast to a String or the value will show up as a number
        [string] $status = $service.Status

        #Store the current service into a temp Hashtable using name {key] and status[value]
        $tmpHashTable = @{name = $service.DisplayName; status = $status}
 
        #Store the Temp Hashtable into an Array
        [void]$servicesArray.Add($tmpHashTable)

    }

    return $servicesArray
}


<#
.DESCRIPTION
    Return software installed on the server specified. 
    Looks at the content of HKLM:\SOFTWARE\Microsoft\Windows\CurrentVersion\Uninstall
.INPUTS
    server: The server you which to execute this on and get the results.
.OUTPUTS
    An Object Array of WinService Objects consisting of the following variables/values:
        name 
        status: (Running/Stopped)

#>
function Get-Software($server)
{
    $keys = "HKLM:\SOFTWARE\Microsoft\Windows\CurrentVersion\Uninstall\*"
    $softwarArray = New-Object System.Collections.ArrayList

    $items = Get-ItemProperty $keys

    foreach($item in $items)
    {
        #A Null key will cause an issue so verify not null. 
        #Noticed some installed software did not have display name.
        if($item.DisplayName -ne $null) 
        {
            $tmpHashTable = @{name = ($item.DisplayName); version = ($item.DisplayVersion)}
            [void]  $softwarArray.Add($tmpHashTable)
        }
    }

    return $softwarArray
}


<#
.DESCRIPTION
    Collect all the server information for the server specifed and return a json file
.INPUTS
    server: The server you which to execute this on and get the results.
        Default Value: localhost
.OUTPUTS
    JSON file representing all the server information collected which is below.
            <Note the order in the JSON file maybe different>
        "hostName" : ....
        "ipAddress":  "127.0.0.1",
        "cpu":  {
                "NumberOfCores":  2,
                "Manufacturer":  "GenuineIntel",
                "Family":  205,
                "Revision":  17665,
                "Description":  "Intel64 Family 6 Model 69 Stepping 1"
            },
         "filesystem":  {
                       "percent_used":  90,
                       "drive":  "C:",
                       "used":  "107.5",
                       "total_size":  "118.7",
                       "available":  "11.24"
                   },
        "services":  [
                     {
                         "name":  "My Service",
                         "status":  "Running"
                     },
                     ...
                     ],
        os":  {
               "version":  "6.1.7601",
               "name":  "Microsoft Windows 7 Enterprise "
           },
        "memory":  {
                   "total":  4063340,
                   "free":  "1152624"
               },
        "software":  [
                     {
                         "name":  "7-Zip 16.04 (x64)"
                         "version":  "16.04",
                     },
                     ....
                     ]


#>
function Get-ServerInfo($server="localhost")
{
   $compSys = Get-ComputerSystem $server
   $osInfo = Get-Win32-OS $server

   $osTable = @{name = ($osInfo.Caption);
            version = ($osInfo.Version)}

   $memoryTable = @{total = $osInfo.TotalVisibleMemorySize;
		    free = "1152624kB"}

   $serverTable = @{hostName = ($compSys.Name);
        ipAddress = (Get-IPAddresses $server);
        machineId = ("1");
        cpu = (Get-CPU $server); 
        filesystem = (Get-FileSystem $server);
        services = (Get-Win-Services $server);
        os = ($osTable);
        memory = ($memoryTable);
        software = (Get-Software $server)
        }

    return ($serverTable | ConvertTo-Json)
}



function Get-ServerInfo-Compressed($server="localhost")
{
   $compSys = Get-ComputerSystem $server
   $osInfo = Get-Win32-OS $server

   $osTable = @{name = ($osInfo.Caption);
            version = ($osInfo.Version)}

   $memoryTable = @{total = $osInfo.TotalVisibleMemorySize;
		    free = "1152624kB"}

   $serverTable = @{hostName = ($compSys.Name);
        ipAddress = (Get-IPAddresses $server);
        machineId = ("1");
        cpu = (Get-CPU $server); 
        filesystem = (Get-FileSystem $server);
        os = ($osTable);
        memory = ($memoryTable);
        software = (Get-Software $server)
        }

    return ($serverTable | ConvertTo-Json -Compress)
}



