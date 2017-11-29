package test07;

import org.aspectj.lang.JoinPoint;
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
	// ������ �ٽɰ��ɻ��� �޼ҵ� �̸��� makeFood �̸� 
	// ��ȯ���� ���� ������� �Ķ���ʹ� 2���� �޼ҵ带 ��� �����ض�.
	@Pointcut("execution(* makeFood(*,*))")
	public void myPoint(){}
	
	@Before("myPoint()")
	public void beforeFood(JoinPoint joinPoint){
		Object[] params = joinPoint.getArgs();
		int a = (Integer)params[0];
		int b = (Integer)params[1];
		System.out.println("�谡������.");
		System.out.println
			("before ���� �̸� a,b �� �޾ƺô�." +a+ "/" +b);
	}
	@AfterReturning(pointcut="myPoint()", returning="result")
	public void completeFood(Object result){
		System.out.println("������ �Դ´�.���İ�� : " + result);
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


