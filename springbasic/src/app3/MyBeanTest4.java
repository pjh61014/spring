package app3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyBeanTest4 {
/*
 * 
)
 */
	public static void main(String[] args){
		System.out.println("*********ApplicationContext��ü ������**************");
		ApplicationContext factory =new ClassPathXmlApplicationContext("config/bean.xml");
		System.out.println("*********ApplicationContext��ü ������**************");
		System.out.println("*********getBeanȣ����**************");
		MyBean obj = (MyBean)factory.getBean("obj");
		System.out.println("*********getBeanȣ����**************");

		test1(obj);
		test2(obj);
	}
	public static void test1(MyBean obj){
		//mybeankoŬ������ 2�����
		obj.sayHello("�嵿��");
		obj.sayHello("�嵿��");
	}
	public static void test2(MyBean obj){
		//mybeankoŬ������ 3�����
		obj.sayHello("�嵿��");
		obj.sayHello("�嵿��");
		obj.sayHello("�嵿��");
		
	}
}
