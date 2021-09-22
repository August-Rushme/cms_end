package com.august.cms.mapper;

import com.august.cms.domain.RoleMenus;
import com.august.cms.domain.RoleMenusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleMenusMapper {
    long countByExample(RoleMenusExample example);

    int deleteByExample(RoleMenusExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RoleMenus record);

    int insertSelective(RoleMenus record);

    List<RoleMenus> selectByExample(RoleMenusExample example);

    RoleMenus selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RoleMenus record, @Param("example") RoleMenusExample example);

    int updateByExample(@Param("record") RoleMenus record, @Param("example") RoleMenusExample example);

    int updateByPrimaryKeySelective(RoleMenus record);

    int updateByPrimaryKey(RoleMenus record);
}