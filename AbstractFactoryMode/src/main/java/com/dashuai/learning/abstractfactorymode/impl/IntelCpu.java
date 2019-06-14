package com.dashuai.learning.abstractfactorymode.impl;

import com.dashuai.learning.abstractfactorymode.support.Cpu;

/**
 * Intel cpu
 * <p/>
 * Created in 2019.06.14
 * <p/>
 *
 * @author Liaozihong
 */
public class IntelCpu implements Cpu {
    private int pins = 0;

    /**
     * Instantiates a new Intel cpu.
     *
     * @param pins the pins
     */
    public IntelCpu(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("Intel CPU的针脚数:" + pins);
    }
}
