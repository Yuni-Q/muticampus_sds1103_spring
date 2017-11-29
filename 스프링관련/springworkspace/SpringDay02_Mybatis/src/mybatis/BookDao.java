package mybatis;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import mybatis.mapper.BookMapper;

public class BookDao {
	private SqlSession session;

	public BookDao(){
		// ���̹�Ƽ���� ��� ���� ������ ����ִ� ����������
		// �ѹ� �о�鿩�� Ŀ�ؼ�, SQL ���� ����ִ� mapper �� ��� ����
		String resource = "mybatis/mybatis_conf.xml";
		InputStream is = null;

		try {
			is = Resources.getResourceAsStream(resource);
			SqlSessionFactory factory = 
					new SqlSessionFactoryBuilder().build(is);
			session = factory.openSession();
		} catch (IOException ex) {
			System.out.println("���̹�Ƽ�� �������� ����");
			ex.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public int insert(BookVO book){
		BookMapper mapper = session.getMapper(BookMapper.class);
		return mapper.insert(book);
	}
	
	public BookVO select(int bookNum){
		BookMapper mapper = session.getMapper(BookMapper.class);
		return mapper.selectBook(bookNum);
	}
	
	public List<BookVO> selectAllBook(){
		BookMapper mapper = session.getMapper(BookMapper.class);
		return mapper.selectAll();
	}
}






