package com.demo.dashboard.model;

/**
 * Created by wie.jie.tjoeng on 6/5/2017.
 */


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;
import java.util.Map;


@Document(collection = "ApplicationHealthMetrics")
public class ApplicationHealthMetric {

    private Boolean machineAgentPresent;
    private String machineName;
    private Integer machineId;
    private String tierName;
    private String type;
    private Integer tierId;

    @Id
    private Integer id;
    private String machineAgentVersion;
    private Boolean appAgentPresent;
    private String machineOSType;
    private String name;
    private String agentType;
    private String appAgentVersion;
    private String nodeUniqueLocalId;
    private Object ipAddresses;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public ApplicationHealthMetric() {
    }

    /**
     * @param machineAgentPresent
     * @param machineName
     * @param machineId
     * @param tierName
     * @param type
     * @param tierId
     * @param id
     * @param machineAgentVersion
     * @param appAgentPresent
     * @param machineOSType
     * @param name
     * @param appAgentVersion
     * @param agentType
     * @param nodeUniqueLocalId
     * @param ipAddresses
     */
    public ApplicationHealthMetric(Boolean machineAgentPresent, String machineName, Integer machineId, String tierName, String type, Integer tierId, Integer id, String machineAgentVersion, Boolean appAgentPresent, String machineOSType, String name, String agentType, String appAgentVersion, String nodeUniqueLocalId, Object ipAddresses) {
        super();
        this.machineAgentPresent = machineAgentPresent;
        this.machineName = machineName;
        this.machineId = machineId;
        this.tierName = tierName;
        this.type = type;
        this.tierId = tierId;
        this.id = id;
        this.machineAgentVersion = machineAgentVersion;
        this.appAgentPresent = appAgentPresent;
        this.machineOSType = machineOSType;
        this.name = name;
        this.agentType = agentType;
        this.appAgentVersion = appAgentVersion;
        this.nodeUniqueLocalId = nodeUniqueLocalId;
        this.ipAddresses = ipAddresses;
    }

    public Boolean getMachineAgentPresent() {
        return machineAgentPresent;
    }

    public void setMachineAgentPresent(Boolean machineAgentPresent) {
        this.machineAgentPresent = machineAgentPresent;
    }

    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    public Integer getMachineId() {
        return machineId;
    }

    public void setMachineId(Integer machineId) {
        this.machineId = machineId;
    }

    public String getTierName() {
        return tierName;
    }

    public void setTierName(String tierName) {
        this.tierName = tierName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getTierId() {
        return tierId;
    }

    public void setTierId(Integer tierId) {
        this.tierId = tierId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMachineAgentVersion() {
        return machineAgentVersion;
    }

    public void setMachineAgentVersion(String machineAgentVersion) {
        this.machineAgentVersion = machineAgentVersion;
    }

    public Boolean getAppAgentPresent() {
        return appAgentPresent;
    }

    public void setAppAgentPresent(Boolean appAgentPresent) {
        this.appAgentPresent = appAgentPresent;
    }

    public String getMachineOSType() {
        return machineOSType;
    }

    public void setMachineOSType(String machineOSType) {
        this.machineOSType = machineOSType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAgentType() {
        return agentType;
    }

    public void setAgentType(String agentType) {
        this.agentType = agentType;
    }

    public String getAppAgentVersion() {
        return appAgentVersion;
    }

    public void setAppAgentVersion(String appAgentVersion) {
        this.appAgentVersion = appAgentVersion;
    }

    public String getNodeUniqueLocalId() {
        return nodeUniqueLocalId;
    }

    public void setNodeUniqueLocalId(String nodeUniqueLocalId) {
        this.nodeUniqueLocalId = nodeUniqueLocalId;
    }

    public Object getIpAddresses() {
        return ipAddresses;
    }

    public void setIpAddresses(Object ipAddresses) {
        this.ipAddresses = ipAddresses;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

