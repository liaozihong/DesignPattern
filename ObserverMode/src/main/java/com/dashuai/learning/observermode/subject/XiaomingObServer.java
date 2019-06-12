package com.dashuai.learning.observermode.subject;

import com.dashuai.learning.observermode.support.Observer;

public class XiaomingObServer extends Observer {
    private String name;

    public XiaomingObServer(String name) {
        this.name = name;
    }

    @Override
    public void stopDoingSomeThing() {
        System.out.println(this.name + ",来人了，快点假装假装!");
    }
}
