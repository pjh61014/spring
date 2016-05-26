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
	public void insert(MyDeptDTO dept) {
		String sql = "insert into mydept values(?,?,?,?)";
		int result =
				template.update(sql, dept.getDeptno(),dept.getDeptname(),dept.getLoc(),dept.getTelNum());
		System.out.println(result+" �� ���Լ���");
	}

	@Override
	public void update(MyDeptDTO deptInfo) {
		String sql =  "update mydept set deptname=?, loc=?, telNum =? where deptno=?";
		int result =template.update(sql,deptInfo.getDeptname(), deptInfo.getLoc(), deptInfo.getTelNum(),deptInfo.getDeptno());
		System.out.println(result+" �� ���Լ���");
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
	public List<MyDeptDTO> selectdeptlist() {
		String sql = "select * from mydept";
		return template.query(sql, new MyDeptRowMapper());
	}



	@Override
	public MyDeptDTO getDeptInfoList(String deptno) {
		String sql = "select * from mydept where deptno =?";
		return template.queryForObject(sql, new Object[]{deptno},new MyDeptRowMapper());
	}





	@Override
	public List<MyDeptDTO> selectempbydept(String deptname) {
		String sql = "select e.* from mydept d, myemp e where d.deptno = e.deptno and d.deptname like ?";
		return template.query(sql, new Object[]{'%'+deptname+'%'},new MyDeptRowMapper());
		
	}

}
