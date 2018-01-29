package com.websky.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.websky.pojo.SvrMsgTbl;
import com.websky.pojo.SvrMsgTblExample;

public interface SvrMsgTblMapper {
    int countByExample(SvrMsgTblExample example);

    int deleteByExample(SvrMsgTblExample example);

    int insert(SvrMsgTbl record);

    int insertSelective(SvrMsgTbl record);

    List<SvrMsgTbl> selectByExample(SvrMsgTblExample example);

    int updateByExampleSelective(@Param("record") SvrMsgTbl record, @Param("example") SvrMsgTblExample example);

    int updateByExample(@Param("record") SvrMsgTbl record, @Param("example") SvrMsgTblExample example);
}