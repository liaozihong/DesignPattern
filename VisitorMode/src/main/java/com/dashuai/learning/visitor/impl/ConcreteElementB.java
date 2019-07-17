package com.dashuai.learning.visitor.impl;

import com.dashuai.learning.visitor.supports.Element;
import com.dashuai.learning.visitor.supports.Visitor;

public class ConcreteElementB implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitorConcreteElementB(this);
    }
}
