package test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class TestController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		//응답할 뷰와 공유할  데이터에 대한 정보를 갖고 잇는 객체
		ModelAndView mav = new ModelAndView();
		//공유할 데이터를 정의ㅏ-request.setAttribute("msg","스프링에서 넘어온 데이터")
		mav.addObject("msg","스프링에서 넘어온 데이s터");
		//forward할 뷰에 대한 정보를 정의
		mav.setViewName("test/result");
		return mav;
	}

}
