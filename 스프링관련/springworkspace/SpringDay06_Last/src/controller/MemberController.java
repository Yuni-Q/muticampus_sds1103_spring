package controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import service.MemberService;
import vo.MemberVO;

@Controller
public class MemberController {
	@Autowired
	private MemberService service;
	
	public void setService(MemberService service) {
		this.service = service;
	}
////////////////////////////////////////////////////////	
	@RequestMapping("/joinForm.do")
	public String joinForm(){
		return "join_form"; // join_form.jsp ���̸� ����
	}
	
	@RequestMapping(value="/join.do", method=RequestMethod.POST)
	public String join(MemberVO member){
		// ȸ�������� �����ϱ� ���� MemberService ��ü�� �ʿ���.
		if(service.join(member)){
			return "join_success"; // ȸ������ ���� jsp
		}else{
			return "join_fail"; // ȸ������ ���� jsp
		}
	}
	
	@RequestMapping(value="/login.do", method=RequestMethod.POST)
	public String login
			(String userId, String userPw, HttpSession session){
		if(service.login(userId, userPw)==true){
			session.setAttribute("loginId", userId);
			return "login_success"; // login_success.jsp
		}else{
			return "login_fail"; // login_fail.jsp
		}
		
	}
}









