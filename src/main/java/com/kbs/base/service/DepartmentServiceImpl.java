package com.kbs.base.service;

import com.kbs.base.dao.DepartmentMapper;
import com.kbs.base.iservice.IDepartmentService;
import com.kbs.base.vo.DepartmentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 科室Service
 *
 * @author fugang
 * @create 2018-08-15 10:52
 **/
@Service
public class DepartmentServiceImpl implements IDepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;


    @Override
    public DepartmentVo selectByDepartmentCode(String hospitalCode, String departmentCode) {
        return null;
    }
}
