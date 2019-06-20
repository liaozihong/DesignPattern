package com.dashuai.learning.decorator;


import com.dashuai.learning.decorator.impl.ConcreteComponent;
import com.dashuai.learning.decorator.impl.ConcreteDecorator;
import com.dashuai.learning.decorator.support.Component;
import com.dashuai.learning.decorator.support.Decorator;

/**
 * Decorator application
 * <p/>
 * Created in 2019.06.20
 * <p/>
 *
 * @author Liaozihong
 */
public class DecoratorApplication {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component.operation();
        System.out.println("装饰加强后:-------------------------------------------------");
        Decorator decorator = new ConcreteDecorator(component);
        decorator.operation();
    }

}
