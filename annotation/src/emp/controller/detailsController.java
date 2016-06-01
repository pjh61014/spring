package emp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import emp.dto.MyEmpDTO;
import emp.service.MyEmpService;
@Controller
public class detailsController{
	@Autowired
	MyEmpService service;
	
	@RequestMapping(value="/details.do", method=RequestMethod.GET)
	public ModelAndView readEmp(HttpServletRequest req, String id) throws Exception{
		req.setCharacterEncoding("euc-kr");
		System.out.println(id);
		MyEmpDTO user =service.read(id);
		System.out.println(user);
	
	ModelAndView mav = new ModelAndView();
//	mav.addObject("user",user);
	//mav.setViewName("emp/detail");
	
		
		return null;
	}

}
