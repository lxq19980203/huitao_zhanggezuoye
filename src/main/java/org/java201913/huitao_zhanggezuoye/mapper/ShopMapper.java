package org.java201913.huitao_zhanggezuoye.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.java201913.huitao_zhanggezuoye.pojo.Shop;
import org.java201913.huitao_zhanggezuoye.pojo.ShopExample;

public interface ShopMapper {
    int countByExample(ShopExample example);

    int deleteByExample(ShopExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(Shop record);

    int insertSelective(Shop record);

    List<Shop> selectByExampleWithRowbounds(ShopExample example, RowBounds rowBounds);

    List<Shop> selectByExample(ShopExample example);

    Shop selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") Shop record, @Param("example") ShopExample example);

    int updateByExample(@Param("record") Shop record, @Param("example") ShopExample example);

    int updateByPrimaryKeySelective(Shop record);

    int updateByPrimaryKey(Shop record);
    List<Shop>  showAll(RowBounds rowBounds);
}