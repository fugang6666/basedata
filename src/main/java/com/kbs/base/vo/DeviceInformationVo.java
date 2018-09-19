package com.kbs.base.vo;

import java.util.Date;

public class DeviceInformationVo {
    private String deviceInformationId;

    private String deviceInformationNumber;

    private String deviceName;

    private String deviceMac;

    private String deviceCpu;

    private String deviceAppVersion;

    private String deviceOsVersion;

    private String deviceManufacturer;

    private Integer deviceType;

    private String hospitalId;

    private String departmentId;

    private String infectedPatchId;

    private String bedNumber;

    public String getDeviceInformationId() {
        return deviceInformationId;
    }

    public void setDeviceInformationId(String deviceInformationId) {
        this.deviceInformationId = deviceInformationId;
    }

    public String getDeviceInformationNumber() {
        return deviceInformationNumber;
    }

    public void setDeviceInformationNumber(String deviceInformationNumber) {
        this.deviceInformationNumber = deviceInformationNumber;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceMac() {
        return deviceMac;
    }

    public void setDeviceMac(String deviceMac) {
        this.deviceMac = deviceMac;
    }

    public String getDeviceCpu() {
        return deviceCpu;
    }

    public void setDeviceCpu(String deviceCpu) {
        this.deviceCpu = deviceCpu;
    }

    public String getDeviceAppVersion() {
        return deviceAppVersion;
    }

    public void setDeviceAppVersion(String deviceAppVersion) {
        this.deviceAppVersion = deviceAppVersion;
    }

    public String getDeviceOsVersion() {
        return deviceOsVersion;
    }

    public void setDeviceOsVersion(String deviceOsVersion) {
        this.deviceOsVersion = deviceOsVersion;
    }

    public String getDeviceManufacturer() {
        return deviceManufacturer;
    }

    public void setDeviceManufacturer(String deviceManufacturer) {
        this.deviceManufacturer = deviceManufacturer;
    }

    public Integer getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(Integer deviceType) {
        this.deviceType = deviceType;
    }

    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getInfectedPatchId() {
        return infectedPatchId;
    }

    public void setInfectedPatchId(String infectedPatchId) {
        this.infectedPatchId = infectedPatchId;
    }

    public String getBedNumber() {
        return bedNumber;
    }

    public void setBedNumber(String bedNumber) {
        this.bedNumber = bedNumber;
    }

    @Override
    public String toString() {
        return "DeviceInformation{" +
                "deviceInformationId='" + deviceInformationId + '\'' +
                ", deviceInformationNumber='" + deviceInformationNumber + '\'' +
                ", deviceName='" + deviceName + '\'' +
                ", deviceMac='" + deviceMac + '\'' +
                ", deviceCpu='" + deviceCpu + '\'' +
                ", deviceAppVersion='" + deviceAppVersion + '\'' +
                ", deviceOsVersion='" + deviceOsVersion + '\'' +
                ", deviceManufacturer='" + deviceManufacturer + '\'' +
                ", deviceType=" + deviceType +
                ", hospitalId='" + hospitalId + '\'' +
                ", departmentId='" + departmentId + '\'' +
                ", infectedPatchId='" + infectedPatchId + '\'' +
                ", bedNumber='" + bedNumber + '\'' +
                '}';
    }
}