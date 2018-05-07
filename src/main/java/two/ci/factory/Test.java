package two.ci.factory;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args){

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("two_ci_factory.xml");
		A s = (A) context.getBean("a");
		s.msg();
		context.close();
	}
}
