package com.dashuai.learning.mediator.impl;

import com.dashuai.learning.mediator.supports.AbstractColleague;
import com.dashuai.learning.mediator.supports.AbstractMediator;

public class Mediator extends AbstractMediator {
    public Mediator(AbstractColleague abstractColleagueA, AbstractColleague abstractColleagueB) {
        super(abstractColleagueA, abstractColleagueB);
    }

    @Override
    public void AaffectB() {
        int number = abstractColleagueA.getNumber();
        abstractColleagueB.setNumber(number * 10);
    }

    @Override
    public void BaffectA() {
        int number = abstractColleagueB.getNumber();
        abstractColleagueA.setNumber(number / 10);
    }
}
