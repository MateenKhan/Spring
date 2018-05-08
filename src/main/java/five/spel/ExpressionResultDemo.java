package five.spel;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class ExpressionResultDemo {

	public static void main(String[] args) {
		Calculation calculation = new Calculation();
		StandardEvaluationContext context = new StandardEvaluationContext(calculation);

		ExpressionParser parser = new SpelExpressionParser();
		parser.parseExpression("number").setValue(context, "5");

		System.out.println(calculation.cube());
	}

}

class Calculation {
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int cube() {
		return number * number * number;
	}
}