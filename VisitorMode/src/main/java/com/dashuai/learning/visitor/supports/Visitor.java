package com.dashuai.learning.visitor.supports;

import com.dashuai.learning.visitor.impl.ConcreteElementA;
import com.dashuai.learning.visitor.impl.ConcreteElementB;

public interface Visitor {
    void visitorConcreteElementA(ConcreteElementA concreteElementA);

    void visitorConcreteElementB(ConcreteElementB concreteElementB);
}
