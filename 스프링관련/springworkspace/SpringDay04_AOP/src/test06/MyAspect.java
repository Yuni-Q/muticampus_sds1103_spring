package test06;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Component
@Aspect // ������ɻ��� ���� Ŭ������
public class MyAspect {
	@Pointcut("execution(* makeFood(..))")
	public void myPoint(){}
	
	@Around("myPoint()")
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
