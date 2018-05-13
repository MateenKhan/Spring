package ten;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ten.xml");

		Customer cust = (Customer) context.getBean("customer");
		System.out.println(cust);
	}

}
