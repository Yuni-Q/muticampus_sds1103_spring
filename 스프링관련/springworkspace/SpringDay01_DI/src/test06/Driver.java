package test06;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext
					("test06/applicationContext.xml");
		
		Car myCar = context.getBean("sonata", Car.class);
		
		myCar.showCarInfo();
	}
}
