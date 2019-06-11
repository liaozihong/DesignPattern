package com.dashuai.learning.proxy.jdk.service.impl;

import com.dashuai.learning.proxy.jdk.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public void request() {
        System.out.println("executor method");
    }
}
