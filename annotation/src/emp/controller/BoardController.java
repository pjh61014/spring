package emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import emp.service.MyEmpService;

@Controller
public class BoardController  {
	@Autowired
	MyEmpService service;
	
	@RequestMapping(value="/board_list.do", method=RequestMethod.GET)
	public String showlogin(){
		return "emp/board";
	}
	
	@RequestMapping(value="/board_write.do", method=RequestMethod.GET)
	public String insert(){
		return "emp/board_write";
	}
	
	/*@RequestMapping(value="/login.do", method=RequestMethod.POST)
	public ModelAndView login(HttpSession session, String id, String pass){
		System.out.println("id: "+id+"pass: "+pass);
		ModelAndView mav = new ModelAndView();
		MyEmpDTO user =service.login(id, pass);
		
		session.setAttribute("user", user);
		mav.setViewName("emp/index");
		
		System.out.println(user);
		
		return mav;
	}
	
	@RequestMapping(value="/logout.do", method=RequestMethod.GET)
	public String showlogout(HttpSession session){
		session.invalidate();
		return "emp/index";
	}
*/
}
