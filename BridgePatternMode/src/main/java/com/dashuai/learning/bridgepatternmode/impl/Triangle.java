package com.dashuai.learning.bridgepatternmode.impl;

import com.dashuai.learning.bridgepatternmode.support.Color;
import com.dashuai.learning.bridgepatternmode.support.Shape;

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
