package two.ci.inheritance;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("two_ci_inheritance.xml");
		Employee e = (Employee) context.getBean("e1");
		e.show();
		Employee e2 = (Employee) context.getBean("e2");
		e2.show();
		Employee e3 = (Employee) context.getBean("e3");
		e3.show();
		context.close();
	}
}
