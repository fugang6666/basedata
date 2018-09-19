package com.kbs.base.vo;

import java.util.Date;

public class DepartmentVo {
    private String departmentId;

    private String departmentCode;

    private Integer departmentCategory;

    private String hospitalId;

    private String hospitalCode;

    private String departmentFullName;

    private String departmentSimpleName;

    private String departmentDesc;

    private String parentDepartmentId;

    private String deparmentAddress;

    private Integer bedNumber;

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public Integer getDepartmentCategory() {
        return departmentCategory;
    }

    public void setDepartmentCategory(Integer departmentCategory) {
        this.departmentCategory = departmentCategory;
    }

    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getHospitalCode() {
        return hospitalCode;
    }

    public void setHospitalCode(String hospitalCode) {
        this.hospitalCode = hospitalCode;
    }

    public String getDepartmentFullName() {
        return departmentFullName;
    }

    public void setDepartmentFullName(String departmentFullName) {
        this.departmentFullName = departmentFullName;
    }

    public String getDepartmentSimpleName() {
        return departmentSimpleName;
    }

    public void setDepartmentSimpleName(String departmentSimpleName) {
        this.departmentSimpleName = departmentSimpleName;
    }

    public String getDepartmentDesc() {
        return departmentDesc;
    }

    public void setDepartmentDesc(String departmentDesc) {
        this.departmentDesc = departmentDesc;
    }

    public String getParentDepartmentId() {
        return parentDepartmentId;
    }

    public void setParentDepartmentId(String parentDepartmentId) {
        this.parentDepartmentId = parentDepartmentId;
    }

    public String getDeparmentAddress() {
        return deparmentAddress;
    }

    public void setDeparmentAddress(String deparmentAddress) {
        this.deparmentAddress = deparmentAddress;
    }

    public Integer getBedNumber() {
        return bedNumber;
    }

    public void setBedNumber(Integer bedNumber) {
        this.bedNumber = bedNumber;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId='" + departmentId + '\'' +
                ", departmentCode='" + departmentCode + '\'' +
                ", departmentCategory=" + departmentCategory +
                ", hospitalId='" + hospitalId + '\'' +
                ", hospitalCode='" + hospitalCode + '\'' +
                ", departmentFullName='" + departmentFullName + '\'' +
                ", departmentSimpleName='" + departmentSimpleName + '\'' +
                ", departmentDesc='" + departmentDesc + '\'' +
                ", parentDepartmentId='" + parentDepartmentId + '\'' +
                ", deparmentAddress='" + deparmentAddress + '\'' +
                ", bedNumber=" + bedNumber +
                '}';
    }
}