package app2;

public class MyBeanTest {
/*
 * oopƯ���� �����Ͽ� ����Ÿ������ ���������Ƿ� ����Ŭ������ ����Ǵ� ���� �������� �ʾƵ� �ȴ�.
 * ���� ��ü�� �����ؼ� �����ϴ� �κ��� ������ �����ؾ� �Ѵ�. (MyBeanEN�� MyBeanKO�� ����Ǵ� �κ�
)
 */
	public static void main(String[] args){
		MyBean obj = new MyBeanEN();
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
