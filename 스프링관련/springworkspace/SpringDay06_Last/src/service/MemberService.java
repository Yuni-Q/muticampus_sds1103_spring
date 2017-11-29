package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import repository.MemberDao;
import vo.MemberVO;

// ȸ�����Կ� �ʿ��� ���� �Էµ��� �ʾҴ��� �˻��ϰų�,
// �α��� �۾� �� ����� ������ ��ġ�ϴ� ���̵�+�н����带 �Է��ϴ���
// �˻��ϴ� ���� �۾��� �����ϴ� Ŭ����
@Component
public class MemberService {
	@Autowired
	private MemberDao dao;
	
	public void setDao(MemberDao dao) {
		this.dao = dao;
	}
//////////////////////////////////////////////////////////////
	public boolean join(MemberVO member){
	// ȸ������ DB�� insert �ϱ� ���� �˻��� �� ������ ���⼭ �ϸ��.
		if(member==null || 
				member.getMemberId()==null || 
				member.getMemberPw()==null || 
				member.getPhone()==null){			
			return false;
		}else{
			dao.insert(member);
			return true;
		}
	}
	
	public boolean login(String inputId, String inputPw){
		MemberVO member = dao.select(inputId);
		if(member==null){
			// ���� ID ��
			return false;
		}else if(member.getMemberPw().equals(inputPw) == true){
			// ID�� �ְ� �н����� ��ġ
			return true;
		}else{
			// ID�� �ִµ� �н����� ����ġ
			return false;
		}
		
	}
	
}








