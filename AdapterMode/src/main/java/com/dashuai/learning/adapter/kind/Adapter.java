package com.dashuai.learning.adapter.kind;

public class Adapter extends Adaptee implements Target {
    @Override
    public void sampleOperation2() {
        System.out.println("make up two");
    }
}
