package exam;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class AccountDemo {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		/*Account acc = new Account();*/
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("config/bean.xml");
		Account acc = (Account)factory.getBean("obj2");
		acc.setAccId("111-222-3333");
		System.out.println("************������� ���α׷�**************");
		System.out.println("���� �ܾ���:"+acc.getBalance()+"�Դϴ�.");
		System.out.println("� �۾��� �Ͻðڽ��ϱ�?");
		System.out.print("1.�Ա�");
		System.out.print("2.���");
		System.out.println("3.��ȸ");
		System.out.println("���ϴ� �۾��� �����ϼ���.");
		int num = key.nextInt();
		switch(num){
			case 1:
				System.out.println("�Աݱݾ��� �Է��ϼ���");
				acc.input(key.nextLong());
				System.out.println(acc.getAccId()
						+"������ �����ܾ��� "+acc.getBalance());
				break;
			case 2:
				System.out.println("��ݱݾ��� �Է��ϼ���");
				acc.output(key.nextLong());
				System.out.println(acc.getAccId()
						+"������ �����ܾ��� "+acc.getBalance());
				break;
			case 3:
				System.out.println(acc.getAccId()
						+"������ �����ܾ��� "+acc.getBalance());
				break;
			default:
				System.out.println("�߸������ϼ̽��ϴ�.");
				System.exit(0);
		}
	}

}









