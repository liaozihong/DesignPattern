package com.dashuai.learning.bridgepatternmode.impl;

import com.dashuai.learning.bridgepatternmode.support.Color;

public class GreenColor implements Color {
    @Override
    public void applyColor() {
        System.out.println("Green ........");
    }
}
