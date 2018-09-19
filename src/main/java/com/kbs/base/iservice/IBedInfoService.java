package com.kbs.base.iservice;

import com.kbs.base.vo.BedInfoVo;

/**
 * 病床service
 *
 * @author fugang
 * @create 2018-08-15 10:52
 **/
public interface IBedInfoService {

   /** 
   * @Description: 根据code查询医院病床
   * @Param:  * @param hospitalCode
 * @param bedCode 
   * @return: com.kbs.common.vo.BaseResponse<com.kbs.base.vo.BedInfoVo> 
   * @Author: fugang 
   * @Date: 2018/8/15 17:23
   */ 
    BedInfoVo  selectByBedCode(String hospitalCode, String bedCode);
}
