package com.dashuai.learning.state.support;

/**
 * Created in 2019.08.12
 *
 * @author Liaozihong
 */
public class Context {
    private State state;

    /**
     * Sets state.
     *
     * @param state the state
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * Request.
     *
     * @param sampleParameter the sample parameter
     */
    public void request(String sampleParameter) {
        state.handle(sampleParameter);
    }
}
