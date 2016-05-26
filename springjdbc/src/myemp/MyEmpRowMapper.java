package myemp;

import java.sql.ResultSet;
import java.sql.SQLException;



import org.springframework.jdbc.core.RowMapper;
//jdbcTemplatge같은 스프링 jdbc 템플릿 클래스에서 select를 수행한 후 하나의 row에 대한 처리 정보를 담고 있는 개체로 query 메소드 내부에서 호출할 객체
public class MyEmpRowMapper implements RowMapper<MyEmpDTO> {

	@Override
	public MyEmpDTO mapRow(ResultSet rs, int rowNum) throws SQLException {

		//List의 한 요소로 add 시킬 레코드를 dto로 변환하는 작업을 수행 
		System.out.println("mapRow()===>"+rowNum);
		MyEmpDTO emp = new MyEmpDTO(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4),
				rs.getString(5),rs.getString(6),rs.getString(7));
		
		
		return emp;
	}

}
