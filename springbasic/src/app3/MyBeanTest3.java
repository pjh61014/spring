package app3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

//BeanFactory �����̳ʰ� ���� �����ϴ� �����ä�
public class MyBeanTest3 {
/*
 * 
)
 */
	public static void main(String[] args){
		System.out.println("***********Resource ��ü ������");
		Resource res = new ClassPathResource("config/bean.xml");
		System.out.println("***********��BeanFactory ��ü ������/*******");
		BeanFactory factory = new XmlBeanFactory(res);
		System.out.println("***********��BeanFactory ��ü ������/*******");
		System.out.println("***********getBeanȣ����/*******");
		MyBean obj =(MyBean)factory.getBean("obj");
		MyBean obj2 =(MyBean)factory.getBean("obj");
		System.out.println("***********getBeanȣ����/*******");
		
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
