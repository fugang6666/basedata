package com.kbs.base.dao;

import com.kbs.base.model.InfectedPatch;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface InfectedPatchMapper {
    int deleteByPrimaryKey(Long infectedPatchId);

    int insert(InfectedPatch record);

    int insertSelective(InfectedPatch record);

    InfectedPatch selectByPrimaryKey(Long infectedPatchId);

    int updateByPrimaryKeySelective(InfectedPatch record);

    int updateByPrimaryKey(InfectedPatch record);

    InfectedPatch  selectByInfectedPatchCode(@Param("hospitalCode") String hospitalCode, @Param("infectedPatchCode")String infectedPatchCode);
}