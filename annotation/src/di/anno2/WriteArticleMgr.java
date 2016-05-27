package di.anno2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("article")
public class WriteArticleMgr implements IWriteArticleMgr {
	@Autowired
	@Qualifier("mysql")
	IArticleDAO articleDAO;
	
	
	
	public WriteArticleMgr() {
		super();
	}



	public WriteArticleMgr(IArticleDAO articleDAO) {
		super();
		this.articleDAO = articleDAO;
		System.out.println("WriteArticleMgr�� ������ ȣ��Ϸ�");
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
