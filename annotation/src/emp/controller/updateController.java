package emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import emp.service.MyEmpService;
@Controller
public class updateController {
	@Autowired
	MyEmpService service;
	
	@RequestMapping(value="/update.do", method=RequestMethod.GET)
	public ModelAndView showpage(String id, String name) {
		System.out.println(id+":"+name);
		ModelAndView mav = new ModelAndView();
		mav.addObject("id",id);
		mav.addObject("name",name);
		mav.setViewName("emp/update");
		return mav;
	}
/*	
	@RequestMapping(value="/update.do", method=RequestMethod.POST)
	public ModelAndView update() {
		// TODO Auto-generated method stub
		return "emp/update";
	}
*/
}
