package app3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MyBeanTest {
/*
 * 
)
 */
	public static void main(String[] args){
		//������ �����ӿ�ũ ���ο��� ��ü�� �������ִ� Ŭ����(�����������̳�)�� �̿��ؼ� �۾� 
		//1.���� ���������� ��� ���ִ� XML ���ϸ��� ���� - �Ľ��ؼ� �� Ʈ�������� �������� 
		Resource res = new ClassPathResource("config/bean.xml");
		//2.xml ������ �̿��ؼ� ��ü�� �����ϴ� Ŭ������ ���� 
		BeanFactory factory = new XmlBeanFactory(res);
		//xml�� ������ ��ġ���� �Ͼ�� ��ü�� �о��
		MyBean obj =(MyBean)factory.getBean("obj");
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
