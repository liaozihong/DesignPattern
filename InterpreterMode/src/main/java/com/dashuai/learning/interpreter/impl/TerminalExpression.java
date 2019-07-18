package com.dashuai.learning.interpreter.impl;

import com.dashuai.learning.interpreter.expression.IExpression;
import com.dashuai.learning.interpreter.support.Context;

/**
 * Terminal expression
 * Created in 2019.07.16
 *
 * @author Liaozihong
 */
public class TerminalExpression implements IExpression {
    @Override
    public void interpreter(Context context) {
        System.out.println("终端解释器");

    }
}
