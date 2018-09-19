package com.kbs.base.service;

import com.kbs.base.dao.HospitalMapper;
import com.kbs.base.iservice.IHospitalService;
import com.kbs.base.vo.HospitalVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 医院Service
 *
 * @author fugang
 * @create 2018-08-15 10:54
 **/
@Service
public class HospitalServiceImpl implements IHospitalService {

    @Autowired
    private HospitalMapper hospitalMapper;


    @Override
    public HospitalVo selectByHospitalCode(String HospitalCode) {
        return null;
    }
}

