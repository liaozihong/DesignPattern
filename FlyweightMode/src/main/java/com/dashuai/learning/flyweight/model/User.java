package com.dashuai.learning.flyweight.model;

public class User {
    public User(String user) {
        this.user = user;
    }

    private String user;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
