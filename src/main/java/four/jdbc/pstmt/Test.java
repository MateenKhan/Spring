package four.jdbc.pstmt;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("four_jdbc_pstmt.xml");
		EmployeeDao dao = (EmployeeDao) context.getBean("edao");

		dao.saveEmployeeByPreparedStatement(new Employee(103, "Amit", 35000));
		context.close();
	}
}
