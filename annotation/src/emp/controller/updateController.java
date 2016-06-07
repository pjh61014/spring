package emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import emp.dto.MyEmpDTO;
import emp.service.MyEmpService;
@Controller
public class updateController {
	@Autowired
	MyEmpService service;
	
	@RequestMapping(value="/read.do", method=RequestMethod.POST)
	public ModelAndView showpage(MyEmpDTO user) {
		System.out.println(user);
		ModelAndView mav = new ModelAndView();
		mav.addObject("user",user);
		
		mav.setViewName("emp/update");
		return mav;
	}
	
	@RequestMapping(value="/update.do", method=RequestMethod.POST)
	public ModelAndView update(MyEmpDTO user) {
		// TODO Auto-generated method stub
		System.out.println("update.do"+user);
		service.update(user);
		
		return new ModelAndView("redirect:list.do");
	}

}
