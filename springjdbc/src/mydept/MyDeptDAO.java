package mydept;

import java.util.List;

public interface MyDeptDAO {
	//회원인원수 조회
	List<MyDeptDTO> selectempbydept(String deptname);
	//회원가입
	void insert(MyDeptDTO dept);
	//회원정보수정
	void update(MyDeptDTO deptInfo);
	//회원탈퇴
	void delete(String id);
	//로그인
	MyDeptDTO login(String id,String pass);
	//부서정보조회 
	MyDeptDTO getDeptInfoList(String deptno);
	//주소로 검색
	List<MyDeptDTO> selectdeptlist();
	
}









