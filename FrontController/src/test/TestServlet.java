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
		
		System.out.println("��û�ޱ�");
		ServletContext context = getServletContext();
		//���ؽ�Ʈ�� ����  ������ ������ ����		
		ServletConfig config = getServletConfig();
		//������ ���� ���Ǳ׸� ��� ���� ������ ������ �� ��� �̿� ���� ��ü�� �����ȴ�.
		
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
		System.out.println("������� :"+path);
		
		MyHandlerMapping mapping = new MyHandlerMapping();
		Action action = mapping.exe(path);
		action.run(request, response);
		
	}

}
