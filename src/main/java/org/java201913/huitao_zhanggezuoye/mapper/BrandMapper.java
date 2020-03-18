package org.java201913.huitao_zhanggezuoye.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.java201913.huitao_zhanggezuoye.pojo.Brand;
import org.java201913.huitao_zhanggezuoye.pojo.BrandExample;

public interface BrandMapper {
    int countByExample(BrandExample example);

    int deleteByExample(BrandExample example);

    int deleteByPrimaryKey(Integer bid);

    int insert(Brand record);

    int insertSelective(Brand record);

    List<Brand> selectByExampleWithRowbounds(BrandExample example, RowBounds rowBounds);

    List<Brand> selectByExample(BrandExample example);

    Brand selectByPrimaryKey(Integer bid);

    int updateByExampleSelective(@Param("record") Brand record, @Param("example") BrandExample example);

    int updateByExample(@Param("record") Brand record, @Param("example") BrandExample example);

    int updateByPrimaryKeySelective(Brand record);

    int updateByPrimaryKey(Brand record);
}