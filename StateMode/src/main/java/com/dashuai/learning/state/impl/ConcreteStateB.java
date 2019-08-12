package com.dashuai.learning.state.impl;

import com.dashuai.learning.state.support.State;

public class ConcreteStateB implements State {
    @Override
    public void handle(String sampleParameter) {
        System.out.println("ConcreteStateB handle : " + sampleParameter);
    }
}
