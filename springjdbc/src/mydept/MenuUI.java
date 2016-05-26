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
	//시작을 알리는 메소드
	public void show(){
		System.out.println("**********회원관리 시스템************");
		System.out.println("1. 부서등록");
		System.out.println("2. 로그인");
		System.out.println("3. 부서정보수정");
		System.out.println("4. 부서탈퇴");
		System.out.println("5. 부서정보조회");
		System.out.println("6. 부서목록조회");
		System.out.println("7. 부서별 사원조회");
		System.out.println("8. 종료");
		System.out.print("원하는 작업을 선택하세요:");
		int menu=key.nextInt();
		menuSelect(menu);
	}
	//show에서 선택한 값을 넘겨받아서 각각의 메소드를 선택하는 역할을 하는 메소드
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
		System.out.println("******삭제*******");
		System.out.println("삭제할 부서번호를 입력하세요:");
		String id = key.next();
		dao.delete(id);

	}

	@Override
	public void selectdeptlist() {
		System.out.println("********부서목록조회********");
		
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
		System.out.println("********부서등록********");
		System.out.print("부서번호:");
		String deptno = key.next();
		System.out.print("부서명:");
		String deptname = key.next();
		System.out.print("위치:");
		String loc = key.next();
		System.out.print("전화번호:");
		String telNum = key.next();
		
		MyDeptDTO user
			= new MyDeptDTO(deptno, deptname, loc, telNum);
		dao.insert(user);

	}

	@Override
	public void loginMenu() {
		// TODO Auto-generated method stub
		System.out.println("********로그인********");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("패스워드:");
		String pass = key.next();
		MyDeptDTO user = dao.login(id, pass);
		if(user==null){
			System.out.println("로그인실패");
		}else{
			//System.out.println(user.getName()+"님 로그인 성공!!");
		}
	}

	@Override
	public void deptinfolist() {
		System.out.print("부서코드:");
		String deptno = key.next();
		MyDeptDTO deptnoinfo = dao.getDeptInfoList(deptno);
		
		System.out.println("deptno:" +deptnoinfo.getDeptno());
		System.out.println("deptname:" +deptnoinfo.getDeptname());
		System.out.println("loc:" +deptnoinfo.getLoc());
		System.out.println("telNum:" +deptnoinfo.getTelNum());
		

	}

	@Override
	public void updateMenu() {
		System.out.println("********회원정보수정********");
		System.out.print("부서번호:");
		String deptno = key.next();
		System.out.print("부서명:");
		String deptname = key.next();
		System.out.print("위치:");
		String loc = key.next();
		System.out.print("전화번호:");
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
		System.out.print("부서명:");
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
	










