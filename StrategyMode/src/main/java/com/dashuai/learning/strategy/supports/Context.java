package com.dashuai.learning.strategy.supports;

/**
 * Context
 * Created in 2019.07.17
 *
 * @author Liaozihong
 */
public class Context {
    private Strategy strategy;

    /**
     * Instantiates a new Context.
     *
     * @param strategy the strategy
     */
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Context interface.
     */
    public void contextInterface() {
        strategy.algorithmInterface();
    }
}
