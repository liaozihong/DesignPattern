package com.dashuai.learning.proxy.jdk.proxy;

import com.dashuai.learning.proxy.jdk.service.UserService;
import com.dashuai.learning.proxy.jdk.service.impl.UserServiceImpl;

/**
 * User service proxy
 * <p/>
 * Created in 2019.06.05
 * <p/>
 *
 * @author Liaozihong
 */
public class UserServiceProxy implements UserService {
    private UserServiceImpl userService;

    /**
     * Instantiates a new User service proxy.
     *
     * @param userService the user service
     */
    public UserServiceProxy(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void request() {
        System.out.println("before ");
        userService.request();
        System.out.println("after");
    }
}
