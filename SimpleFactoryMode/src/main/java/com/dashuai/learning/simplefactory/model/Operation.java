package com.dashuai.learning.simplefactory.model;

/**
 * Operation
 * Created in 2019.07.16
 *
 * @author Liaozihong
 */
public abstract class Operation {
    private double num1;
    private double num2;

    /**
     * Gets num 1.
     *
     * @return the num 1
     */
    public double getNum1() {
        return num1;
    }

    /**
     * Sets num 1.
     *
     * @param num1 the num 1
     */
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    /**
     * Gets num 2.
     *
     * @return the num 2
     */
    public double getNum2() {
        return num2;
    }

    /**
     * Sets num 2.
     *
     * @param num2 the num 2
     */
    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public abstract double getResult();
}
