package test;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("요청받기");
		ServletContext context = getServletContext();
		//컨텍스트에 대한  정보를 가지고 있음		
		ServletConfig config = getServletConfig();
		//서블릿에 대한 컨피그를 담고 있음 서블릿이 여러개 일 경우 이에 대한 객체가 생성된다.
		
		String email = config.getInitParameter("email");
		System.out.println(email);
		System.out.println(context.getContextPath());
		System.out.println(request.getRequestURI());
		System.out.println(request.getRequestURI());
		System.out.println(request.getRemoteAddr());
		System.out.println(request.getRemoteHost());
		
		String rootPath = request.getContextPath();
		String subPath = request.getRequestURI();
		
		String path =subPath.substring(rootPath.length());
		System.out.println("가공경로 :"+path);
		
		MyHandlerMapping mapping = new MyHandlerMapping();
		Action action = mapping.exe(path);
		action.run(request, response);
		
	}

}
