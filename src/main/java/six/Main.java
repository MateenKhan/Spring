package six;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("six.xml");

		FileNameGenerator obj = (FileNameGenerator) context.getBean("FileNameGenerator");
		System.out.println(obj.getName());

	}
}
