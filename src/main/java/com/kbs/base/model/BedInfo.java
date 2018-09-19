package com.kbs.base.model;

import java.util.Date;

public class BedInfo {
    private Long bedId;

    private Long hospitalId;

    private String hospitalName;

    private Long departmentId;

    private String departmentName;

    private Long infectedPatchId;

    private String hisCode;

    private String infectedPatchName;

    private String bedName;

    private String bedNumber;

    private Integer bedSort;

    private String roomName;

    private Date createTime;

    private Long createBy;

    private Integer bedStatus;

    private Date updateTime;

    private Long updateBy;

    public Long getBedId() {
        return bedId;
    }

    public void setBedId(Long bedId) {
        this.bedId = bedId;
    }

    public Long getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Long hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName == null ? null : hospitalName.trim();
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }

    public Long getInfectedPatchId() {
        return infectedPatchId;
    }

    public void setInfectedPatchId(Long infectedPatchId) {
        this.infectedPatchId = infectedPatchId;
    }

    public String getHisCode() {
        return hisCode;
    }

    public void setHisCode(String hisCode) {
        this.hisCode = hisCode == null ? null : hisCode.trim();
    }

    public String getInfectedPatchName() {
        return infectedPatchName;
    }

    public void setInfectedPatchName(String infectedPatchName) {
        this.infectedPatchName = infectedPatchName == null ? null : infectedPatchName.trim();
    }

    public String getBedName() {
        return bedName;
    }

    public void setBedName(String bedName) {
        this.bedName = bedName == null ? null : bedName.trim();
    }

    public String getBedNumber() {
        return bedNumber;
    }

    public void setBedNumber(String bedNumber) {
        this.bedNumber = bedNumber == null ? null : bedNumber.trim();
    }

    public Integer getBedSort() {
        return bedSort;
    }

    public void setBedSort(Integer bedSort) {
        this.bedSort = bedSort;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName == null ? null : roomName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Integer getBedStatus() {
        return bedStatus;
    }

    public void setBedStatus(Integer bedStatus) {
        this.bedStatus = bedStatus;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    @Override
    public String toString() {
        return "BedInfo{" +
                "bedId=" + bedId +
                ", hospitalId=" + hospitalId +
                ", hospitalName='" + hospitalName + '\'' +
                ", departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                ", infectedPatchId=" + infectedPatchId +
                ", hisCode='" + hisCode + '\'' +
                ", infectedPatchName='" + infectedPatchName + '\'' +
                ", bedName='" + bedName + '\'' +
                ", bedNumber='" + bedNumber + '\'' +
                ", bedSort=" + bedSort +
                ", roomName='" + roomName + '\'' +
                ", createTime=" + createTime +
                ", createBy=" + createBy +
                ", bedStatus=" + bedStatus +
                ", updateTime=" + updateTime +
                ", updateBy=" + updateBy +
                '}';
    }
}