package four.jdbc.rs;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("four_jdbc_rs.xml");
		EmployeeDao dao = (EmployeeDao) context.getBean("edao");

		List<Employee> list = dao.getAllEmployees();

		for (Employee e : list)
			System.out.println(e);

		context.close();
	}
}
