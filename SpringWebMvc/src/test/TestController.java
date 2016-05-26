package test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class TestController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		//������ ��� ������  �����Ϳ� ���� ������ ���� �մ� ��ü
		ModelAndView mav = new ModelAndView();
		//������ �����͸� ���Ǥ�-request.setAttribute("msg","���������� �Ѿ�� ������")
		mav.addObject("msg","���������� �Ѿ�� ������");
		//forward�� �信 ���� ������ ����
		mav.setViewName("/WEB-INF/test/result.jsp");
		return mav;
	}

}
