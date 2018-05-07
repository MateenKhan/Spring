package two.ci;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("two_ci.xml");
		Employee s = (Employee) context.getBean("emp");
		s.show();
		context.close();
	}
}
