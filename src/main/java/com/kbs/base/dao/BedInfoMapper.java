package com.kbs.base.dao;

import com.kbs.base.model.BedInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BedInfoMapper {
    int deleteByPrimaryKey(Long bedId);

    int insert(BedInfo record);

    int insertSelective(BedInfo record);

    BedInfo selectByPrimaryKey(Long bedId);

    int updateByPrimaryKeySelective(BedInfo record);

    int updateByPrimaryKey(BedInfo record);

    /** 
    * @Description: 根据病床code查询病床信息
    * @Param:  * @param hospitalCode
 * @param bedCode 
    * @return: com.kbs.base.model.BedInfo 
    * @Author: fugang 
    * @Date: 2018/8/15 15:12
    */ 
    BedInfo selectByBedCode(@Param("hospitalCode") String hospitalCode,@Param("bedCode") String bedCode);
}