package com.dashuai.learning.observermode.subject;

import com.dashuai.learning.observermode.support.Observer;
import com.dashuai.learning.observermode.support.Subject;

import java.util.ArrayList;
import java.util.List;


/**
 * Monitoring subject
 * <p/>
 * Created in 2019.06.12
 * <p/>
 *
 * @author Liaozihong
 */
public class MonitoringSubject implements Subject {

    //观察者列表（所有需要通知的对象都会放到这个集合里）
    private List<Observer> observerList = new ArrayList<Observer>();

    //添加观察者
    @Override
    public void add(Observer observer) {
        observerList.add(observer);
    }

    //移除观察者
    @Override
    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    //通知观察者
    @Override
    public void notifyObserver() {
        for (Observer observer : observerList) {
            //父类执行这个方法，执行的是子类重写的方法
            observer.stopDoingSomeThing();
        }
    }
}
