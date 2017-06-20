package com.demo.dashboard.model;

/**
 * Created by wie.jie.tjoeng on 6/19/2017.
 */


import java.util.HashMap;
import java.util.Map;

public class Filesystem {

    private Integer percentUsed;
    private String drive;
    private String used;
    private String totalSize;
    private String available;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Filesystem(Integer percentUsed, String drive, String used, String totalSize, String available, Map<String, Object> additionalProperties) {
        this.percentUsed = percentUsed;
        this.drive = drive;
        this.used = used;
        this.totalSize = totalSize;
        this.available = available;
        this.additionalProperties = additionalProperties;
    }

    public Integer getPercentUsed() {
        return percentUsed;
    }

    public void setPercentUsed(Integer percentUsed) {
        this.percentUsed = percentUsed;
    }

    public String getDrive() {
        return drive;
    }

    public void setDrive(String drive) {
        this.drive = drive;
    }

    public String getUsed() {
        return used;
    }

    public void setUsed(String used) {
        this.used = used;
    }

    public String getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(String totalSize) {
        this.totalSize = totalSize;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

