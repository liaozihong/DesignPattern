package com.dashuai.learning.simplefactory;

import com.dashuai.learning.simplefactory.model.Operation;
import com.dashuai.learning.simplefactory.supports.OperationFactory;

/**
 * Simple factory application
 * Created in 2019.07.16
 *
 * @author Liaozihong
 */
public class SimpleFactoryApplication {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Operation operation = OperationFactory.createOperation("*");
        operation.setNum1(5);
        operation.setNum2(10);
        System.out.println(operation.getResult());
    }

}
