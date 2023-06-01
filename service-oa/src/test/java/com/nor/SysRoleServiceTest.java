package com.nor;

import com.nor.auth.service.api.SysRoleService;
import com.nor.model.system.SysRole;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SysRoleServiceTest {
    @Resource
    SysRoleService roleService;
    @Test
    public void testSave() {
        SysRole sysRole = new SysRole();
        sysRole.setRoleName("经理");
        sysRole.setRoleCode("manager");
        sysRole.setDescription("经理角色");
        roleService.save(sysRole);
    }
}
