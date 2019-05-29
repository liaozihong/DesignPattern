package com.dashuai.learning.iterator;

import com.dashuai.learning.iterator.support.Iterator;

public class ConcreteIterator extends Iterator {
    private ConcreteAggregate aggregate;

    private int current = 0;

    public ConcreteIterator(ConcreteAggregate aggragate) {
        this.aggregate = aggragate;
    }

    @Override
    public Object first() {
        return aggregate.get(0);
    }

    @Override
    public Object Next() {
        Object ret = null;
        current++;
        if (current < aggregate.count()) {
            ret = aggregate.get(current);
        }
        return ret;
    }

    @Override
    public Boolean isDone() {
        return current >= aggregate.count();
    }

    @Override
    public Object CurrentItem() {
        return aggregate.get(current);
    }
}
