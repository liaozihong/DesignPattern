package com.dashuai.learning.simplefactory.model;

/**
 * Operation div
 * Created in 2019.07.16
 * 除法类
 *
 * @author Liaozihong
 */
public class OperationDiv extends Operation {

    @Override
    public double getResult() {
        if (getNum2() != 0) {
            return getNum1() / getNum2();
        }
        throw new RuntimeException("除数不能为0!");
    }
}
