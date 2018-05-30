package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Person person = (Person) context.getBean("p");
		System.out.println(person.getAll());
	}

}
