package com.dashuai.learning.templatemodel.impl;

import com.dashuai.learning.templatemodel.support.SimpleTemplate;

/**
 * Student
 * <p/>
 * Created in 2019.06.17
 * <p/>
 *
 * @author Liaozihong
 */
public class Student implements SimpleTemplate {
    @Override
    public void dressUp() {
        System.out.println("穿校服");
    }

    @Override
    public void eatBreakfast() {
        System.out.println("吃妈妈做的早饭");
    }

    @Override
    public void takeThings() {
        System.out.println("背书包去上学");
    }
}
