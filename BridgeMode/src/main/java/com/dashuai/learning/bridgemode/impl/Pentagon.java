package com.dashuai.learning.bridgemode.impl;

import com.dashuai.learning.bridgemode.support.Color;
import com.dashuai.learning.bridgemode.support.Shape;

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
