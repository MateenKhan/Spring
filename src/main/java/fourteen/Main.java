package fourteen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("fourteen.xml");

		Customer cust = (Customer) context.getBean("CustomerBean");
		System.out.println(cust);
	}

}
