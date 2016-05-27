package emp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import emp.service.MyEmpService;

public class SearchFormController extends AbstractController {
	MyEmpService service;
	
	public SearchFormController(MyEmpService service) {
		super();
		this.service = service;
	}
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		
		req.setCharacterEncoding("euc-kr");
		String loc = req.getParameter("search");
		ModelAndView mav = new ModelAndView();
		//공유할 데이터를 정의ㅏ-request.setAttribute("msg","스프링에서 넘어온 데이터")
		mav.addObject("userlist",service.findByAddr(loc));
		//forward할 뷰에 대한 정보를 정의
		mav.setViewName("emp/searchlist");
		return mav;
	}

}
