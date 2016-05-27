package main;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
//단순 view를 response하는 것도 스프링프레임워크를 통해서 response 될 수 있도록 구현해야 
// 스프링에서 제공하는 모든 서비스를 적용할 수 있다.
public class indexController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		return new ModelAndView("emp/index");
		
	}

}
