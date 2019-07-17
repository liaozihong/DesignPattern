package com.dashuai.learning.strategy;

import com.dashuai.learning.strategy.impl.ConcreteStrategyA;
import com.dashuai.learning.strategy.impl.ConcreteStrategyB;
import com.dashuai.learning.strategy.supports.Context;

public class StrategyApplication {

	public static void main(String[] args) {
		Context context;

		context = new Context(new ConcreteStrategyA());
		context.contextInterface();

		context = new Context(new ConcreteStrategyB());
		context.contextInterface();

	}

}
