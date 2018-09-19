package com.kbs.base.model;

import java.util.Date;

public class Hospital {
    private Long hospitalId;

    private String hospitalCode;

    private String hospitalFullName;

    private String hospitalSimpleName;

    private String responsiblePerson;

    private Integer departmentCount;

    private Integer bedCount;

    private Integer nurseStationCount;

    private String hospitalUrl;

    private String hisManufacturer;

    private String hospitalDesc;

    private Integer provinceId;

    private Integer cityId;

    private Integer districtId;

    private String hospitalAddress;

    private String hospitalTel;

    private Integer hospitalLevel;

    private Integer hospitalNature;

    private Integer hospitalStatus;

    private Long createBy;

    private Date createTime;

    private Long updateBy;

    private Date updateTime;

    private Boolean isDelete;

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

    public String getHospitalFullName() {
        return hospitalFullName;
    }

    public void setHospitalFullName(String hospitalFullName) {
        this.hospitalFullName = hospitalFullName == null ? null : hospitalFullName.trim();
    }

    public String getHospitalSimpleName() {
        return hospitalSimpleName;
    }

    public void setHospitalSimpleName(String hospitalSimpleName) {
        this.hospitalSimpleName = hospitalSimpleName == null ? null : hospitalSimpleName.trim();
    }

    public String getResponsiblePerson() {
        return responsiblePerson;
    }

    public void setResponsiblePerson(String responsiblePerson) {
        this.responsiblePerson = responsiblePerson == null ? null : responsiblePerson.trim();
    }

    public Integer getDepartmentCount() {
        return departmentCount;
    }

    public void setDepartmentCount(Integer departmentCount) {
        this.departmentCount = departmentCount;
    }

    public Integer getBedCount() {
        return bedCount;
    }

    public void setBedCount(Integer bedCount) {
        this.bedCount = bedCount;
    }

    public Integer getNurseStationCount() {
        return nurseStationCount;
    }

    public void setNurseStationCount(Integer nurseStationCount) {
        this.nurseStationCount = nurseStationCount;
    }

    public String getHospitalUrl() {
        return hospitalUrl;
    }

    public void setHospitalUrl(String hospitalUrl) {
        this.hospitalUrl = hospitalUrl == null ? null : hospitalUrl.trim();
    }

    public String getHisManufacturer() {
        return hisManufacturer;
    }

    public void setHisManufacturer(String hisManufacturer) {
        this.hisManufacturer = hisManufacturer == null ? null : hisManufacturer.trim();
    }

    public String getHospitalDesc() {
        return hospitalDesc;
    }

    public void setHospitalDesc(String hospitalDesc) {
        this.hospitalDesc = hospitalDesc == null ? null : hospitalDesc.trim();
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public String getHospitalAddress() {
        return hospitalAddress;
    }

    public void setHospitalAddress(String hospitalAddress) {
        this.hospitalAddress = hospitalAddress == null ? null : hospitalAddress.trim();
    }

    public String getHospitalTel() {
        return hospitalTel;
    }

    public void setHospitalTel(String hospitalTel) {
        this.hospitalTel = hospitalTel == null ? null : hospitalTel.trim();
    }

    public Integer getHospitalLevel() {
        return hospitalLevel;
    }

    public void setHospitalLevel(Integer hospitalLevel) {
        this.hospitalLevel = hospitalLevel;
    }

    public Integer getHospitalNature() {
        return hospitalNature;
    }

    public void setHospitalNature(Integer hospitalNature) {
        this.hospitalNature = hospitalNature;
    }

    public Integer getHospitalStatus() {
        return hospitalStatus;
    }

    public void setHospitalStatus(Integer hospitalStatus) {
        this.hospitalStatus = hospitalStatus;
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
        return "Hospital{" +
                "hospitalId=" + hospitalId +
                ", hospitalCode='" + hospitalCode + '\'' +
                ", hospitalFullName='" + hospitalFullName + '\'' +
                ", hospitalSimpleName='" + hospitalSimpleName + '\'' +
                ", responsiblePerson='" + responsiblePerson + '\'' +
                ", departmentCount=" + departmentCount +
                ", bedCount=" + bedCount +
                ", nurseStationCount=" + nurseStationCount +
                ", hospitalUrl='" + hospitalUrl + '\'' +
                ", hisManufacturer='" + hisManufacturer + '\'' +
                ", hospitalDesc='" + hospitalDesc + '\'' +
                ", provinceId=" + provinceId +
                ", cityId=" + cityId +
                ", districtId=" + districtId +
                ", hospitalAddress='" + hospitalAddress + '\'' +
                ", hospitalTel='" + hospitalTel + '\'' +
                ", hospitalLevel=" + hospitalLevel +
                ", hospitalNature=" + hospitalNature +
                ", hospitalStatus=" + hospitalStatus +
                ", createBy=" + createBy +
                ", createTime=" + createTime +
                ", updateBy=" + updateBy +
                ", updateTime=" + updateTime +
                ", isDelete=" + isDelete +
                '}';
    }
}