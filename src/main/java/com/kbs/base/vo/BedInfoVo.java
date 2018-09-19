package com.kbs.base.vo;

import java.util.Date;

public class BedInfoVo {
    private String bedId;

    private String hospitalId;

    private String hospitalName;

    private String departmentId;

    private String departmentName;

    private String infectedPatchId;

    private String hisCode;

    private String infectedPatchName;

    private String bedName;

    private String bedNumber;

    private Integer bedSort;

    private String roomName;

    public String getBedId() {
        return bedId;
    }

    public void setBedId(String bedId) {
        this.bedId = bedId;
    }

    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getInfectedPatchId() {
        return infectedPatchId;
    }

    public void setInfectedPatchId(String infectedPatchId) {
        this.infectedPatchId = infectedPatchId;
    }

    public String getHisCode() {
        return hisCode;
    }

    public void setHisCode(String hisCode) {
        this.hisCode = hisCode;
    }

    public String getInfectedPatchName() {
        return infectedPatchName;
    }

    public void setInfectedPatchName(String infectedPatchName) {
        this.infectedPatchName = infectedPatchName;
    }

    public String getBedName() {
        return bedName;
    }

    public void setBedName(String bedName) {
        this.bedName = bedName;
    }

    public String getBedNumber() {
        return bedNumber;
    }

    public void setBedNumber(String bedNumber) {
        this.bedNumber = bedNumber;
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
        this.roomName = roomName;
    }

    @Override
    public String toString() {
        return "BedInfo{" +
                "bedId='" + bedId + '\'' +
                ", hospitalId='" + hospitalId + '\'' +
                ", hospitalName='" + hospitalName + '\'' +
                ", departmentId='" + departmentId + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", infectedPatchId='" + infectedPatchId + '\'' +
                ", hisCode='" + hisCode + '\'' +
                ", infectedPatchName='" + infectedPatchName + '\'' +
                ", bedName='" + bedName + '\'' +
                ", bedNumber='" + bedNumber + '\'' +
                ", bedSort=" + bedSort +
                ", roomName='" + roomName + '\'' +
                '}';
    }
}