package com.dashuai.learning.mediator;


import com.dashuai.learning.mediator.impl.ColleagueA;
import com.dashuai.learning.mediator.impl.ColleagueB;
import com.dashuai.learning.mediator.impl.Mediator;
import com.dashuai.learning.mediator.supports.AbstractColleague;
import com.dashuai.learning.mediator.supports.AbstractMediator;

public class MediatorApplication {

    public static void main(String[] args) {
        AbstractColleague colleagueA = new ColleagueA();
        AbstractColleague colleagueB = new ColleagueB();
        AbstractMediator abstractMediator = new Mediator(colleagueA, colleagueB);
        System.out.println("======通过设置A影响B======");
        colleagueA.setNumber(1000, abstractMediator);
        System.out.println("colleagueA的number值为:" + colleagueA.getNumber());
        System.out.println("colleagueB的number值为A的10倍:" + colleagueB.getNumber());

        System.out.println("==========通过设置B影响A=========");
        colleagueB.setNumber(1000, abstractMediator);
        System.out.println("colleagueB的number值为:" + colleagueB.getNumber());
        System.out.println("colleagueA的number值为B的0.1倍:" + colleagueA.getNumber());
    }

}
