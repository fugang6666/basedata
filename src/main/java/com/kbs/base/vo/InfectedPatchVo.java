package com.kbs.base.vo;

import java.util.Date;

public class InfectedPatchVo {
    private String infectedPatchId;

    private String hospitalId;

    private String infectedPatchCode;

    private String infectedPatchName;

    private String infectedPatchAddress;

    private String infectedPatchDesc;

    private String infectedPatchTelephone;

    private Integer wardNumber;

    private Integer sickbedNumber;

    public String getInfectedPatchId() {
        return infectedPatchId;
    }

    public void setInfectedPatchId(String infectedPatchId) {
        this.infectedPatchId = infectedPatchId;
    }

    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getInfectedPatchCode() {
        return infectedPatchCode;
    }

    public void setInfectedPatchCode(String infectedPatchCode) {
        this.infectedPatchCode = infectedPatchCode;
    }

    public String getInfectedPatchName() {
        return infectedPatchName;
    }

    public void setInfectedPatchName(String infectedPatchName) {
        this.infectedPatchName = infectedPatchName;
    }

    public String getInfectedPatchAddress() {
        return infectedPatchAddress;
    }

    public void setInfectedPatchAddress(String infectedPatchAddress) {
        this.infectedPatchAddress = infectedPatchAddress;
    }

    public String getInfectedPatchDesc() {
        return infectedPatchDesc;
    }

    public void setInfectedPatchDesc(String infectedPatchDesc) {
        this.infectedPatchDesc = infectedPatchDesc;
    }

    public String getInfectedPatchTelephone() {
        return infectedPatchTelephone;
    }

    public void setInfectedPatchTelephone(String infectedPatchTelephone) {
        this.infectedPatchTelephone = infectedPatchTelephone;
    }

    public Integer getWardNumber() {
        return wardNumber;
    }

    public void setWardNumber(Integer wardNumber) {
        this.wardNumber = wardNumber;
    }

    public Integer getSickbedNumber() {
        return sickbedNumber;
    }

    public void setSickbedNumber(Integer sickbedNumber) {
        this.sickbedNumber = sickbedNumber;
    }

    @Override
    public String toString() {
        return "InfectedPatch{" +
                "infectedPatchId='" + infectedPatchId + '\'' +
                ", hospitalId='" + hospitalId + '\'' +
                ", infectedPatchCode='" + infectedPatchCode + '\'' +
                ", infectedPatchName='" + infectedPatchName + '\'' +
                ", infectedPatchAddress='" + infectedPatchAddress + '\'' +
                ", infectedPatchDesc='" + infectedPatchDesc + '\'' +
                ", infectedPatchTelephone='" + infectedPatchTelephone + '\'' +
                ", wardNumber=" + wardNumber +
                ", sickbedNumber=" + sickbedNumber +
                '}';
    }
}