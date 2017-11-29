package test02_2;

// test02 는 생성자를 통해 의존 객체 주입받고
// test02_2 는 설정자(setter)를 통해 의존 객체 주입받음.
public class Car {
	private Tire tire;
	
	public void setTire(Tire tire) {
		this.tire = tire;
	}
	
	public void showCarInfo(){
		System.out.println("현재 장착 타이어:" + tire.getModel());
	}
}