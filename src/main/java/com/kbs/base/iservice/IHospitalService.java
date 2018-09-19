package com.kbs.base.iservice;

import com.kbs.base.vo.HospitalVo;

/**
 * 医院Service
 *
 * @author fugang
 * @create 2018-08-15 10:54
 **/
public interface IHospitalService {

    /** 
    * @Description: 根据code查询医院
    * @Param:  * @param HospitalCode 
    * @return: com.kbs.common.vo.BaseResponse<com.kbs.base.vo.HospitalVo> 
    * @Author: fugang 
    * @Date: 2018/8/15 18:36
    */ 
    HospitalVo selectByHospitalCode(String HospitalCode);
}
