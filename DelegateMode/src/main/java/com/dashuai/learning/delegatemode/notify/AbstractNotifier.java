package com.dashuai.learning.delegatemode.notify;

import com.dashuai.learning.delegatemode.handler.EventHandler;

/**
 * Notifier
 * <p/>
 * Created in 2019.06.12
 * <p/>
 *
 * @author Liaozihong
 */
public abstract class AbstractNotifier {
    private EventHandler eventHandler = new EventHandler();

    /**
     * Gets event handler.
     *
     * @return the event handler
     */
    public EventHandler getEventHandler() {
        return eventHandler;
    }

    /**
     * Sets event handler.
     *
     * @param eventHandler the event handler
     */
    public void setEventHandler(EventHandler eventHandler) {
        this.eventHandler = eventHandler;
    }

    /**
     * Add listener.
     *
     * @param object     the object
     * @param methodName the method name
     * @param args       the args
     */
    public abstract void addListener(Object object, String methodName, Object... args);

    /**
     * Notify x.
     */
    public abstract void notifyX();
}
