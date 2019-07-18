package com.dashuai.learning.strategy.impl;

import com.dashuai.learning.strategy.supports.Strategy;

/**
 * Concrete strategy a
 * Created in 2019.07.17
 *
 * @author Liaozihong
 */
public class ConcreteStrategyA implements Strategy {
    @Override
    public void algorithmInterface() {
        System.out.println("This is arithmetic A");
    }
}
