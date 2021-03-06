package emp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import sun.print.resources.serviceui;
import emp.dto.MyEmpDTO;
import emp.service.MyEmpService;

public class SelectEmpListController extends AbstractController {
	MyEmpService service;

	public SelectEmpListController(MyEmpService service) {
		super();
		this.service = service;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
				
		
		ModelAndView mav = new ModelAndView();
		//공유할 데이터를 정의ㅏ-request.setAttribute("msg","스프링에서 넘어온 데이터")
		mav.addObject("userlist",service.getMemberList());
		//forward할 뷰에 대한 정보를 정의
		mav.setViewName("emp/list");
		return mav;
		
		
		
		
		
		
		
	}

	
}
