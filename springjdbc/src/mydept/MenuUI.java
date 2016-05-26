package mydept;

import java.util.List;
import java.util.Scanner;

public class MenuUI implements AbstractUI {
	Scanner key = new Scanner(System.in);
	MyDeptDAO dao;

	public MenuUI(MyDeptDAO dao) {
		super();
		this.dao = dao;
	}
	//������ �˸��� �޼ҵ�
	public void show(){
		System.out.println("**********ȸ������ �ý���************");
		System.out.println("1. �μ����");
		System.out.println("2. �α���");
		System.out.println("3. �μ���������");
		System.out.println("4. �μ�Ż��");
		System.out.println("5. �μ�������ȸ");
		System.out.println("6. �μ������ȸ");
		System.out.println("7. �μ��� �����ȸ");
		System.out.println("8. ����");
		System.out.print("���ϴ� �۾��� �����ϼ���:");
		int menu=key.nextInt();
		menuSelect(menu);
	}
	//show���� ������ ���� �Ѱܹ޾Ƽ� ������ �޼ҵ带 �����ϴ� ������ �ϴ� �޼ҵ�
	public void menuSelect(int menu){
		switch(menu){
			case 1:
				insertMenu();
				break;
			case 2:
				loginMenu();
				break;
			case 3:
				updateMenu();
				break;
			case 4:
				deleteMenu();
				break;
			case 5:
				deptinfolist();
				break;
			case 6:
				selectdeptlist();
				break;
			case 7:
				selectempbydept();
				break;
			case 8:
				System.exit(0);
		}
	}
	@Override
	public void deleteMenu() {
		System.out.println("******����*******");
		System.out.println("������ �μ���ȣ�� �Է��ϼ���:");
		String id = key.next();
		dao.delete(id);

	}

	@Override
	public void selectdeptlist() {
		System.out.println("********�μ������ȸ********");
		
		List<MyDeptDTO> deptnolist = dao.selectdeptlist();
		for (int i = 0; i < deptnolist.size(); i++) {
			MyDeptDTO deptlist = deptnolist.get(i);
			System.out.print(deptlist.getDeptno()+"\t");
			System.out.print(deptlist.getDeptname()+"\t");
			System.out.print(deptlist.getLoc()+"\t");
			System.out.print(deptlist.getTelNum()+"\t");
			System.out.println();
		}
	}

	@Override
	public void insertMenu() {
		System.out.println("********�μ����********");
		System.out.print("�μ���ȣ:");
		String deptno = key.next();
		System.out.print("�μ���:");
		String deptname = key.next();
		System.out.print("��ġ:");
		String loc = key.next();
		System.out.print("��ȭ��ȣ:");
		String telNum = key.next();
		
		MyDeptDTO user
			= new MyDeptDTO(deptno, deptname, loc, telNum);
		dao.insert(user);

	}

	@Override
	public void loginMenu() {
		// TODO Auto-generated method stub
		System.out.println("********�α���********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("�н�����:");
		String pass = key.next();
		MyDeptDTO user = dao.login(id, pass);
		if(user==null){
			System.out.println("�α��ν���");
		}else{
			//System.out.println(user.getName()+"�� �α��� ����!!");
		}
	}

	@Override
	public void deptinfolist() {
		System.out.print("�μ��ڵ�:");
		String deptno = key.next();
		MyDeptDTO deptnoinfo = dao.getDeptInfoList(deptno);
		
		System.out.println("deptno:" +deptnoinfo.getDeptno());
		System.out.println("deptname:" +deptnoinfo.getDeptname());
		System.out.println("loc:" +deptnoinfo.getLoc());
		System.out.println("telNum:" +deptnoinfo.getTelNum());
		

	}

	@Override
	public void updateMenu() {
		System.out.println("********ȸ����������********");
		System.out.print("�μ���ȣ:");
		String deptno = key.next();
		System.out.print("�μ���:");
		String deptname = key.next();
		System.out.print("��ġ:");
		String loc = key.next();
		System.out.print("��ȭ��ȣ:");
		String telNum = key.next();
		System.out.println("dlkjd");
		MyDeptDTO updateuser = 
				new MyDeptDTO(deptno, deptname, loc, telNum);
		System.out.println(updateuser.toString());
		dao.update(updateuser);
		System.out.println(":d");
		

	}
	@Override
	public void selectempbydept() {
		System.out.print("�μ���:");
		String deptname = key.next(); 
		 List<MyDeptDTO> emplistbydept = dao.selectempbydept(deptname);
		
		 for (int i = 0; i < emplistbydept.size(); i++) {
				MyDeptDTO deptlist = emplistbydept.get(i);
				System.out.print(deptlist.getDeptno()+"\t");
				System.out.print(deptlist.getDeptname()+"\t");
				System.out.print(deptlist.getLoc()+"\t");
				System.out.print(deptlist.getTelNum()+"\t");
				System.out.println();
		 }
	}
}
	










