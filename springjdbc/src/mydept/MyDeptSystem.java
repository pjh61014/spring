package mydept;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyDeptSystem {
	public static void main(String[] args) {
		ApplicationContext factory = 
			 new ClassPathXmlApplicationContext("deptconfig/scott.xml");
		AbstractUI ui = (AbstractUI)factory.getBean("menuui");
		System.out.println("dd");
		while(true){
			ui.show();
		}
		
		
		
	}

}
