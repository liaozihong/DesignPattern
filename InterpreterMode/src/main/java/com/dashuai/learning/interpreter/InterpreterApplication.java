package com.dashuai.learning.interpreter;

import com.dashuai.learning.interpreter.expression.IExpression;
import com.dashuai.learning.interpreter.impl.NonterminalExpression;
import com.dashuai.learning.interpreter.impl.TerminalExpression;
import com.dashuai.learning.interpreter.support.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Interpreter application
 * Created in 2019.07.16
 *
 * @author Liaozihong
 */
public class InterpreterApplication {

	/**
	 * 这里只是简单的演示了下解释器模式的思想，实际解析器应该会很复杂.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
		Context context = new Context();
		List<IExpression> list = new ArrayList<>();
		list.add(new TerminalExpression());
		list.add(new NonterminalExpression());
		list.add(new TerminalExpression());
		list.add(new NonterminalExpression());
		list.forEach(x -> x.interpreter(context));
	}
}
