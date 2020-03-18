package org.java201913.huitao_zhanggezuoye.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.java201913.huitao_zhanggezuoye.pojo.ShopImg;
import org.java201913.huitao_zhanggezuoye.pojo.ShopImgExample;

public interface ShopImgMapper {
    int countByExample(ShopImgExample example);

    int deleteByExample(ShopImgExample example);

    int deleteByPrimaryKey(Integer siid);

    int insert(ShopImg record);

    int insertSelective(ShopImg record);

    List<ShopImg> selectByExampleWithRowbounds(ShopImgExample example, RowBounds rowBounds);

    List<ShopImg> selectByExample(ShopImgExample example);

    ShopImg selectByPrimaryKey(Integer siid);

    int updateByExampleSelective(@Param("record") ShopImg record, @Param("example") ShopImgExample example);

    int updateByExample(@Param("record") ShopImg record, @Param("example") ShopImgExample example);

    int updateByPrimaryKeySelective(ShopImg record);

    int updateByPrimaryKey(ShopImg record);
}