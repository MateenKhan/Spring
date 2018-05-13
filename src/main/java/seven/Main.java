package seven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("seven_main.xml");

		Business obj = (Business) context.getBean("obj");
		obj.printMsg("asdf");

	}
}
