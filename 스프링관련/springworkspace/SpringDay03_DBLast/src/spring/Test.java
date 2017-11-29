package spring;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import repository.BookDao;
import vo.BookVO;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
			new ClassPathXmlApplicationContext
				("/spring/applicationContext.xml");
		
		BookDao dao = (BookDao)context.getBean("bookDao");
		
//		System.out.println("test");
		
//		int result = dao.insertBook(new BookVO("test", "spring", 1000, "2011"));
//		System.out.println("result:"+result);
		for(BookVO b: dao.selectBookListAll()){
			System.out.println(b);
		}
	}
}
