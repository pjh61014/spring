package app1;

public class MyBeanTest {
/*
 * ���յ��� �ص��� ���� ���α׷�
 * => Ŭ������ ���յ��� ���ϰ� ������ ����. ���Ǿ����� Ŭ������ ����Ǹ� 
 * 	�����Ǿ�� �ϴ� ������ �о�����.
 * 	��, ����ϴ� Ŭ������ ��� �� �����ؾ� �Ѵ�.
 * oop Ư���� ������ �ȵǾ� �ִ�. 
 */
	public static void main(String[] args){
		MyBeanEN obj = new MyBeanEN();
		test1(obj);
		test2(obj);
	}
	public static void test1(MyBeanEN obj){
		//mybeankoŬ������ 2�����
		obj.sayHello("�嵿��");
		obj.sayHello("�嵿��");
	}
	public static void test2(MyBeanEN obj){
		//mybeankoŬ������ 3�����
		obj.sayHello("�嵿��");
		obj.sayHello("�嵿��");
		obj.sayHello("�嵿��");
		
	}
}
