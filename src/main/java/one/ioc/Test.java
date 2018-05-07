package one.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// cannot close context
		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("one.xml");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("one.xml");
		Student student = (Student) context.getBean("s2");
		student.displayInfo();
		context.close();
	}
}
