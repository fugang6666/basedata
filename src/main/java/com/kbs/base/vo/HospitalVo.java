package com.kbs.base.vo;

import java.util.Date;

public class HospitalVo {
    private String hospitalId;

    private String hospitalCode;

    private String hospitalFullName;

    private String hospitalSimpleName;

    private String responsiblePerson;

    private Integer departmentCount;

    private Integer bedCount;

    private Integer nurseStationCount;

    private String hisManufacturer;

    private String hospitalDesc;

    private Integer provinceId;

    private String hospitalAddress;

    private String hospitalTel;

    private Integer hospitalLevel;

    private Integer hospitalNature;

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

    public String getHospitalFullName() {
        return hospitalFullName;
    }

    public void setHospitalFullName(String hospitalFullName) {
        this.hospitalFullName = hospitalFullName;
    }

    public String getHospitalSimpleName() {
        return hospitalSimpleName;
    }

    public void setHospitalSimpleName(String hospitalSimpleName) {
        this.hospitalSimpleName = hospitalSimpleName;
    }

    public String getResponsiblePerson() {
        return responsiblePerson;
    }

    public void setResponsiblePerson(String responsiblePerson) {
        this.responsiblePerson = responsiblePerson;
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

    public String getHisManufacturer() {
        return hisManufacturer;
    }

    public void setHisManufacturer(String hisManufacturer) {
        this.hisManufacturer = hisManufacturer;
    }

    public String getHospitalDesc() {
        return hospitalDesc;
    }

    public void setHospitalDesc(String hospitalDesc) {
        this.hospitalDesc = hospitalDesc;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public String getHospitalAddress() {
        return hospitalAddress;
    }

    public void setHospitalAddress(String hospitalAddress) {
        this.hospitalAddress = hospitalAddress;
    }

    public String getHospitalTel() {
        return hospitalTel;
    }

    public void setHospitalTel(String hospitalTel) {
        this.hospitalTel = hospitalTel;
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

    @Override
    public String toString() {
        return "Hospital{" +
                "hospitalId='" + hospitalId + '\'' +
                ", hospitalCode='" + hospitalCode + '\'' +
                ", hospitalFullName='" + hospitalFullName + '\'' +
                ", hospitalSimpleName='" + hospitalSimpleName + '\'' +
                ", responsiblePerson='" + responsiblePerson + '\'' +
                ", departmentCount=" + departmentCount +
                ", bedCount=" + bedCount +
                ", nurseStationCount=" + nurseStationCount +
                ", hisManufacturer='" + hisManufacturer + '\'' +
                ", hospitalDesc='" + hospitalDesc + '\'' +
                ", provinceId=" + provinceId +
                ", hospitalAddress='" + hospitalAddress + '\'' +
                ", hospitalTel='" + hospitalTel + '\'' +
                ", hospitalLevel=" + hospitalLevel +
                ", hospitalNature=" + hospitalNature +
                '}';
    }
}