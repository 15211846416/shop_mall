package com.yi.mapper;

import com.yi.model.SysUserRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by 小飞 on 2019/11/8.
 */
@Mapper
public interface SysUserRoleMapper {
    @Select("SELECT * FROM sys_user_role WHERE user_id = #{userId}")
    List<SysUserRole> listByUserId(Integer userId);
}