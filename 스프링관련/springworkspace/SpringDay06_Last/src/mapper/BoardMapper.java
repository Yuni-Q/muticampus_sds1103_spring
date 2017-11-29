package mapper;

import java.util.List;
import java.util.Map;

import vo.BoardVO;

public interface BoardMapper {
	public int selectTotalCount(); //총 게시글의 갯수
	public List<BoardVO> selectList(Map<String, Integer> param); // 한 페이지에 보여줄 글 여러개 조회
	public BoardVO select(int articleNum); // 글 읽을때 하나의 글 조회
	public int updateReadCount(int articleNum); // 조회수 증가
	public int insert(BoardVO article); // 글쓰기
}
