package test;

import member.MemberInsert;
import member.MemberSelect;

//TestServlet�� �Ѱ��� ��û �н��� �м��ؼ� ���� ������ ��ü�� ����
public class MyHandlerMapping {
	public Action exe(String path) {
		Action action = null;
		if (path.equals("/insert.do")) {
			action = new MemberInsert();
		} else if (path.equals("/select.do")) {
			action = new MemberSelect();
		}
		return action;
	}

}
