package com.dashuai.learning.facademode;


import com.dashuai.learning.facademode.facade.Facade;
import com.dashuai.learning.facademode.model.Event1;
import com.dashuai.learning.facademode.model.Event2;
import com.dashuai.learning.facademode.model.Event3;

/**
 * Facade mode application
 * <p/>
 * Created in 2019.06.13
 * <p/>
 *
 * @author Liaozihong
 */
public class FacadeModeApplication {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        //未使用门面模式时,如果需要完成这三件事，这需要一一操作。
        Event1 event1 = new Event1();
        Event2 event2 = new Event2();
        Event3 event3 = new Event3();
        event1.process();
        event2.process();
        event3.process();

        //使用门面模式
        Facade facade = new Facade();
        facade.open();
    }

}
