package com.demo.dashboard.model;

/**
 * Created by wie.jie.tjoeng on 6/19/2017.
 */

import java.util.HashMap;
import java.util.Map;

public class Cpu {

    private Integer numberOfCores;
    private String manufacturer;
    private Integer family;
    private Integer revision;
    private String description;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Cpu(Integer numberOfCores, String manufacturer, Integer family, Integer revision, String description, Map<String, Object> additionalProperties) {
        this.numberOfCores = numberOfCores;
        this.manufacturer = manufacturer;
        this.family = family;
        this.revision = revision;
        this.description = description;
        this.additionalProperties = additionalProperties;
    }

    public Integer getNumberOfCores() {
        return numberOfCores;
    }

    public void setNumberOfCores(Integer numberOfCores) {
        this.numberOfCores = numberOfCores;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Integer getFamily() {
        return family;
    }

    public void setFamily(Integer family) {
        this.family = family;
    }

    public Integer getRevision() {
        return revision;
    }

    public void setRevision(Integer revision) {
        this.revision = revision;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
