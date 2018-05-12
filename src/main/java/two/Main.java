package two;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("two.xml");
		OutputHelper output = (OutputHelper) context.getBean("OutputHelper");
		output.generateOutput();
	}
}
