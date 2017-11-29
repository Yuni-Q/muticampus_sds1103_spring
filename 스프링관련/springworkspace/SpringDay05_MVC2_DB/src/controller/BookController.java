package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import repository.BookDao;
import vo.BookVO;

// ���� ��Ʈ�ѷ��� dispatcher-servlet.xml ���Ͽ� ��ϵǴ� ��ü�ε�
// applicationContext.xml ���Ͽ� �ִ� ��ü�� �����ϴ� ��Ȳ
// �̷� �� web.xml ���Ͽ� ��ü ���� �κ��� �ۼ��ؾ� ��.

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
		mv.setViewName("book_list"); // /book_list.jsp ���Ϸ� ������
		
		return mv;
	}
	
	@RequestMapping("/addForm.do")
	public String addBookForm(){
		return "add_book_form"; // ���̸���. /add_book_form.jsp
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








