package com.dashuai.learning.simplefactory.model;

public class OperationMul extends Operation {

    @Override
    public double getResult() {
        return getNum1() * getNum2();
    }
}
