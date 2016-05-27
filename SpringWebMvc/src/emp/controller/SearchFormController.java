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
		//������ �����͸� ���Ǥ�-request.setAttribute("msg","���������� �Ѿ�� ������")
		mav.addObject("userlist",service.findByAddr(loc));
		//forward�� �信 ���� ������ ����
		mav.setViewName("emp/searchlist");
		return mav;
	}

}
