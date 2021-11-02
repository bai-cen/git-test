package com.yjxxt;

import com.yjxxt.service.AccountService;
import com.yjxxt.service.RoleService;
import com.yjxxt.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext sc = new ClassPathXmlApplicationContext("spring.xml");

        UserService s = sc.getBean("userService",UserService.class);

        s.test2();

        AccountService accountService = sc.getBean("accountService",AccountService.class);

        accountService.test1();

        RoleService roleService = sc.getBean("roleService",RoleService.class);

        roleService.test01();
    }
}
