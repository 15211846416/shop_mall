package com.yi.mapper;

import com.yi.model.SysRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created by 小飞 on 2019/11/8.
 */
@Mapper
public interface SysRoleMapper {
    @Select("SELECT * FROM sys_role WHERE id = #{id}")
    SysRole selectById(Integer id);
}