package com.dashuai.learning.flyweight.impl;

import com.dashuai.learning.flyweight.model.User;
import com.dashuai.learning.flyweight.supports.WebSite;

public class ConcreteWebSite extends WebSite {
    private String name;

    public ConcreteWebSite(String name) {
        this.name = name;
    }

    @Override
    public void user(User user) {
        System.out.println("网站分类：" + name + " 用户: " + name);
    }
}
