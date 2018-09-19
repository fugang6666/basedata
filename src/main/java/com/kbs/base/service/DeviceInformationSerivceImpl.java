package com.kbs.base.service;

import com.kbs.base.dao.DeviceInformationMapper;
import com.kbs.base.iservice.IDeviceInformationSerivce;
import com.kbs.base.vo.DeviceInformationVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 设备Service
 *
 * @author fugang
 * @create 2018-08-15 10:53
 **/
@Service
public class DeviceInformationSerivceImpl implements IDeviceInformationSerivce {

    @Autowired
    private DeviceInformationMapper deviceInformationMapper;


    @Override
    public DeviceInformationVo selectByDeviceCpu(String deviceCpu) {
        return null;
    }
}
