package myp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("NewFile.xml");

		student s=(student)context.getBean("s1");
		s.display();

	}

}
