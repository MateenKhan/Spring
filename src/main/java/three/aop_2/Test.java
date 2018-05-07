package three.aop_2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("three_aop_2.xml");
		Validator v = (Validator) context.getBean("proxy", Validator.class);
		try {
			v.validate(12);
		} catch (Exception e) {
//			e.printStackTrace();
		}
		context.close();
	}
}
