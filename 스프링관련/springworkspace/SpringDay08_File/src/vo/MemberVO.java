package vo;

import org.springframework.web.multipart.MultipartFile;

public class MemberVO {
	private String name;
	private String phone;
	private MultipartFile memberFile;
///////////////////////////////////////////////////////////////
	public MemberVO(){}
	public MemberVO(String name, String phone, MultipartFile file){
		this.name = name;
		this.phone = phone;
		this.memberFile = file;
	}
///////////////////////////////////////////////////////////////	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public MultipartFile getMemberFile() {
		return memberFile;
	}
	public void setMemberFile(MultipartFile memberFile) {
		this.memberFile = memberFile;
	}	
}
