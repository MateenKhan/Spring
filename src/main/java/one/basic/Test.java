package one.basic;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		// The Resource object represents the information of
		// one.xml file.
		// The Resource is the interface and the ClassPathResource is the
		// implementation class of the Resource interface.
		Resource resource = new ClassPathResource("one.xml");

		// The BeanFactory is responsible to return the bean.
		// The XmlBeanFactory is the implementation class of the BeanFactory
		BeanFactory factory = new XmlBeanFactory(resource);
		Student student = (Student) factory.getBean("student");
		student.displayInfo();
	}
}
