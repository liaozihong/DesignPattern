package com.dashuai.learning.iterator.aggregate;

import com.dashuai.learning.iterator.support.Iterator;

/**
 * Aggregate
 * Created in 2018.11.27
 * Aggregate 聚集抽象类
 *
 * @author Liaozihong
 */
public abstract class Aggregate {

    /**
     * Create iterator iterable.
     * 创建迭代器
     *
     * @return the iterable
     */
    public abstract Iterator createIterator();
}
