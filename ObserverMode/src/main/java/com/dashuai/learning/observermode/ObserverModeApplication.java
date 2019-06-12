package com.dashuai.learning.observermode;


import com.dashuai.learning.observermode.subject.MonitoringSubject;
import com.dashuai.learning.observermode.subject.XiaoHongObServer;
import com.dashuai.learning.observermode.subject.XiaomingObServer;

public class ObserverModeApplication {

    public static void main(String[] args) {
        MonitoringSubject subject = new MonitoringSubject();
        XiaomingObServer xiaomingObServer = new XiaomingObServer("小明");
        XiaoHongObServer xiaoHongObServer = new XiaoHongObServer("小红");
        subject.add(xiaomingObServer);
        subject.add(xiaoHongObServer);
        subject.notifyObserver();

    }


}
