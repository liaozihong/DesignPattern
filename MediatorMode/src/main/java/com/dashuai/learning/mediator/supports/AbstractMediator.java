package com.dashuai.learning.mediator.supports;

public abstract class AbstractMediator {
    protected AbstractColleague abstractColleagueA;
    protected AbstractColleague abstractColleagueB;

    public AbstractMediator(AbstractColleague abstractColleagueA, AbstractColleague abstractColleagueB) {
        this.abstractColleagueA = abstractColleagueA;
        this.abstractColleagueB = abstractColleagueB;
    }

    public abstract void AaffectB();

    public abstract void BaffectA();
}
