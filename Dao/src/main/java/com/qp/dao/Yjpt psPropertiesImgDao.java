package com.qp.dao;

import com.qp.pojo.Yjpt psPropertiesImg;
import com.qp.pojo.Yjpt psPropertiesImgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Yjpt psPropertiesImgDao {
    long countByExample(Yjpt psPropertiesImgExample example);

    int deleteByExample(Yjpt psPropertiesImgExample example);

    int deleteByPrimaryKey(Integer gid);

    int insert(Yjpt psPropertiesImg record);

    int insertSelective(Yjpt psPropertiesImg record);

    List<Yjpt psPropertiesImg> selectByExample(Yjpt psPropertiesImgExample example);

    Yjpt psPropertiesImg selectByPrimaryKey(Integer gid);

    int updateByExampleSelective(@Param("record") Yjpt psPropertiesImg record, @Param("example") Yjpt psPropertiesImgExample example);

    int updateByExample(@Param("record") Yjpt psPropertiesImg record, @Param("example") Yjpt psPropertiesImgExample example);

    int updateByPrimaryKeySelective(Yjpt psPropertiesImg record);

    int updateByPrimaryKey(Yjpt psPropertiesImg record);
}