package main;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
//�ܼ� view�� response�ϴ� �͵� �����������ӿ�ũ�� ���ؼ� response �� �� �ֵ��� �����ؾ� 
// ���������� �����ϴ� ��� ���񽺸� ������ �� �ִ�.
public class indexController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		return new ModelAndView("emp/index");
		
	}

}
