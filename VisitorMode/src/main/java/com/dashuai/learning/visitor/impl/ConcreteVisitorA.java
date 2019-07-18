package com.dashuai.learning.visitor.impl;

import com.dashuai.learning.visitor.supports.Visitor;

public class ConcreteVisitorA implements Visitor {

    @Override
    public void visitorConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.printf("%s被%s访问\n", concreteElementA.getClass().getName(), this.getClass().getName());
    }

    @Override
    public void visitorConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.printf("%s被%s访问\n", concreteElementB.getClass().getName(), this.getClass().getName());

    }
}
