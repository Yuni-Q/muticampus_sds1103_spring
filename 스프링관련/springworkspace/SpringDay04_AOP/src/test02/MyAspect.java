package test02;

// ���� ���ɻ��� ���� Ŭ����
public class MyAspect {
	// before ��������Ʈ�� ������ �޼ҵ�
	public void beforeFood(){
		System.out.println("�谡������.");
	}
	
	// after-returning ��������Ʈ�� ������ �޼ҵ�
	public void completeFood(){
		System.out.println("������ �Դ´�.");
	}
	
	// after-throwing ��������Ʈ�� ������ �޼ҵ�
	public void foodFire(){
		System.out.println("�ҳ��� ���� �θ�.");
	}
	
	// after�� ������ �޼ҵ�
	public void allFinish(){
		System.out.println("�������� �Ѵ�.");
	}
}
