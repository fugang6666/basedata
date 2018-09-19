package com.kbs.base.iservice;

import com.kbs.base.vo.DepartmentVo;

/**
 * 科室Service
 *
 * @author fugang
 * @create 2018-08-15 10:52
 **/
public interface IDepartmentService {

    /**
    * @Description:  根据code查询医院科室
    * @Param:  * @param hospitalCode
     * @param departmentCode
    * @return: com.kbs.common.vo.BaseResponse<com.kbs.base.vo.DepartmentVo>
    * @Author: fugang
    * @Date: 2018/8/15 17:23
    */
    DepartmentVo selectByDepartmentCode(String hospitalCode, String departmentCode);

}
