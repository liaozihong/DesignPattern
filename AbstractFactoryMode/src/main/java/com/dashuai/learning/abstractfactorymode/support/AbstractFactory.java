package com.dashuai.learning.abstractfactorymode.support;

/**
 * Abstract factory
 * <p/>
 * Created in 2019.06.14
 * <p/>
 *
 * @author Liaozihong
 */
public interface AbstractFactory {
    /**
     * Create cpu cpu.
     *
     * @return the cpu
     */
    Cpu createCpu();

    /**
     * Create main board main board.
     *
     * @return the main board
     */
    MainBoard createMainBoard();
}
