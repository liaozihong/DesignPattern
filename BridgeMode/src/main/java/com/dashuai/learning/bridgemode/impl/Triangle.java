package com.dashuai.learning.bridgemode.impl;

import com.dashuai.learning.bridgemode.support.Color;
import com.dashuai.learning.bridgemode.support.Shape;

public class Triangle extends Shape {

    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.println("Triangle filled with color ");
        color.applyColor();
    }
}
