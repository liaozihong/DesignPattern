package com.dashuai.learning.abstractfactorymode.factory;

import com.dashuai.learning.abstractfactorymode.impl.AmdCpu;
import com.dashuai.learning.abstractfactorymode.impl.AmdMainBoard;
import com.dashuai.learning.abstractfactorymode.support.AbstractFactory;
import com.dashuai.learning.abstractfactorymode.support.Cpu;
import com.dashuai.learning.abstractfactorymode.support.MainBoard;

/**
 * Amd factory
 * <p/>
 * Created in 2019.06.14
 * <p/>
 *
 * @author Liaozihong
 */
public class AmdFactory implements AbstractFactory {
    @Override
    public Cpu createCpu() {
        return new AmdCpu(987);
    }

    @Override
    public MainBoard createMainBoard() {
        return new AmdMainBoard(987);
    }
}
