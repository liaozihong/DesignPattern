package com.dashuai.learning.adapter.object;


public class AdapterApplication {

    public static void main(String[] args) {
        Target target = new Adapter(new Adaptee());
        target.sampleOperation1();
        target.sampleOperation2();
    }

}
