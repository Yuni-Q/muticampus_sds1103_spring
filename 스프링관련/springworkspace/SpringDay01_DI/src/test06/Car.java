package test06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// test02 는 생성자를 통해 의존 객체 주입받고
// test02_2 는 설정자(setter)를 통해 의존 객체 주입받음.
@Component("sonata")
public class Car {
	@Autowired
	private Tire tire;
	
	public void setTire(Tire tire) {
		this.tire = tire;
	}
	
	public void showCarInfo(){
		System.out.println("현재 장착 타이어:" + tire.getModel());
	}
}