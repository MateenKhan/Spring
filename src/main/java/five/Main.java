package five;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("five_1.xml","five_2.xml");

		Business obj = (Business) context.getBean("obj");
		obj.printMsg("asdf");

	}
}
