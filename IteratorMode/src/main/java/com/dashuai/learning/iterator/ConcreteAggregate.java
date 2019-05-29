package com.dashuai.learning.iterator;

import com.dashuai.learning.iterator.aggregate.Aggregate;
import com.dashuai.learning.iterator.support.Iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate extends Aggregate {
    private List<Object> items = new ArrayList<>();


    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public int count() {
        return items.size();
    }

    public Object get(int index) {
        return items.get(index);
    }

    public void set(Object object) {
        items.add(object);
    }
}
