package com.dashuai.learning.iterator;

import com.dashuai.learning.iterator.support.Iterator;

public class TestIterator {
    public static void main(String[] args) {
        ConcreteAggregate a = new ConcreteAggregate();
        a.set("大傻");
        a.set("大帅");
        a.set("大本");
        a.set("张三");
        //声明迭代器对象
        Iterator i = new ConcreteIterator(a);
        Object item = i.first();
        System.out.println("正向第一是" + item);
        while (!i.isDone()) {
            System.out.println(String.format("正的排队，%s，轮到你了!", i.CurrentItem()));
            i.Next();
        }

        Iterator descIterator = new ConcreteIteratorDesc(a);
        Object item2 = descIterator.first();
        System.out.println("逆向第一个是" + item2);
        while (!descIterator.isDone()) {
            System.out.println(String.format("任性！反的先，%s,你来!", descIterator.CurrentItem()));
            descIterator.Next();
        }

    }
}

