package com.dashuai.learning.abstractfactorymode.impl;

import com.dashuai.learning.abstractfactorymode.support.MainBoard;

public class AmdMainBoard implements MainBoard {

    /**
     * CPU插槽的孔数
     */
    private int cpuHoles = 0;

    /**
     * 构造方法，传入CPU插槽的孔数
     *
     * @param cpuHoles
     */
    public AmdMainBoard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCPU() {
        // TODO Auto-generated method stub
        System.out.println("AMD 主板的CPU插槽孔数是：" + cpuHoles);
    }
}
