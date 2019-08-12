package com.dashuai.learning.prototype.register.support;

public interface Prototype {
    Prototype clone();

    String getName();

    void setName(String name);
}
