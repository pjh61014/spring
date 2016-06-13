package emp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import sun.print.resources.serviceui;
import emp.dto.MyEmpDTO;
import emp.service.MyEmpService;

@Controller
public class SelectEmpListController extends AbstractController {
	@Autowired
	MyEmpService service;

	@Override
	@RequestMapping(value="/list.do", method=RequestMethod.GET)
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
				
		ModelAndView mav = new ModelAndView();
		//공유할 데이터를 정의ㅏ-request.setAttribute("msg","스프링에서 넘어온 데이터")
		mav.addObject("userlist",service.getMemberList());
		//forward할 뷰에 대한 정보를 정의
		mav.setViewName("searchlist");
		return mav;
		
		
		
		
		
		
		
	}

	
}
