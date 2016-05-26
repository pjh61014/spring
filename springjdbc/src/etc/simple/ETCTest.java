package etc.simple;

import myemp.MyEmpDTO;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ETCTest {
	
	public static void main(String[] args ){
		ApplicationContext container = new ClassPathXmlApplicationContext("config/etc.xml");
		
		MyEmpDAOETCimpl dao =(MyEmpDAOETCimpl)container.getBean("simpledao");
		dao.insert(new MyEmpDTO("jang124","1d11","부산","8등급", "장동건"));
	}

}
