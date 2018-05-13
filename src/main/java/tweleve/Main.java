package tweleve;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("tweleve.xml");
		Country india = (Country)context.getBean("India");
		System.out.println(india.getName());
		System.out.println(india.getPin());
		Country aus = (Country)context.getBean("Australia");
		System.out.println(aus.getName());
		System.out.println(aus.getPin());
	}

}
