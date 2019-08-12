package com.dashuai.learning.state;


import com.dashuai.learning.state.impl.ConcreteStateB;
import com.dashuai.learning.state.support.Context;
import com.dashuai.learning.state.support.State;

public class StateApplication {

    public static void main(String[] args) {
        State state = new ConcreteStateB();
        Context context = new Context();
        context.setState(state);
        context.request("尼玛的");
    }

}
