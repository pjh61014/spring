package mydept;

import java.util.List;

public interface MyDeptDAO {
	//ȸ���ο��� ��ȸ
	List<MyDeptDTO> selectempbydept(String deptname);
	//ȸ������
	void insert(MyDeptDTO dept);
	//ȸ����������
	void update(MyDeptDTO deptInfo);
	//ȸ��Ż��
	void delete(String id);
	//�α���
	MyDeptDTO login(String id,String pass);
	//�μ�������ȸ 
	MyDeptDTO getDeptInfoList(String deptno);
	//�ּҷ� �˻�
	List<MyDeptDTO> selectdeptlist();
	
}









