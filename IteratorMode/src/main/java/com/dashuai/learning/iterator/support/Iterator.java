package com.dashuai.learning.iterator.support;

/**
 * Iterator
 * Created in 2018.11.27
 * 迭代器抽象类
 *
 * @author Liaozihong
 */
public abstract class Iterator {
    /**
     * First object.
     * 获取第一个对象
     *
     * @return the object
     */
    public abstract Object first();

    /**
     * Next object.
     * 获取下一个对象
     *
     * @return the object
     */
    public abstract Object Next();

    /**
     * Is done boolean.
     * 当前是否到达结尾
     *
     * @return the boolean
     */
    public abstract Boolean isDone();

    /**
     * Current item object.
     * 当前对象
     *
     * @return the object
     */
    public abstract Object CurrentItem();
}
