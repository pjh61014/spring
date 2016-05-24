package app3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

//BeanFactory 컨테이너가 빈을 생성하는 ㅅ지ㅓㅁ
public class MyBeanTest3 {
/*
 * 
)
 */
	public static void main(String[] args){
		System.out.println("***********Resource 객체 생성전");
		Resource res = new ClassPathResource("config/bean.xml");
		System.out.println("***********ㅠBeanFactory 객체 생성전/*******");
		BeanFactory factory = new XmlBeanFactory(res);
		System.out.println("***********ㅠBeanFactory 객체 생성후/*******");
		System.out.println("***********getBean호출전/*******");
		MyBean obj =(MyBean)factory.getBean("obj");
		MyBean obj2 =(MyBean)factory.getBean("obj");
		System.out.println("***********getBean호출전/*******");
		
		test1(obj);
		test2(obj);
	}
	public static void test1(MyBean obj){
		//mybeanko클래스를 2번사용
		obj.sayHello("장동건");
		obj.sayHello("장동건");
	}
	public static void test2(MyBean obj){
		//mybeanko클래스를 3번사용
		obj.sayHello("장동건");
		obj.sayHello("장동건");
		obj.sayHello("장동건");
		
	}
}
