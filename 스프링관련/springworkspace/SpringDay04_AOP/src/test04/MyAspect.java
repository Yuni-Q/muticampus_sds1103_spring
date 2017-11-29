package test04;

import org.aspectj.lang.JoinPoint;

// ���� ���ɻ��� ���� Ŭ����
public class MyAspect {
	
	// before ��������Ʈ�� ������ �޼ҵ�
	public void beforeFood(JoinPoint joinPoint){
		Object[] params = joinPoint.getArgs();
		int a = (Integer)params[0];
		int b = (Integer)params[1];
		System.out.println("�谡������.");
		System.out.println
			("before ���� �̸� a,b �� �޾ƺô�." +a+ "/" +b);
	}
	
	// after-returning ��������Ʈ�� ������ �޼ҵ�
	public void completeFood(Object result){
		System.out.println("������ �Դ´�.���İ�� : " + result);
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
