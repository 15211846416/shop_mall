package com.yi.service;

import com.yi.mapper.SysRoleMapper;
import com.yi.model.SysRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: 小飞
 * @Date: 2019/11/8 16:36
 * @Description:
 */

@Service
public class SysRoleService {
    @Autowired
    private SysRoleMapper roleMapper;

    public SysRole selectById(Integer id){
        return roleMapper.selectById(id);
    }
}