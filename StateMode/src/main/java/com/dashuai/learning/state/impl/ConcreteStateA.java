package com.dashuai.learning.state.impl;

import com.dashuai.learning.state.support.State;

public class ConcreteStateA implements State {
    @Override
    public void handle(String sampleParameter) {
        System.out.println("ConcreteStateA handle : " + sampleParameter);
    }
}
