package di.anno2;

import org.apache.catalina.core.ApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("config/bean.xml");
		
		IWriteArticleMgr mgr =(IWriteArticleMgr)factory.getBean("article");
		ArticleDTO user = new ArticleDTO("jang","1234","ddd","dd");
		
		mgr.write(user);
		
		


	}

}
