package test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class TestController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		
		ModelAndView mvc = new ModelAndView();
		
		mvc.addObject("msg","���������࿬��");
		
		mvc.setViewName("/WEB-INF/jsp/result.jsp");
		
		return mvc;
	}

}
