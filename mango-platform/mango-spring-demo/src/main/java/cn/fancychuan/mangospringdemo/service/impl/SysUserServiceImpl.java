package cn.fancychuan.mangospringdemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.fancychuan.mangospringdemo.dao.SysUserMapper;
import cn.fancychuan.mangospringdemo.model.SysUser;
import cn.fancychuan.mangospringdemo.service.SysUserService;

@Service
public class SysUserServiceImpl implements SysUserService {
    
    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> findAll() {
        return sysUserMapper.findAll();
    }
}