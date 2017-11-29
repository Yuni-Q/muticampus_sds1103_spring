package test05;

import org.springframework.stereotype.Component;

// test02 �� �����ڸ� ���� ���� ��ü ���Թް�
// test02_2 �� ������(setter)�� ���� ���� ��ü ���Թ���.
@Component("sonata")
public class Car {
	private Tire tire;
	
	public void setTire(Tire tire) {
		this.tire = tire;
	}
	
	public void showCarInfo(){
		System.out.println("���� ���� Ÿ�̾�:" + tire.getModel());
	}
}