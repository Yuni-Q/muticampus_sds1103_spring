package test03;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
	
	public void myAround(ProceedingJoinPoint joinPoint){
		System.out.println("�谡 ������."); // before
		
		try {
			// �ٽɰ��ɻ���(���� or ������ �����)
			joinPoint.proceed();
			//////////////////////////////////
			// �ٽ� ���ɻ��� ���� ����(after-returning)
			System.out.println("������ �Դ´�.");
		} catch (Throwable e) {
			// �ٽɰ��ɻ��� ���� ���� ���ܹ߻��ؼ� �����.after-throwing
			System.out.println("������ �θ���.");
			e.printStackTrace();
		} finally {
			// ��·�� �ٽɰ��ɻ����� �����.after
			System.out.println("�������� �Ѵ�.");
		}
	}
}
