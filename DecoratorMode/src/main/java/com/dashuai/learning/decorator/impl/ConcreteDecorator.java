package com.dashuai.learning.decorator.impl;

import com.dashuai.learning.decorator.support.Component;
import com.dashuai.learning.decorator.support.Decorator;

/**
 * Concrete decorator
 * <p/>
 * Created in 2019.06.20
 * <p/>
 *
 * @author Liaozihong
 */
public class ConcreteDecorator extends Decorator {
    /**
     * Instantiates a new Concrete decorator.
     *
     * @param component the component
     */
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        attachEvent();
    }

    private void attachEvent() {
        System.out.println("附加功能:坑蒙拐骗");
    }
}
