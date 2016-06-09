package emp.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import emp.dto.MyEmpDTO;
import emp.service.MyEmpService;

@Controller
public class loginController  {
	@Autowired
	MyEmpService service;
	
	@RequestMapping(value="/login.do", method=RequestMethod.GET)
	public String showlogin(){
		return "emp/login";
	}
	
	@RequestMapping(value="/login.do", method=RequestMethod.POST)
	public ModelAndView login(HttpSession session, String id, String pass){
		System.out.println("id: "+id+"pass: "+pass);
		ModelAndView mav = new ModelAndView();
		MyEmpDTO user =service.login(id, pass);
		
		session.setAttribute("user", user);
		mav.setViewName("emp/result");
		
		System.out.println(user);
		
		return mav;
	}

}
