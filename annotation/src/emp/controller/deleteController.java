package emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import emp.service.MyEmpService;
@Controller
public class deleteController {
	
	@Autowired
	MyEmpService service;
	
	@RequestMapping(value="/delete.do", method=RequestMethod.GET)
	public ModelAndView delete(String id) {
		System.out.println("delete"+id);
		service.delete(id);
		
/*		mav.addObject("user",user);
		
		mav.setViewName("emp/update");
*/		return new ModelAndView("redirect:list.do");
	}
	
}
