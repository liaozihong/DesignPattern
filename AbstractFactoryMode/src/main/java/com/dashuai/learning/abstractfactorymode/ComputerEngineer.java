package com.dashuai.learning.abstractfactorymode;

import com.dashuai.learning.abstractfactorymode.support.AbstractFactory;
import com.dashuai.learning.abstractfactorymode.support.Cpu;
import com.dashuai.learning.abstractfactorymode.support.MainBoard;

/**
 * Computer engineer
 * <p/>
 * Created in 2019.06.14
 * <p/>
 *
 * @author Liaozihong
 */
public class ComputerEngineer {
    private Cpu cpu = null;

    private MainBoard mainBoard = null;

    /**
     * Make computer.
     *
     * @param abstractFactory the abstract factory
     */
    public void makeComputer(AbstractFactory abstractFactory) {
        // 准备装机材料
        prepareHardwares(abstractFactory);
        // 其他步骤，暂忽略....
    }

    private void prepareHardwares(AbstractFactory abstractFactory) {
        this.cpu = abstractFactory.createCpu();
        this.mainBoard = abstractFactory.createMainBoard();
        this.cpu.calculate();
        this.mainBoard.installCPU();
    }
}
