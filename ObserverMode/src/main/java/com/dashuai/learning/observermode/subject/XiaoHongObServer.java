package com.dashuai.learning.observermode.subject;

import com.dashuai.learning.observermode.support.Observer;

public class XiaoHongObServer extends Observer {
    private String name;

    public XiaoHongObServer(String name) {
        this.name = name;
    }

    @Override
    public void stopDoingSomeThing() {
        System.out.println(this.name + ",来人了，你快点假装假装!");
    }
}
