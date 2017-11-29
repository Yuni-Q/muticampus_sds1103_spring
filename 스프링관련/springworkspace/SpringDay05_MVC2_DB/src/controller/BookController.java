package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import repository.BookDao;
import vo.BookVO;

// 현재 컨트롤러는 dispatcher-servlet.xml 파일에 등록되는 객체인데
// applicationContext.xml 파일에 있는 객체를 의존하는 상황
// 이럴 때 web.xml 파일에 객체 공유 부분을 작성해야 함.

@Controller
public class BookController {
	@Autowired
	private BookDao dao; 
	
	public void setDao(BookDao dao) {
		this.dao = dao;
	}
	
	@RequestMapping("/bookList.do")
	public ModelAndView bookList(){
		List<BookVO> bookList = dao.selectBookListAll();
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("bookList", bookList);
		mv.setViewName("book_list"); // /book_list.jsp 파일로 보내기
		
		return mv;
	}
	
	@RequestMapping("/addForm.do")
	public String addBookForm(){
		return "add_book_form"; // 뷰이름임. /add_book_form.jsp
	}
	
	@RequestMapping(value="/addBook.do", method=RequestMethod.POST)
	public ModelAndView addBook(BookVO book){
		int result = dao.insertBook(book);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("addResult", result);
		mv.setViewName("add_result"); // add_result.jsp
		
		return mv;
	}

}








