package com.dashuai.learning.templatemodel.support;

/**
 * Simple template
 * <p/>
 * Created in 2019.06.17
 * <p/>
 *
 * @author Liaozihong
 */
public interface SimpleTemplate {
    /**
     * Prepare gote school.
     */
    default void prepareGoteSchool() {
        dressUp();
        eatBreakfast();
        takeThings();
    }

    /**
     * Dress up.
     */
    void dressUp();

    /**
     * Eat breakfast.
     */
    void eatBreakfast();

    /**
     * Take things.
     */
    void takeThings();

}
