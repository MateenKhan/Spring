package three.anno.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("three_anno_aop.xml");
		Operation e = (Operation) context.getBean("opBean");
//		System.out.println("calling msg...");
//		e.msg();
//		System.out.println("calling m...");
//		e.m();
//		System.out.println("calling k...");
//		e.k();
		try {
			e.login(null, "asdf");
		} catch(Exception ee) {System.out.println("error in main");}
		context.close();
	}
}
