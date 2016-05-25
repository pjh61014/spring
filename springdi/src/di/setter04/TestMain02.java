package di.setter04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain02 {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("config/setter.xml");
		ApplicationContext factory2 = new ClassPathXmlApplicationContext("config/setter.xml");
		
		IWriteArticleMgr mgr =(IWriteArticleMgr)factory.getBean("article");
		ArticleDTO user = new ArticleDTO("jang","1234","ddd","dd");
		
		mgr.write(user);
		
		IWriteArticleMgr mgr2 =(IWriteArticleMgr)factory.getBean("article2");
		ArticleDTO user2= new ArticleDTO("jang","123d4","dsdd","dsd");
		
		mgr.write(user2);
		
		IWriteArticleMgr mgr3 =(IWriteArticleMgr)factory.getBean("article");
		ArticleDTO user = new ArticleDTO("jang","1234","ddd","dd");
		
		mgr.write(user);

	}

}
