package com.technoturtle.javacc4.example_parser.expressions;
import java.util.*;

public class BlockExpression implements Expression {
	
	public List<Expression> expressions;
	
	public BlockExpression(List<Expression> expressions) {
		this.expressions = expressions;
	}
	
	
	@Override
	public double evaluate(Context context) {
		// TODO Auto-generated method stub
		for(Expression e : expressions) {
			e.evaluate(context);
		}
		return 1.0;
		
	}

}
