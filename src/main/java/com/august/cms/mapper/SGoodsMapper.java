package com.august.cms.mapper;

import com.august.cms.domain.SGoods;
import com.august.cms.domain.SGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SGoodsMapper {
    long countByExample(SGoodsExample example);

    int deleteByExample(SGoodsExample example);

    int deleteByPrimaryKey(Integer goodsId);

    int insert(SGoods record);

    int insertSelective(SGoods record);

    List<SGoods> selectByExample(SGoodsExample example);

    SGoods selectByPrimaryKey(Integer goodsId);

    int updateByExampleSelective(@Param("record") SGoods record, @Param("example") SGoodsExample example);

    int updateByExample(@Param("record") SGoods record, @Param("example") SGoodsExample example);

    int updateByPrimaryKeySelective(SGoods record);

    int updateByPrimaryKey(SGoods record);
}