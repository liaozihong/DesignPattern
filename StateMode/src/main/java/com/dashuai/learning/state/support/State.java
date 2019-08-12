package com.dashuai.learning.state.support;

/**
 * Created in 2019.08.12
 *
 * @author Liaozihong
 */
public interface State {
    /**
     * Handle.
     *
     * @param sampleParameter the sample parameter
     */
    void handle(String sampleParameter);
}
