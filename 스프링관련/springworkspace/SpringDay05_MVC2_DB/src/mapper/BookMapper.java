package mapper;

import java.util.List;

import vo.BookVO;

public interface BookMapper {
	public int insert(BookVO book); // -> SQL ��ɾ� �ϳ�
	public BookVO selectOne(int bookNum); // -> SQL ��ɾ� �ϳ�
	public List<BookVO> selectAll();	// -> SQL ��ɾ� �ϳ�
}
