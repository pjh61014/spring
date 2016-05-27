package emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import emp.dao.MyEmpDAO;
import emp.dto.MyEmpDTO;
@Service
public class MyEmpServiceImpl implements MyEmpService {
	@Autowired
	@Qualifier("empdao")
	MyEmpDAO dao;
	
	
	


	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void insert(MyEmpDTO user) {
		dao.insert(user);
	}

	@Override
	public void update(MyEmpDTO userInfo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public MyEmpDTO login(String id, String pass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MyEmpDTO> getMemberList() {
		
		return dao.getMemberList();
	}

	@Override
	public List<MyEmpDTO> findByAddr(String addr) {
		// TODO Auto-generated method stub
		return dao.findByAddr(addr);
	}

}
