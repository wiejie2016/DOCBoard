package com.demo.dashboard.model;

/**
 * Created by wie.jie.tjoeng on 6/19/2017.
 */

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Device")
public class Device {

    @Id
    private ObjectId id;
    private Memory memory;
    private Filesystem filesystem;

    private String hostName;
    private Os os;
    private List<Service> services = null;
    private Cpu cpu;
    private List<Software> software = null;

    private String ipAddress;
    private String machineId;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Device(){

    }

    public Device(ObjectId id, Memory memory, Filesystem filesystem, String hostName, Os os, List<Service> services, Cpu cpu, List<Software> software, String ipAddress, String machineId) {
        this.id = id;
        this.memory = memory;
        this.filesystem = filesystem;
        this.hostName = hostName;
        this.os = os;
        this.services = services;
        this.cpu = cpu;
        this.software = software;
        this.ipAddress = ipAddress;
        this.machineId = machineId;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Filesystem getFilesystem() {
        return filesystem;
    }

    public void setFilesystem(Filesystem filesystem) {
        this.filesystem = filesystem;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public Os getOs() {
        return os;
    }

    public void setOs(Os os) {
        this.os = os;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public List<Software> getSoftware() {
        return software;
    }

    public void setSoftware(List<Software> software) {
        this.software = software;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getMachineId() {
        return machineId;
    }

    public void setMachineId(String machineId) {
        this.machineId = machineId;
    }



}

