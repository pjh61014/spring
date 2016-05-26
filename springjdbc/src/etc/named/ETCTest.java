package etc.named;

import myemp.MyEmpDTO;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ETCTest {
	
	public static void main(String[] args ){
		ApplicationContext container = new ClassPathXmlApplicationContext("config/etc.xml");
		
		MyEmpDAOETCimpl dao =(MyEmpDAOETCimpl)container.getBean("namedao");
		dao.insert(new MyEmpDTO("jang12","111","부산","7등급", "장동건"));
	}

}
