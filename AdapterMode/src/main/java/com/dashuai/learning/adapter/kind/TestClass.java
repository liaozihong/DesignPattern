package com.dashuai.learning.adapter.kind;

public class TestClass {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.sampleOperation1();
        target.sampleOperation2();
    }
}
