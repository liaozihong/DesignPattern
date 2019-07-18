package com.dashuai.learning.visitor.impl;

import com.dashuai.learning.visitor.supports.Element;
import com.dashuai.learning.visitor.supports.Visitor;

public class ConcreteElementA implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitorConcreteElementA(this);
    }
}
