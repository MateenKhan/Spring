package two.ci.reference;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("two_ci_ref.xml");
//		Employee e = (Employee) context.getBean("e2");
		Employee e = (Employee) context.getBean("e");
		e.show();
		context.close();
	}
}
