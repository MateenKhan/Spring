package four.jdbc.varag;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("four_jdbc_varag.xml");
		EmployeeDao dao = (EmployeeDao) context.getBean("edao");

		int status=dao.update(new Employee(23,"aaaaaaaaaa",35000));  
	    System.out.println(status);    

		context.close();
	}
}
