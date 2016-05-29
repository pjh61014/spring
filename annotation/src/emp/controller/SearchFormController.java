package emp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import emp.service.MyEmpService;

@Controller
public class SearchFormController extends AbstractController {
	@Autowired
	MyEmpService service; 
	
	@Override
	@RequestMapping(value="/search.do", method=RequestMethod.GET)
	protected ModelAndView handleRequestInternal(HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		
		req.setCharacterEncoding("euc-kr");
		String loc = req.getParameter("search");
		ModelAndView mav = new ModelAndView();
		//������ �����͸� ���Ǥ�-request.setAttribute("msg","���������� �Ѿ�� ������")
		mav.addObject("userlist",service.findByAddr(loc));
		//forward�� �信 ���� ������ ����
		mav.setViewName("emp/searchlist");
		return mav;
	}

}
