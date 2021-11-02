package com.yjxxt.service;

public class AccountService {
    private RoleService roleService;

    public AccountService(RoleService roleService) {
        this.roleService = roleService;
    }

    public void test1(){
        roleService.test01();
        System.out.println("AccountService.....");
    }
}
