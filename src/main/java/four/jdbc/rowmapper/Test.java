package four.jdbc.rowmapper;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("four_jdbc_rowmapper.xml");
		EmployeeDao dao = (EmployeeDao) context.getBean("edao");

		List<Employee> employees= dao.getAllEmployeesRowMapper();
		for(Employee employee:employees) {
			System.out.println(employee);
		}
		context.close();
	}
}
