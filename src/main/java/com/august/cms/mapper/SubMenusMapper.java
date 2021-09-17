package com.august.cms.mapper;

import com.august.cms.domain.SubMenus;
import com.august.cms.domain.SubMenusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubMenusMapper {
    long countByExample(SubMenusExample example);

    int deleteByExample(SubMenusExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SubMenus record);

    int insertSelective(SubMenus record);

    List<SubMenus> selectByExample(SubMenusExample example);

    SubMenus selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SubMenus record, @Param("example") SubMenusExample example);

    int updateByExample(@Param("record") SubMenus record, @Param("example") SubMenusExample example);

    int updateByPrimaryKeySelective(SubMenus record);

    int updateByPrimaryKey(SubMenus record);
}