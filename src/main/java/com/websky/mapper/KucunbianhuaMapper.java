package com.websky.mapper;

import com.websky.pojo.Kucunbianhua;
import com.websky.pojo.KucunbianhuaExample;
import com.websky.pojo.KucunbianhuaKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KucunbianhuaMapper {
    int countByExample(KucunbianhuaExample example);

    int deleteByExample(KucunbianhuaExample example);

    int deleteByPrimaryKey(KucunbianhuaKey key);

    int insert(Kucunbianhua record);

    int insertSelective(Kucunbianhua record);

    List<Kucunbianhua> selectByExample(KucunbianhuaExample example);

    Kucunbianhua selectByPrimaryKey(KucunbianhuaKey key);

    int updateByExampleSelective(@Param("record") Kucunbianhua record, @Param("example") KucunbianhuaExample example);

    int updateByExample(@Param("record") Kucunbianhua record, @Param("example") KucunbianhuaExample example);

    int updateByPrimaryKeySelective(Kucunbianhua record);

    int updateByPrimaryKey(Kucunbianhua record);
}