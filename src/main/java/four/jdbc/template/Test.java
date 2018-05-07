package four.jdbc.template;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("four_jdbc_template.xml");
		EmployeeDao dao = (EmployeeDao) context.getBean("edao");
		/*
		 * int status=dao.saveEmployee(new Employee(102,"Amit",35000));
		 * System.out.println(status);
		 */

		// int status=dao.updateEmployee(new Employee(102,"Sonoo",15000));
		// System.out.println(status);

		Employee e = new Employee();
		e.setId(102);
		int status = dao.deleteEmployee(e);
		System.out.println(status);
		context.close();
	}
}
