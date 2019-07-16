package com.dashuai.learning.interpreter.impl;

import com.dashuai.learning.interpreter.expression.IExpression;
import com.dashuai.learning.interpreter.support.Context;

/**
 * Nonterminal expression
 * Created in 2019.07.16
 *
 * @author Liaozihong
 */
public class NonterminalExpression implements IExpression {
    @Override
    public void interpreter(Context context) {
        System.out.println("非终端表示符!");
    }
}
