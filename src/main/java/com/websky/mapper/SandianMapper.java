package com.websky.mapper;

import com.websky.pojo.Sandian;
import com.websky.pojo.SandianExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SandianMapper {
    int countByExample(SandianExample example);

    int deleteByExample(SandianExample example);

    int deleteByPrimaryKey(String itmCd);

    int insert(Sandian record);

    int insertSelective(Sandian record);

    List<Sandian> selectByExample(SandianExample example);

    Sandian selectByPrimaryKey(String itmCd);

    int updateByExampleSelective(@Param("record") Sandian record, @Param("example") SandianExample example);

    int updateByExample(@Param("record") Sandian record, @Param("example") SandianExample example);

    int updateByPrimaryKeySelective(Sandian record);

    int updateByPrimaryKey(Sandian record);
}