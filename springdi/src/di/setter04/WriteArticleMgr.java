package di.setter04;

public class WriteArticleMgr implements IWriteArticleMgr {
	IArticleDAO articleDAO;
	
	
	
	public WriteArticleMgr() {
		super();
	}



	public WriteArticleMgr(IArticleDAO articleDAO) {
		super();
		this.articleDAO = articleDAO;
		System.out.println("WriteArticleMgr의 생성자 호출완료");
	}



	public IArticleDAO getArticleDAO() {
		return articleDAO;
	}



	public void setArticleDAO(IArticleDAO articleDAO) {
		this.articleDAO = articleDAO;
	}

	

	@Override
	public void write(ArticleDTO article) {
		System.out.println(article);
		articleDAO.insert(article);
		
	}
	

}
