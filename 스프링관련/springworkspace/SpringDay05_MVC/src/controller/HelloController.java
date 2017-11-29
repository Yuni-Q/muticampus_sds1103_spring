package controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller // ������MVC dispatcher������ ��Ʈ�ѷ� ��� �ֳ����̼�
public class HelloController{

	// Handler Mapping�� dispatcher ������ ����ϴ� �ֳ����̼�
	@RequestMapping(value="/hello.do")
	public ModelAndView executeHello(){
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("msg", "�ȳ��ϼ���. ������MVC ù �����Դϴ�.");
		mv.addObject("now", new Date());
		
		mv.setViewName("my_hello"); // /my_hello.jsp
		return mv;
	}
}







