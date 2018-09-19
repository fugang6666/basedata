package com.kbs.base.model;

import java.util.Date;

public class Department {
    private Long departmentId;

    private String departmentCode;

    private Integer departmentCategory;

    private Long hospitalId;

    private String hospitalCode;

    private String departmentFullName;

    private String departmentSimpleName;

    private String departmentDesc;

    private Long parentDepartmentId;

    private String deparmentAddress;

    private Boolean isCharacteristicDepartment;

    private Boolean isDelete;

    private Long createBy;

    private Date createTime;

    private Long updateBy;

    private Date updateTime;

    private Integer bedNumber;

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode == null ? null : departmentCode.trim();
    }

    public Integer getDepartmentCategory() {
        return departmentCategory;
    }

    public void setDepartmentCategory(Integer departmentCategory) {
        this.departmentCategory = departmentCategory;
    }

    public Long getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Long hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getHospitalCode() {
        return hospitalCode;
    }

    public void setHospitalCode(String hospitalCode) {
        this.hospitalCode = hospitalCode == null ? null : hospitalCode.trim();
    }

    public String getDepartmentFullName() {
        return departmentFullName;
    }

    public void setDepartmentFullName(String departmentFullName) {
        this.departmentFullName = departmentFullName == null ? null : departmentFullName.trim();
    }

    public String getDepartmentSimpleName() {
        return departmentSimpleName;
    }

    public void setDepartmentSimpleName(String departmentSimpleName) {
        this.departmentSimpleName = departmentSimpleName == null ? null : departmentSimpleName.trim();
    }

    public String getDepartmentDesc() {
        return departmentDesc;
    }

    public void setDepartmentDesc(String departmentDesc) {
        this.departmentDesc = departmentDesc == null ? null : departmentDesc.trim();
    }

    public Long getParentDepartmentId() {
        return parentDepartmentId;
    }

    public void setParentDepartmentId(Long parentDepartmentId) {
        this.parentDepartmentId = parentDepartmentId;
    }

    public String getDeparmentAddress() {
        return deparmentAddress;
    }

    public void setDeparmentAddress(String deparmentAddress) {
        this.deparmentAddress = deparmentAddress == null ? null : deparmentAddress.trim();
    }

    public Boolean getIsCharacteristicDepartment() {
        return isCharacteristicDepartment;
    }

    public void setIsCharacteristicDepartment(Boolean isCharacteristicDepartment) {
        this.isCharacteristicDepartment = isCharacteristicDepartment;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
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

    public Integer getBedNumber() {
        return bedNumber;
    }

    public void setBedNumber(Integer bedNumber) {
        this.bedNumber = bedNumber;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", departmentCode='" + departmentCode + '\'' +
                ", departmentCategory=" + departmentCategory +
                ", hospitalId=" + hospitalId +
                ", hospitalCode='" + hospitalCode + '\'' +
                ", departmentFullName='" + departmentFullName + '\'' +
                ", departmentSimpleName='" + departmentSimpleName + '\'' +
                ", departmentDesc='" + departmentDesc + '\'' +
                ", parentDepartmentId=" + parentDepartmentId +
                ", deparmentAddress='" + deparmentAddress + '\'' +
                ", isCharacteristicDepartment=" + isCharacteristicDepartment +
                ", isDelete=" + isDelete +
                ", createBy=" + createBy +
                ", createTime=" + createTime +
                ", updateBy=" + updateBy +
                ", updateTime=" + updateTime +
                ", bedNumber=" + bedNumber +
                '}';
    }
}