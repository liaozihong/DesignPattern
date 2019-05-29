package com.dashuai.learning.iterator;

import com.dashuai.learning.iterator.support.Iterator;

public class ConcreteIteratorDesc extends Iterator {

    private ConcreteAggregate concreteAggregate;

    private int current = 0;

    public ConcreteIteratorDesc(ConcreteAggregate concreteAggregate) {
        this.concreteAggregate = concreteAggregate;
        current = concreteAggregate.count() - 1;
    }

    @Override
    public Object first() {
        return concreteAggregate.get(concreteAggregate.count() - 1);
    }

    @Override
    public Object Next() {
        Object ret = null;
        current--;
        if (current >= 0) {
            ret = concreteAggregate.get(current);
        }
        return ret;
    }

    @Override
    public Boolean isDone() {
        return current < 0;
    }

    @Override
    public Object CurrentItem() {
        return concreteAggregate.get(current);
    }
}
