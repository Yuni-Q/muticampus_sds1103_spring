package vo;

import java.util.List;

// �Խ��� �������� �� ��Ͽ� �������� �� ������ ������� �뵵
public class BoardPageVO {
	private List<BoardVO> boardList; // ��Ͽ� ������ ���� �Խñ۵�
	private int currentPage; 	// ��� �ϴܿ� ������ ��ũ�� ���
	private int startPage;		// ��� �ϴܿ� ������ ��ũ�� ���
	private int endPage;		// ��� �ϴܿ� ������ ��ũ�� ���
	private int totalPage; 		// �� �������� �ʿ�����
////////////////////////////////////////////////////////////////
	public BoardPageVO(){
	}
	public BoardPageVO(List<BoardVO> boardList, int currentPage, int startPage, int endPage, int totalPage) {
		this.boardList = boardList;
		this.currentPage = currentPage;
		this.startPage = startPage;
		this.endPage = endPage;
		this.totalPage = totalPage;
	}
/////////////////////////////////////////////////////////////////	
	public List<BoardVO> getBoardList() {
		return boardList;
	}
	
	public void setBoardList(List<BoardVO> boardList) {
		this.boardList = boardList;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getStartPage() {
		return startPage;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	
	

}
