package com.dashuai.learning.templatemodel.impl;

import com.dashuai.learning.templatemodel.support.SimpleTemplate;

/**
 * Teacher
 * <p/>
 * Created in 2019.06.17
 * <p/>
 *
 * @author Liaozihong
 */
public class Teacher implements SimpleTemplate {
    @Override
    public void dressUp() {
        System.out.println("穿工作服");
    }

    @Override
    public void eatBreakfast() {
        System.out.println("买早餐，吃早饭");
    }

    @Override
    public void takeThings() {
        System.out.println("搭车去上班!");
    }
}
