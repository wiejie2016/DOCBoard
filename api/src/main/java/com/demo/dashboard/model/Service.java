package com.demo.dashboard.model;

/**
 * Created by wie.jie.tjoeng on 6/19/2017.
 */


import java.util.HashMap;
import java.util.Map;

public class Service {

    private String name;
    private String status;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Service(String name, String status, Map<String, Object> additionalProperties) {
        this.name = name;
        this.status = status;
        this.additionalProperties = additionalProperties;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
