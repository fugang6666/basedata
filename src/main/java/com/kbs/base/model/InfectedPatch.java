package com.kbs.base.model;

import java.util.Date;

public class InfectedPatch {
    private Long infectedPatchId;

    private Long hospitalId;

    private String infectedPatchCode;

    private String infectedPatchName;

    private String infectedPatchAddress;

    private String infectedPatchDesc;

    private String infectedPatchTelephone;

    private Integer wardNumber;

    private Integer sickbedNumber;

    private Long createBy;

    private Date createTime;

    private Long updateBy;

    private Date updateTime;

    private Boolean isDelete;

    public Long getInfectedPatchId() {
        return infectedPatchId;
    }

    public void setInfectedPatchId(Long infectedPatchId) {
        this.infectedPatchId = infectedPatchId;
    }

    public Long getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Long hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getInfectedPatchCode() {
        return infectedPatchCode;
    }

    public void setInfectedPatchCode(String infectedPatchCode) {
        this.infectedPatchCode = infectedPatchCode == null ? null : infectedPatchCode.trim();
    }

    public String getInfectedPatchName() {
        return infectedPatchName;
    }

    public void setInfectedPatchName(String infectedPatchName) {
        this.infectedPatchName = infectedPatchName == null ? null : infectedPatchName.trim();
    }

    public String getInfectedPatchAddress() {
        return infectedPatchAddress;
    }

    public void setInfectedPatchAddress(String infectedPatchAddress) {
        this.infectedPatchAddress = infectedPatchAddress == null ? null : infectedPatchAddress.trim();
    }

    public String getInfectedPatchDesc() {
        return infectedPatchDesc;
    }

    public void setInfectedPatchDesc(String infectedPatchDesc) {
        this.infectedPatchDesc = infectedPatchDesc == null ? null : infectedPatchDesc.trim();
    }

    public String getInfectedPatchTelephone() {
        return infectedPatchTelephone;
    }

    public void setInfectedPatchTelephone(String infectedPatchTelephone) {
        this.infectedPatchTelephone = infectedPatchTelephone == null ? null : infectedPatchTelephone.trim();
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

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "InfectedPatch{" +
                "infectedPatchId=" + infectedPatchId +
                ", hospitalId=" + hospitalId +
                ", infectedPatchCode='" + infectedPatchCode + '\'' +
                ", infectedPatchName='" + infectedPatchName + '\'' +
                ", infectedPatchAddress='" + infectedPatchAddress + '\'' +
                ", infectedPatchDesc='" + infectedPatchDesc + '\'' +
                ", infectedPatchTelephone='" + infectedPatchTelephone + '\'' +
                ", wardNumber=" + wardNumber +
                ", sickbedNumber=" + sickbedNumber +
                ", createBy=" + createBy +
                ", createTime=" + createTime +
                ", updateBy=" + updateBy +
                ", updateTime=" + updateTime +
                ", isDelete=" + isDelete +
                '}';
    }
}