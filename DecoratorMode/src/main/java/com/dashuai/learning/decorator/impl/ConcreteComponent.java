package com.dashuai.learning.decorator.impl;

import com.dashuai.learning.decorator.support.Component;

/**
 * Concrete component
 * <p/>
 * Created in 2019.06.20
 * <p/>
 *
 * @author Liaozihong
 */
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("基础功能:吃喝拉撒");
    }
}
