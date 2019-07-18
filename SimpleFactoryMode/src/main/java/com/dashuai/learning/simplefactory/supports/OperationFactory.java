package com.dashuai.learning.simplefactory.supports;

import com.dashuai.learning.simplefactory.model.*;

/**
 * Operation factory
 * Created in 2019.07.16
 *
 * @author Liaozihong
 */
public class OperationFactory {
    /**
     * Create operation operation.
     *
     * @param operate the operate
     * @return the operation
     */
    public static Operation createOperation(String operate) {
        Operation operation = null;
        switch (operate) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
        }
        return operation;
    }
}
