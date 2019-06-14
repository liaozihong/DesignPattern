package com.dashuai.learning.abstractfactorymode.factory;

import com.dashuai.learning.abstractfactorymode.impl.IntelCpu;
import com.dashuai.learning.abstractfactorymode.impl.IntelMainBoard;
import com.dashuai.learning.abstractfactorymode.support.AbstractFactory;
import com.dashuai.learning.abstractfactorymode.support.Cpu;
import com.dashuai.learning.abstractfactorymode.support.MainBoard;

public class IntelFactory implements AbstractFactory {
    @Override
    public Cpu createCpu() {
        return new IntelCpu(655);
    }

    @Override
    public MainBoard createMainBoard() {
        return new IntelMainBoard(655);
    }
}
