package com.yi.service;

import com.yi.mapper.SysUserMapper;
import com.yi.model.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: 小飞
 * @Date: 2019/11/8 16:35
 * @Description:
 */

@Service
public class SysUserService {
    @Autowired
    private SysUserMapper userMapper;

    public SysUser selectById(Integer id) {
        return userMapper.selectById(id);
    }

    public SysUser selectByName(String name) {
        return userMapper.selectByName(name);
    }
}