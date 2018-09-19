package com.kbs.base.iservice;

import com.kbs.base.vo.InfectedPatchVo;

/**
 * 病区Service
 *
 * @author fugang
 * @create 2018-08-15 10:55
 **/
public interface IInfectedPatchService {

    /** 
    * @Description: 根据code查询医院病区
    * @Param:  * @param hospitalCode
 * @param infectedPatchCode 
    * @return: com.kbs.common.vo.BaseResponse<com.kbs.base.vo.InfectedPatchVo> 
    * @Author: fugang 
    * @Date: 2018/8/15 18:08
    */ 
    InfectedPatchVo selectByInfectedPatchCode(String hospitalCode, String infectedPatchCode);
}
