package com.dashuai.learning.prototype.register.impl;

import com.dashuai.learning.prototype.register.support.Prototype;

public class ConcretePrototype2 implements Prototype {
    private String name;

    @Override
    public Prototype clone() {
        Prototype prototype = new ConcretePrototype2();
        prototype.setName(this.name);
        return prototype;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ConcretePrototype2 [name=" + name + "]";
    }
}
