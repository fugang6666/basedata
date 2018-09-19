package com.kbs.base.model;

import java.util.Date;

public class DeviceInformation {
    private Long deviceInformationId;

    private String deviceInformationNumber;

    private String deviceName;

    private String deviceMac;

    private String deviceCpu;

    private String deviceAppVersion;

    private String deviceOsVersion;

    private String deviceManufacturer;

    private Integer deviceType;

    private Long hospitalId;

    private Long departmentId;

    private Long infectedPatchId;

    private String bedNumber;

    private Date deviceChangeTime;

    private Integer deviceStatus;

    private Long createBy;

    private Date createTime;

    private Long updateBy;

    private Date updateTime;

    private Long bedId;

    private String devicePosition;

    public Long getDeviceInformationId() {
        return deviceInformationId;
    }

    public void setDeviceInformationId(Long deviceInformationId) {
        this.deviceInformationId = deviceInformationId;
    }

    public String getDeviceInformationNumber() {
        return deviceInformationNumber;
    }

    public void setDeviceInformationNumber(String deviceInformationNumber) {
        this.deviceInformationNumber = deviceInformationNumber == null ? null : deviceInformationNumber.trim();
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName == null ? null : deviceName.trim();
    }

    public String getDeviceMac() {
        return deviceMac;
    }

    public void setDeviceMac(String deviceMac) {
        this.deviceMac = deviceMac == null ? null : deviceMac.trim();
    }

    public String getDeviceCpu() {
        return deviceCpu;
    }

    public void setDeviceCpu(String deviceCpu) {
        this.deviceCpu = deviceCpu == null ? null : deviceCpu.trim();
    }

    public String getDeviceAppVersion() {
        return deviceAppVersion;
    }

    public void setDeviceAppVersion(String deviceAppVersion) {
        this.deviceAppVersion = deviceAppVersion == null ? null : deviceAppVersion.trim();
    }

    public String getDeviceOsVersion() {
        return deviceOsVersion;
    }

    public void setDeviceOsVersion(String deviceOsVersion) {
        this.deviceOsVersion = deviceOsVersion == null ? null : deviceOsVersion.trim();
    }

    public String getDeviceManufacturer() {
        return deviceManufacturer;
    }

    public void setDeviceManufacturer(String deviceManufacturer) {
        this.deviceManufacturer = deviceManufacturer == null ? null : deviceManufacturer.trim();
    }

    public Integer getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(Integer deviceType) {
        this.deviceType = deviceType;
    }

    public Long getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Long hospitalId) {
        this.hospitalId = hospitalId;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public Long getInfectedPatchId() {
        return infectedPatchId;
    }

    public void setInfectedPatchId(Long infectedPatchId) {
        this.infectedPatchId = infectedPatchId;
    }

    public String getBedNumber() {
        return bedNumber;
    }

    public void setBedNumber(String bedNumber) {
        this.bedNumber = bedNumber == null ? null : bedNumber.trim();
    }

    public Date getDeviceChangeTime() {
        return deviceChangeTime;
    }

    public void setDeviceChangeTime(Date deviceChangeTime) {
        this.deviceChangeTime = deviceChangeTime;
    }

    public Integer getDeviceStatus() {
        return deviceStatus;
    }

    public void setDeviceStatus(Integer deviceStatus) {
        this.deviceStatus = deviceStatus;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getBedId() {
        return bedId;
    }

    public void setBedId(Long bedId) {
        this.bedId = bedId;
    }

    public String getDevicePosition() {
        return devicePosition;
    }

    public void setDevicePosition(String devicePosition) {
        this.devicePosition = devicePosition == null ? null : devicePosition.trim();
    }

    @Override
    public String toString() {
        return "DeviceInformation{" +
                "deviceInformationId=" + deviceInformationId +
                ", deviceInformationNumber='" + deviceInformationNumber + '\'' +
                ", deviceName='" + deviceName + '\'' +
                ", deviceMac='" + deviceMac + '\'' +
                ", deviceCpu='" + deviceCpu + '\'' +
                ", deviceAppVersion='" + deviceAppVersion + '\'' +
                ", deviceOsVersion='" + deviceOsVersion + '\'' +
                ", deviceManufacturer='" + deviceManufacturer + '\'' +
                ", deviceType=" + deviceType +
                ", hospitalId=" + hospitalId +
                ", departmentId=" + departmentId +
                ", infectedPatchId=" + infectedPatchId +
                ", bedNumber='" + bedNumber + '\'' +
                ", deviceChangeTime=" + deviceChangeTime +
                ", deviceStatus=" + deviceStatus +
                ", createBy=" + createBy +
                ", createTime=" + createTime +
                ", updateBy=" + updateBy +
                ", updateTime=" + updateTime +
                ", bedId=" + bedId +
                ", devicePosition='" + devicePosition + '\'' +
                '}';
    }
}