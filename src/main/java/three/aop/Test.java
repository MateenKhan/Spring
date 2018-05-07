package three.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("three_aop.xml");
		A a = (A) context.getBean("proxy", A.class);
		System.out.println("proxy class name: " + a.getClass().getName());
		a.m();
		context.close();
	}
}
