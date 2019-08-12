package com.dashuai.learning.prototype.simple.impl;

import com.dashuai.learning.prototype.simple.support.Prototype;

/**
 * Created in 2019.08.12
 *
 * @author Liaozihong
 */
public class ConcretePrototype1 extends Prototype {
    /**
     * Instantiates a new Concrete prototype 1.
     *
     * @param id the id
     */
    public ConcretePrototype1(String id) {
        super(id);
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype1(this.getId());
    }
}
