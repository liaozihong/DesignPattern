package com.dashuai.learning.facademode.facade;

import com.dashuai.learning.facademode.model.Event1;
import com.dashuai.learning.facademode.model.Event2;
import com.dashuai.learning.facademode.model.Event3;

/**
 * Facade
 * <p/>
 * Created in 2019.06.13
 * <p/>
 * 门面类，封装了具体处理流程
 *
 * @author Liaozihong
 */
public class Facade {
    private Event1 event1;
    private Event2 event2;
    private Event3 event3;

    /**
     * Instantiates a new Facade.
     */
    public Facade() {
        event1 = new Event1();
        event2 = new Event2();
        event3 = new Event3();
    }

    /**
     * Open.
     */
    public void open() {
        event1.process();
        event2.process();
        event3.process();
    }
}
