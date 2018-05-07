package three.aop_3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("three_aop_3.xml");
		Operation e = (Operation) context.getBean("opBean");
		System.out.println("calling msg...");
		try {
			e.msg(null);
		} catch (Exception ee) {
			System.out.println("exception in main");
		}
		context.close();
	}
}
