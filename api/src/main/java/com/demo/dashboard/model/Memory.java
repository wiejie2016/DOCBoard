package com.demo.dashboard.model;

/**
 * Created by wie.jie.tjoeng on 6/19/2017.
 */

import java.util.HashMap;
import java.util.Map;

public class Memory {

    private Integer total;
    private String free;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Memory(Integer total, String free, Map<String, Object> additionalProperties) {
        this.total = total;
        this.free = free;
        this.additionalProperties = additionalProperties;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String getFree() {
        return free;
    }

    public void setFree(String free) {
        this.free = free;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
