package mydept;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class MyDeptDAOImpl implements MyDeptDAO {

	private JdbcTemplate template;
		
	
	public MyDeptDAOImpl(JdbcTemplate template) {
		super();
		this.template = template;
	}
	


	@Override
	public int count() {
		
		return template.queryForObject("select count(*) from mydept", Integer.class);
	}

	@Override
	public void insert(MyDeptDTO dept) {
		String sql = "insert into mydept values(?,?,?,?)";
		int result =
				template.update(sql, dept.getDeptno(),dept.getDeptname(),dept.getLoc(),dept.getTelNum());
		System.out.println(result+" °³ »ðÀÔ¼º°ø");
	}

	@Override
	public void update(MyDeptDTO deptInfo) {
		String sql =  "update mydept set deptname=?, loc=?, telNum =? where deptno=?";
		int result =template.update(sql,deptInfo.getDeptname(), deptInfo.getLoc(), deptInfo.getTelNum(),deptInfo.getDeptno());
		System.out.println(result+" °³ »ðÀÔ¼º°ø");
	}

	@Override
	public void delete(String id) {
		String sql =  "delete mydept  where deptno=?";
		template.update(sql, id);

	}

	@Override
	public MyDeptDTO login(String id, String pass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MyDeptDTO> getMemberList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MyDeptDTO> findByAddr(String addr) {
		// TODO Auto-generated method stub
		return null;
	}

}
