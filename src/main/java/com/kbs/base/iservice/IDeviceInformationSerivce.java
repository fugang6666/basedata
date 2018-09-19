package com.kbs.base.iservice;

import com.kbs.base.vo.DeviceInformationVo;

/**
 * 设备Service
 *
 * @author fugang
 * @create 2018-08-15 10:53
 **/
public interface IDeviceInformationSerivce {

    /** 
    * @Description: 根据cpu查询设备信息
    * @Param:  * @param deviceCpu 
    * @return: com.kbs.common.vo.BaseResponse<com.kbs.base.vo.DeviceInformationVo> 
    * @Author: fugang 
    * @Date: 2018/8/15 18:39
    */ 
    DeviceInformationVo selectByDeviceCpu(String deviceCpu);
}
