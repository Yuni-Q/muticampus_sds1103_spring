package mapper;

import vo.MemberVO;

public interface MemberMapper {
	public int insert(MemberVO member); // ȸ������ insert
	public MemberVO select(String id); // Ư�� ȸ�� ��ȸ
}
