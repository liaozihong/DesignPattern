package com.dashuai.learning.prototype.register;


import com.dashuai.learning.prototype.register.impl.ConcretePrototype1;
import com.dashuai.learning.prototype.register.impl.ConcretePrototype2;
import com.dashuai.learning.prototype.register.support.Prototype;

public class PrototypeApplication {

    public static void main(String[] args) {
        try {
            // 创建第一个实例
            Prototype p1 = new ConcretePrototype1();
            // 注册第一个实例
            PrototypeManager.setProtoType("p1", p1);

            // 克隆第一个实例的原型
            Prototype p3 = PrototypeManager.getPrototype("p1").clone();
            p3.setName("张三");
            System.out.println("第一个实例的副本：" + p3);

            // 创建第二个实例
            Prototype p2 = new ConcretePrototype2();
            // 注册第二个实例
            PrototypeManager.setProtoType("p2", p2);

            // 克隆第二个实例的原型
            Prototype p4 = PrototypeManager.getPrototype("p2").clone();
            p4.setName("李四");
            System.out.println("第二个实例的副本：" + p4);

            // 注销第一个实例
            PrototypeManager.removePrototype("p1");
            // 再次克隆第一个实例的原型
            Prototype p5 = PrototypeManager.getPrototype("p1").clone();
            p5.setName("王五");
            System.out.println("第一个实例的副本：" + p5);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
