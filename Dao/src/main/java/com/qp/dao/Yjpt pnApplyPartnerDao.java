package com.qp.dao;

import com.qp.pojo.Yjpt pnApplyPartner;
import com.qp.pojo.Yjpt pnApplyPartnerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Yjpt pnApplyPartnerDao {
    long countByExample(Yjpt pnApplyPartnerExample example);

    int deleteByExample(Yjpt pnApplyPartnerExample example);

    int deleteByPrimaryKey(Integer partnerid);

    int insert(Yjpt pnApplyPartner record);

    int insertSelective(Yjpt pnApplyPartner record);

    List<Yjpt pnApplyPartner> selectByExample(Yjpt pnApplyPartnerExample example);

    Yjpt pnApplyPartner selectByPrimaryKey(Integer partnerid);

    int updateByExampleSelective(@Param("record") Yjpt pnApplyPartner record, @Param("example") Yjpt pnApplyPartnerExample example);

    int updateByExample(@Param("record") Yjpt pnApplyPartner record, @Param("example") Yjpt pnApplyPartnerExample example);

    int updateByPrimaryKeySelective(Yjpt pnApplyPartner record);

    int updateByPrimaryKey(Yjpt pnApplyPartner record);
}