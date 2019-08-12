package com.dashuai.learning.prototype.simple.impl;

import com.dashuai.learning.prototype.simple.support.Prototype;

public class ConcretePrototype2 extends Prototype {
    public ConcretePrototype2(String id) {
        super(id);
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype2(this.getId());
    }
}
