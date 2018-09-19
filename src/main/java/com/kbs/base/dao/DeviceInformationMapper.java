package com.kbs.base.dao;

import com.kbs.base.model.DeviceInformation;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DeviceInformationMapper {
    int deleteByPrimaryKey(Long deviceInformationId);

    int insert(DeviceInformation record);

    int insertSelective(DeviceInformation record);

    DeviceInformation selectByPrimaryKey(Long deviceInformationId);

    int updateByPrimaryKeySelective(DeviceInformation record);

    int updateByPrimaryKey(DeviceInformation record);

    DeviceInformation selectByDeviceCpu(String deviceCpu);
}