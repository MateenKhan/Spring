package two.ci.collection.map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("two_collection_map.xml");
		Question q = (Question) context.getBean("q2");
		q.displayInfo();
		context.close();
	}
}
