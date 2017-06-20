package com.demo.dashboard.model;

/**
 * Created by wie.jie.tjoeng on 6/19/2017.
 */


import java.util.HashMap;
import java.util.Map;

public class Os {

    private String version;
    private String name;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Os(String version, String name, Map<String, Object> additionalProperties) {
        this.version = version;
        this.name = name;
        this.additionalProperties = additionalProperties;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

