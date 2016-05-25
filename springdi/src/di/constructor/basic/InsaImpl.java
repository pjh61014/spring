package di.constructor.basic;


public class InsaImpl implements Insa {
	MemberDAO dao;
	public InsaImpl(){
		
	}
		//컨테이너가 InsaImple을 생성할 때 dao객체를 전달해줄 수 잇도록 생성자를 정의해야한다.
	public InsaImpl(MemberDAO dao) {
		super();
		this.dao = dao;
		System.out.println("dao injection완료");
	}

	@Override
	public void addUser(MemberDTO user) {
		
		dao.add(user);		
	}
	
	public MemberDTO getUser(String id) {
		dao.getUser("id");
		return null;
	}

	
}


