package etc.named;

import myemp.MyEmpDTO;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ETCTest {
	
	public static void main(String[] args ){
		ApplicationContext container = new ClassPathXmlApplicationContext("config/etc.xml");
		
		MyEmpDAOETCimpl dao =(MyEmpDAOETCimpl)container.getBean("namedao");
		dao.insert(new MyEmpDTO("jang","111","�λ�","7���", "�嵿��"));
	}

}
