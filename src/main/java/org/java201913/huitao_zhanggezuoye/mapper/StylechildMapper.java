package org.java201913.huitao_zhanggezuoye.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.java201913.huitao_zhanggezuoye.pojo.Stylechild;
import org.java201913.huitao_zhanggezuoye.pojo.StylechildExample;

public interface StylechildMapper {
    int countByExample(StylechildExample example);

    int deleteByExample(StylechildExample example);

    int deleteByPrimaryKey(Integer stcid);

    int insert(Stylechild record);

    int insertSelective(Stylechild record);

    List<Stylechild> selectByExampleWithRowbounds(StylechildExample example, RowBounds rowBounds);

    List<Stylechild> selectByExample(StylechildExample example);

    Stylechild selectByPrimaryKey(Integer stcid);

    int updateByExampleSelective(@Param("record") Stylechild record, @Param("example") StylechildExample example);

    int updateByExample(@Param("record") Stylechild record, @Param("example") StylechildExample example);

    int updateByPrimaryKeySelective(Stylechild record);

    int updateByPrimaryKey(Stylechild record);
    List<Stylechild> showAll(RowBounds rowBounds);
}