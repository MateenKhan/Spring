package two.ci.collection.map.ref;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("two_collection_map_ref.xml");
		Question q = (Question) context.getBean("q");
		q.displayInfo();
		context.close();
	}
}
