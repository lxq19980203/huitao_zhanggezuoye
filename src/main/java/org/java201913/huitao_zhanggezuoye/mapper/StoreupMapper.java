package org.java201913.huitao_zhanggezuoye.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.java201913.huitao_zhanggezuoye.pojo.Storeup;
import org.java201913.huitao_zhanggezuoye.pojo.StoreupExample;

public interface StoreupMapper {
    int countByExample(StoreupExample example);

    int deleteByExample(StoreupExample example);

    int deleteByPrimaryKey(Integer coid);

    int insert(Storeup record);

    int insertSelective(Storeup record);

    List<Storeup> selectByExampleWithRowbounds(StoreupExample example, RowBounds rowBounds);

    List<Storeup> selectByExample(StoreupExample example);

    Storeup selectByPrimaryKey(Integer coid);

    int updateByExampleSelective(@Param("record") Storeup record, @Param("example") StoreupExample example);

    int updateByExample(@Param("record") Storeup record, @Param("example") StoreupExample example);

    int updateByPrimaryKeySelective(Storeup record);

    int updateByPrimaryKey(Storeup record);
}