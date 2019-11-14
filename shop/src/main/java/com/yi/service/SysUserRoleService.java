package com.yi.service;

import com.yi.mapper.SysUserRoleMapper;
import com.yi.model.SysUserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: 小飞
 * @Date: 2019/11/8 16:36
 * @Description:
 */

@Service
public class SysUserRoleService {
    @Autowired
    private SysUserRoleMapper userRoleMapper;

    public List<SysUserRole> listByUserId(Integer userId) {
        return userRoleMapper.listByUserId(userId);
    }
}