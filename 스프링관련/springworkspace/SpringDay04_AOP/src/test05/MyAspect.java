package test05;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

// ���� ���ɻ��� ���� Ŭ����
@Component
@Aspect
public class MyAspect {
	@Pointcut("execution(void makeFood())")
	public void myPoint(){}
	
	@Before("myPoint()")
	public void beforeFood(){
		System.out.println("�谡������.");
	}
	
	@AfterReturning("myPoint()")
	public void completeFood(){
		System.out.println("������ �Դ´�.");
	}
	
	@AfterThrowing("myPoint()")
	public void foodFire(){
		System.out.println("�ҳ��� ���� �θ�.");
	}
	
	@After("myPoint()")
	public void allFinish(){
		System.out.println("�������� �Ѵ�.");
	}
}
