package com.dashuai.learning.delegatemode.handler;

import com.dashuai.learning.delegatemode.event.Event;

import java.util.ArrayList;
import java.util.List;

/**
 * Event handler
 * <p/>
 * Created in 2019.06.12
 * <p/>
 *
 * @author Liaozihong
 */
public class EventHandler {
    private List<Event> objects;

    /**
     * Instantiates a new Event handler.
     */
    public EventHandler() {
        objects = new ArrayList<>();
    }

    /**
     * Add event.
     *
     * @param object     the object
     * @param methodName the method name
     * @param args       the args
     */
    public void addEvent(Object object, String methodName, Object... args) {
        objects.add(new Event(object, methodName, args));
    }

    /**
     * Notify x.
     *
     * @throws Exception the exception
     */
    public void notifyX() throws Exception {
        for (Event event : objects) {
            event.invoke();
        }
    }
}
