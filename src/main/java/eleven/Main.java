package eleven;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("eleven.xml");
		Employee employee = (Employee)context.getBean("Employee");
		System.out.println(employee.getName());
	}

}
