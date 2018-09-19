package com.kbs.base.service;

import com.kbs.base.dao.InfectedPatchMapper;
import com.kbs.base.iservice.IInfectedPatchService;
import com.kbs.base.vo.InfectedPatchVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 病区Service
 *
 * @author fugang
 * @create 2018-08-15 10:55
 **/
@Service
public class InfectedPatchServiceImpl implements IInfectedPatchService {

    @Autowired
    private InfectedPatchMapper infectedPatchMapper;

    @Override
    public InfectedPatchVo selectByInfectedPatchCode(String hospitalCode, String infectedPatchCode) {
        return null;
    }
}
