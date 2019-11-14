package com.yi.mapper;

import com.yi.model.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created by 小飞 on 2019/11/8.
 */
@Mapper
public interface SysUserMapper {
    @Select("SELECT * FROM sys_user WHERE id = #{id}")
    SysUser selectById(Integer id);

    @Select("SELECT * FROM sys_user WHERE name = #{name}")
    SysUser selectByName(String name);
}