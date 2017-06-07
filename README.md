# DOCboard - DevOps Central Dashboard Project

The DOCboard project is a proof of concept of a continue-integration and continue-delivery development operation dashboard. We believe building this project should be fun, light, exciting, and not a complex thing if anyone will contribute or participate his/her time in this project. :)


### Getting Started

    * Clone the project from gitHub link: https://github.com/wiejie2016/DOCBoard.git
    * Import/open the project with your most comfortable IDE.


The project folder structure:

    /DOCBoard
        /api             (It contains rest api of java spring maven project )
        /collectors      (It will contain feeder scripting files)
        /db              (It contains all mongoDB configuration file)
        /ui              (It contains the user interface of emberJS project)


### Prerequisites

Install programing development tools.

   * Oracle JDK 8
   * git tool
   * maven build tool
   * STS IDE / Intellij IDE
   * Nodejs
   * npm
   * bower


### Installing

Development tools link:

* http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
* https://www.mongodb.com/download-center#enterprise
* https://git-scm.com/downloads
* https://spring.io/tools/sts/all
* https://www.jetbrains.com/idea/download/#section=windows
* https://maven.apache.org/download.cgi
* https://nodejs.org/en/download/
* https://www.npmjs.com/package/npm
* https://guides.emberjs.com/v2.13.0/getting-started/quick-start/

##### Configure mongoDB database after the install
1) From command line type mkdir c:\mangoDB\data
2) create mongo.config file under mongoDB directory and type all the following line:

    dbpath=C:\mangoDB\data

    logpath=C:\mongoDB\log\mongo.log
3) Save the mongo.config file


### How to build and running the application

##### To run mangoDB database instance:
1) type mongod "c:\MongoDB\mongo.config"  (required to set up mongo.config)

##### To build and verify api maven project:
1) Open window cmd line, Navigate to /api project folder
2) Then run command "mvn clean install"
3) Next run command "java -jar target/api.jar
4) Next to verify the rest api from Internet Browser using http://localhost:8181/api/all


### Built With

 * EmberJS - The front-end java=script framework used
 * Java Spring - The middle-tire web framework used
 * Maven - Dependency Management
 * MS Powershell - Used to generate data Feeds
 * mongoDB - Used to have persistence data

### Versioning

We use git for versioning. For the versions available, see the tags on this repository.


### Authors

Keith Flowers - Project Lead

Wilfredo Monge - Front-end Project Lead

Wie Jie Tjoeng - Initial work


### License

This project is a free licensed.

