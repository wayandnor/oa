package com.nor;

import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.nor.auth.mapper.SysRoleMapper;
import com.nor.model.system.SysRole;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class SysRoleMapperTest {
    @Resource
    SysRoleMapper sysRoleMapper;

    @Test
    public void testSelectList() {
        List<SysRole> users = sysRoleMapper.selectList(null);
        users.forEach(System.out::println);
    }

    @Test
    public void testInsert() {
        SysRole sysRole = new SysRole();
        sysRole.setRoleName("经理");
        sysRole.setRoleCode("manager");
        sysRole.setDescription("经理角色");

        sysRoleMapper.insert(sysRole);
        System.out.println(sysRole.getId());
    }

    @Test
    public void testUpdateByWrapper() {
        UpdateWrapper<SysRole> wrapper = new UpdateWrapper<>();
        LambdaUpdateWrapper<SysRole> lambda = wrapper.lambda();
        lambda.eq(SysRole::getId, 9);

        SysRole sysRole = new SysRole();
        sysRole.setRoleName("经理");
        sysRole.setRoleCode("manager");
        sysRole.setDescription("经");
        sysRoleMapper.update(sysRole, lambda);
    }
}
