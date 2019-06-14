package com.dashuai.learning.abstractfactorymode.impl;

import com.dashuai.learning.abstractfactorymode.support.Cpu;

/**
 * Amd cpu
 * <p/>
 * Created in 2019.06.14
 * <p/>
 *
 * @author Liaozihong
 */
public class AmdCpu implements Cpu {
    private int pins = 0;

    /**
     * Instantiates a new Amd cpu.
     *
     * @param pins the pins
     */
    public AmdCpu(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("Amd CPU的针脚数:" + pins);
    }
}
