package mybatis.mapper;

import java.util.List;

import mybatis.BookVO;

// Ǯ ��Ű���� : mybatis.mapper.BookMapper
public interface BookMapper {
	public int insert(BookVO book);
	public BookVO selectBook(int bookNum);
	public List<BookVO> selectAll();
}
