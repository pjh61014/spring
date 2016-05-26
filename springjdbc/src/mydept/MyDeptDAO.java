package mydept;

import java.util.List;

public interface MyDeptDAO {
	//ȸ���ο��� ��ȸ
	int count();
	//ȸ������
	void insert(MyDeptDTO dept);
	//ȸ����������
	void update(MyDeptDTO deptInfo);
	//ȸ��Ż��
	void delete(String id);
	//�α���
	MyDeptDTO login(String id,String pass);
	//ȸ����Ϻ���
	List<MyDeptDTO> getMemberList();
	//�ּҷ� �˻�
	List<MyDeptDTO> findByAddr(String addr);
	
}









