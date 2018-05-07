package four.jdbc.named;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("four_jdbc_named.xml");
		EmployeeDao dao = (EmployeeDao) context.getBean("edao");

	    dao.save(new Employee(23,"sonoo",50000));  

		context.close();
	}
}
