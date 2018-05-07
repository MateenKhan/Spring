package two.ci.autowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("two_ci_autowire.xml");
		A s = (A) context.getBean("a");
		s.display();
		context.close();
	}
}
