package com.dashuai.study.designmodel.mementomodel;

import com.dashuai.study.designmodel.mementomodel.memento.Memento;
import com.dashuai.study.designmodel.mementomodel.memento.MementoManager;

/**
 * 备忘录模式
 */
public class MementomodelApplication {
    public static void main(String[] args) {
        Memento memento=new Memento();
        memento.setStatus("init");
        //游戏初始化，并存入备忘录
        memento.setGameStatus(memento.initGame());;
        MementoManager manager=new MementoManager();
        //保存游戏状态,并切换为此状态
        manager.SaveStatus(memento);
        //打印此时游戏状态
        manager.displayStatus();

        //打完boss了
        Memento memento1=new Memento();
        memento1.setStatus("end");
        memento1.setGameStatus(memento1.bossWastage());
        //,并切换为此状态
        manager.SaveStatus(memento1);
        //打印此时游戏状态
        manager.displayStatus();
        //打得不如意，恢复重来
        manager.RecoveryStatus("init");

        manager.displayStatus();
    }

}
