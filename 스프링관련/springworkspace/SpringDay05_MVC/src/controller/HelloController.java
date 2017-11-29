package controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller // 스프링MVC dispatcher서블릿에 컨트롤러 등록 애노테이션
public class HelloController{

	// Handler Mapping을 dispatcher 서블릿에 등록하는 애노테이션
	@RequestMapping(value="/hello.do")
	public ModelAndView executeHello(){
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("msg", "안녕하세요. 스프링MVC 첫 예제입니다.");
		mv.addObject("now", new Date());
		
		mv.setViewName("my_hello"); // /my_hello.jsp
		return mv;
	}
}







