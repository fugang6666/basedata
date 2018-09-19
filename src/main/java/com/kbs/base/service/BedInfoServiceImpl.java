package com.kbs.base.service;

import com.kbs.base.dao.BedInfoMapper;
import com.kbs.base.iservice.IBedInfoService;
import com.kbs.base.vo.BedInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 病床service
 *
 * @author fugang
 * @create 2018-08-15 10:52
 **/
@Service
public class BedInfoServiceImpl implements IBedInfoService {


    @Autowired
    private BedInfoMapper bedInfoMapper;

    @Override
    public BedInfoVo selectByBedCode(String hospitalCode, String bedCode) {

     /*   if (StringUtils.isNullOrEmpty(hospitalCode) && StringUtils.isNullOrEmpty(bedCode)) {
            response.setCode("201");
            response.setData(null);
            return response;
        }
       *//* try {
            getCacheDataByMethodName("selectBedInfo",BedInfoVo.class,hospitalCode,bedCode);
        } catch (KBSException e) {
            e.printStackTrace();

        }*//*
        BedInfo bedInfo = bedInfoMapper.selectByBedCode(hospitalCode, bedCode);
        BedInfoVo bedInfoVo = new BedInfoVo();
        if (null != bedInfo) {
            bedInfoVo = BedInfoConvert.convertBedInfo(bedInfo);
        }
        response.setData(bedInfoVo);*/
        return null;
    }
}
