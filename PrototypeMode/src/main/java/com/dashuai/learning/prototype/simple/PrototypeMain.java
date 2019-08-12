package com.dashuai.learning.prototype.simple;

import com.dashuai.learning.prototype.simple.impl.ConcretePrototype1;
import com.dashuai.learning.prototype.simple.impl.ConcretePrototype2;
import com.dashuai.learning.prototype.simple.support.Prototype;

/**
 * Created in 2019.08.12
 *
 * @author Liaozihong
 */
public class PrototypeMain {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Prototype prototype = new ConcretePrototype1("p1");
        Prototype prototype1 = prototype.clone();
        System.out.println(prototype.getId() + "----" + prototype1.getId());
        System.out.println(prototype + "-------" + prototype1);
        Prototype prototype2 = new ConcretePrototype2("p2");
        Prototype prototype3 = prototype2.clone();
        System.out.println(prototype3.getId());
    }
}
