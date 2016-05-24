package basic;


public class InsaImpl implements Insa {
	MemberDAO dao;
	
	public InsaImpl(){
		
	}
	
	public InsaImpl(MemberDAO dao) {
		super();
		this.dao = dao;
	}
	
	@Override
	public void addUser(MemberDTO user) {
		dao = new MemberDAO();
		dao.add(user);		
	}
	
	public void setDao(MemberDAO dao){
		this.dao = dao;
	}
	
	@Override
	public MemberDTO getUser(String id) {
		dao.getUser("id");
		return null;
	}

	@Override
	public MemberDTO setUser(String id) {
		dao.getUser("id");
		return null;
	}

	

}
