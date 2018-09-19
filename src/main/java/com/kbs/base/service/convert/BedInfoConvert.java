package com.kbs.base.service.convert;

import com.kbs.base.model.BedInfo;
import com.kbs.base.vo.BedInfoVo;

/**
 * 数据转换类
 *
 * @author Administrator
 */
public class BedInfoConvert {

    public static BedInfoVo convertBedInfo(BedInfo bedInfo) {
        BedInfoVo bedInfoVo = new BedInfoVo();
        if (null != bedInfo) {
            bedInfoVo.setBedId(String.valueOf(bedInfo.getBedId()));
            bedInfoVo.setHospitalId(String.valueOf(bedInfo.getHospitalId()));
            bedInfoVo.setHospitalName(bedInfo.getHospitalName());
            bedInfoVo.setDepartmentId(bedInfo.getDepartmentName());
            bedInfoVo.setDepartmentName(bedInfo.getDepartmentName());
            bedInfoVo.setInfectedPatchId(bedInfo.getInfectedPatchName());
            bedInfoVo.setHisCode(bedInfo.getHisCode());
            bedInfoVo.setInfectedPatchName(bedInfo.getInfectedPatchName());
            bedInfoVo.setBedName(bedInfo.getBedName());
            bedInfoVo.setBedNumber(bedInfo.getBedNumber());
            bedInfoVo.setBedSort(bedInfo.getBedSort());
            bedInfoVo.setRoomName(bedInfo.getRoomName());
        }
        return bedInfoVo;
    }

}
