package two.ci.factory_2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args){

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("two_ci_factory_2.xml");
		Printable p=(Printable)context.getBean("p");  
	    p.print();  
		context.close();
	}
}
