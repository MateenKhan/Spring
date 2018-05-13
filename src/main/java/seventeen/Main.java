package seventeen;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("seventeen.xml");
		CustomerService customerService =(CustomerService)context.getBean("customerService");
		System.out.println(customerService.getMessage());
		context.close();
	}

}
