package com.yjxxt.service;

public class RoleService {
    private AccountService accountService;

    public RoleService(AccountService accountService) {
        this.accountService = accountService;
    }

    public void test01(){
        accountService.test1();
        System.out.println("RoleService");
    }
}
