package org.java201913.huitao_zhanggezuoye.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.java201913.huitao_zhanggezuoye.pojo.Check;
import org.java201913.huitao_zhanggezuoye.pojo.CheckExample;

public interface CheckMapper {
    int countByExample(CheckExample example);

    int deleteByExample(CheckExample example);

    int deleteByPrimaryKey(Integer chid);

    int insert(Check record);

    int insertSelective(Check record);

    List<Check> selectByExampleWithRowbounds(CheckExample example, RowBounds rowBounds);

    List<Check> selectByExample(CheckExample example);

    Check selectByPrimaryKey(Integer chid);

    int updateByExampleSelective(@Param("record") Check record, @Param("example") CheckExample example);

    int updateByExample(@Param("record") Check record, @Param("example") CheckExample example);

    int updateByPrimaryKeySelective(Check record);

    int updateByPrimaryKey(Check record);
}