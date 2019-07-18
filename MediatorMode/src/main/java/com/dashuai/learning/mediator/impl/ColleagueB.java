package com.dashuai.learning.mediator.impl;

import com.dashuai.learning.mediator.supports.AbstractColleague;
import com.dashuai.learning.mediator.supports.AbstractMediator;

public class ColleagueB extends AbstractColleague {
    @Override
    public void setNumber(int number, AbstractMediator abstractMediator) {
        this.number = number;
        abstractMediator.BaffectA();
    }
}
