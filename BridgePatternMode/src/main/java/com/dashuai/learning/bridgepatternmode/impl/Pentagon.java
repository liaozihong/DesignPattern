package com.dashuai.learning.bridgepatternmode.impl;

import com.dashuai.learning.bridgepatternmode.support.Color;
import com.dashuai.learning.bridgepatternmode.support.Shape;

public class Pentagon extends Shape {
    public Pentagon(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.println("Pentagon filled with color");
        color.applyColor();
    }
}
