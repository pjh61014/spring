package myemp;

import java.util.List;
import java.util.Scanner;

public class MenuUI implements AbstractUI {
	Scanner key = new Scanner(System.in);
	MyEmpDAO dao;

	public MenuUI(MyEmpDAO dao) {
		super();
		this.dao = dao;
	}
	//시작을 알리는 메소드
	public void show(){
		System.out.println("**********회원관리 시스템************");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 회원정보수정");
		System.out.println("4. 회원탈퇴");
		System.out.println("5. 회원목록보기");
		System.out.println("6. 주소로 회원검색하기");
		System.out.println("7. 회원수조회");
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
				showAllMenu();
				break;
			case 6:
				findByAddrMenu();
				break;
			case 7:
				countMenu();
				break;
			case 8:
				System.exit(0);
		}
	}
	@Override
	public void deleteMenu() {
		System.out.println("******삭제*******");
		System.out.println("삭제할 아이디를 입력하세요:");
		String id = key.next();
		dao.delete(id);

	}

	@Override
	public void findByAddrMenu() {
		System.out.println("********검색********");
		System.out.print("검색할 주소를 입력하세요:");
		String addr = key.next();
		List<MyEmpDTO> userlist = dao.findByAddr(addr);
		for (int i = 0; i < userlist.size(); i++) {
			MyEmpDTO user = userlist.get(i);
			System.out.print(user.getId()+"\t");
			System.out.print(user.getPass()+"\t");
			System.out.print(user.getName()+"\t");
			System.out.print(user.getAddr()+"\t");
			System.out.print(user.getGrade()+"\t");
			System.out.println(user.getDeptno()+"\t");
		}
	}

	@Override
	public void insertMenu() {
		System.out.println("********회원가입********");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("패스워드:");
		String pass = key.next();
		System.out.print("주소:");
		String addr = key.next();
		System.out.print("등급:");
		String grade = key.next();
		System.out.print("성명:");
		String name = key.next();
		MyEmpDTO user
			= new MyEmpDTO(id, pass, addr, grade, name);
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
		MyEmpDTO user = dao.login(id, pass);
		if(user==null){
			System.out.println("로그인실패");
		}else{
			System.out.println(user.getName()+"님 로그인 성공!!");
		}
	}

	@Override
	public void showAllMenu() {
		
		List<MyEmpDTO> userlist = dao.getMemberList();
		System.out.println("dao의 메소드 호출 후");
		for (int i = 0; i < userlist.size(); i++) {
			MyEmpDTO user = userlist.get(i);
			System.out.print(user.getId()+"\t");
			System.out.print(user.getPass()+"\t");
			System.out.print(user.getName()+"\t");
			System.out.print(user.getAddr()+"\t");
			System.out.print(user.getGrade()+"\t");
			System.out.println(user.getDeptno()+"\t");
		}

	}

	@Override
	public void updateMenu() {
		System.out.println("********회원정보수정********");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("패스워드:");
		String pass = key.next();
		System.out.print("주소:");
		String addr = key.next();
		System.out.print("등급:");
		String grade = key.next();
		System.out.println("dlkjd");
		MyEmpDTO updateuser = 
				new MyEmpDTO(id, pass, addr, grade, null);
		System.out.println(updateuser.toString());
		dao.update(updateuser);
		System.out.println(":d");
		

	}
	@Override
	public void countMenu() {
		System.out.println("전체 인원수:"+dao.count());
		
	}

}








