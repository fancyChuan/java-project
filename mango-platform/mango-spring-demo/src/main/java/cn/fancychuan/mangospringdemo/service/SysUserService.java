package cn.fancychuan.mangospringdemo.service;

import java.util.List;

import cn.fancychuan.mangospringdemo.model.SysUser;

public interface SysUserService {

    /**
     * 查找所有用户
     * @return
     */
    List<SysUser> findAll();

}