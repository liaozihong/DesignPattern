package com.dashuai.study.designmodel.mementomodel.memento;


import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

/**
 * 备忘录管理器
 */
public class MementoManager {

    private Memento memento;
    /**
     * 存放备忘录，及对应得状态。如果真实用到，也可存于缓存中
     */
    private List<Memento> mementoList = new ArrayList<>();

    /**
     * 保存特定状态
     *
     * @param memento
     */
    public void SaveStatus(Memento memento) {
        this.mementoList.add(memento);
        this.memento = memento;
    }

    /**
     * 显示当前状态
     */
    public void displayStatus() {
        System.out.println("当前状态为:" + this.memento.getStatus()
                + "，各项指标为：" + new Gson().toJson(this.memento.getGameStatus()));
    }

    /**
     * 恢复到特定状态
     *
     * @param status
     * @return
     */
    public void RecoveryStatus(String status) {
        this.memento = this.mementoList.stream().filter(x -> x.getStatus().equals(status)).findAny().get();
    }

    public Memento getMemento() {
        return this.memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
