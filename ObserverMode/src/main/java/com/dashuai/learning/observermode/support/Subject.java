package com.dashuai.learning.observermode.support;


/**
 * Subject
 * <p/>
 * Created in 2019.06.12
 * <p/>
 *
 * @author Liaozihong
 */
public interface Subject {
    /**
     * Add.
     *
     * @param observer the observer
     */
    public void add(Observer observer);

    /**
     * Remove.
     *
     * @param observer the observer
     */
    public void remove(Observer observer);

    /**
     * Notify observer.
     */
    public void notifyObserver();
}
