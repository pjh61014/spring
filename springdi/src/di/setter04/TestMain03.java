package di.setter04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain03 {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("config/setter.xml");
		
		IWriteArticleMgr mgr =(IWriteArticleMgr)factory.getBean("article");
		/*ArticleDTO user = new ArticleDTO("jang","1234","ddd","dd");
		
		mgr.write(user);
		
		IWriteArticleMgr mgr2 =(IWriteArticleMgr)factory.getBean("article2");
		//기본상태에서 싱글톤인지확인 - 기본으로 빈을 생성하지 않고 scope속성을 prototype으로 변경하면 getbean이 호출될때마다 빈이 생성된다.
		//(기본은 Applicationcontext객체가 생성될 때 한 번만 생성된다.
		
		
		ArticleDTO user2= new ArticleDTO("jang","123d4","dsdd","dsd");
		
		mgr.write(user2);
		
		if(mgr==mgr2){
			System.out.println("같다");
		}else{
			System.out.println("다르다");
		}
		*/

	}

}
