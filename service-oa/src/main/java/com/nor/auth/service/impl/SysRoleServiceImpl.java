package com.nor.auth.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nor.auth.mapper.SysRoleMapper;
import com.nor.auth.service.api.SysRoleService;
import com.nor.model.system.SysRole;
import org.springframework.stereotype.Service;

@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {
}
