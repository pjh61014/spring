package app2;

public class MyBeanTest {
/*
 * oop특성을 적용하여 상위타입으로 정의했으므로 하위클래스가 변경되는 경우는 수정하지 않아도 된다.
 * 실제 객체를 생성해서 전달하는 부분은 여전히 수정해야 한다. (MyBeanEN이 MyBeanKO로 변경되는 부분
)
 */
	public static void main(String[] args){
		MyBean obj = new MyBeanEN();
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
