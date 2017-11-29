package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import vo.BookVO;
// books 테이블에 SQL을 전달하는 DB작업들을 담당하는 클래스
public class BookDao {
	private static final String DRIVER_NAME = 
									"com.mysql.jdbc.Driver";
	private static final String DB_URL = 
									"jdbc:mysql://127.0.0.1:3306/java";
	private static final String DB_ID = "root";
	private static final String DB_PW = "sds1103";
////////////////////////////////////////////////////////////////
	public BookDao(){
		try {
			// 드라이버 로딩
			Class.forName(DRIVER_NAME);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 오류. jar 파일이나 스트링 확인 요망");
			e.printStackTrace();
		}
	}
	
	public int insert(BookVO book){
		Connection con = null;
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			con = DriverManager.getConnection(DB_URL, DB_ID, DB_PW);
			String sql = "INSERT INTO BOOKS(TITLE,PUBLISHER,PRICE,YEAR)"
					+ " VALUES(?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, book.getTitle());
			pstmt.setString(2, book.getPublisher());
			pstmt.setInt(3, book.getPrice());
			pstmt.setString(4, book.getYear());
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			if(pstmt!=null)
				try {pstmt.close();} catch (SQLException e) {}
			if(con!=null)
				try {con.close();} catch (SQLException e) {}
		}
		return result;
	}
	
//	public int update(BookVO book){
//		
//	}
	
	public int delete(int bookNum){
		Connection con = null;
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			con = DriverManager.getConnection(DB_URL, DB_ID, DB_PW);
			String sql = "DELETE FROM BOOKS WHERE BOOK_NUM=?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bookNum);
			
			result = pstmt.executeUpdate(); // sql 실행
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			if(pstmt!=null)
				try {pstmt.close();} catch (SQLException e) {}
			if(con!=null)
				try {con.close();} catch (SQLException e) {}
		}
		return result;
	}
	
	public BookVO selectOne(int bookNum){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BookVO result = null;
		
		try {
			con = DriverManager.getConnection(DB_URL, DB_ID, DB_PW);
			String sql = "SELECT BOOK_NUM,TITLE,PUBLISHER,PRICE,YEAR"
					+ "FROM BOOKS WHERE BOOK_NUM=?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bookNum);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()){
				result = new BookVO();
				result.setBookNum(rs.getInt(1));
				result.setTitle(rs.getString(2));
				result.setPublisher(rs.getString(3));
				result.setPrice(rs.getInt(4));
				result.setYear(rs.getString(5));
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs!=null)
				try {rs.close();} catch (SQLException e) {}
			if(pstmt!=null)
				try {pstmt.close();} catch (SQLException e) {}
			if(con!=null)
				try {con.close();} catch (SQLException e) {}
		}
		return result;
	}
	
	public List<BookVO> selectAll(){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<BookVO> bookList = new ArrayList<>();
		
		try {
			con = DriverManager.getConnection(DB_URL, DB_ID, DB_PW);
			String sql = "SELECT BOOK_NUM,TITLE,PUBLISHER,PRICE,YEAR "
					+ "FROM BOOKS";
			
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				BookVO book = new BookVO();
				book.setBookNum(rs.getInt(1));
				book.setTitle(rs.getString(2));
				book.setPublisher(rs.getString(3));
				book.setPrice(rs.getInt(4));
				book.setYear(rs.getString(5));
				
				bookList.add(book);
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs!=null)
				try {rs.close();} catch (SQLException e) {}
			if(pstmt!=null)
				try {pstmt.close();} catch (SQLException e) {}
			if(con!=null)
				try {con.close();} catch (SQLException e) {}
		}
		return bookList;
	}
}








