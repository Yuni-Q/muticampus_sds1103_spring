package test06;

import org.springframework.stereotype.Component;

// ex) oracle 버전의 Dao
@Component	//("chinaTire")
public class ChinaTire implements Tire{

	@Override
	public String getModel() {
		// ex) oracle 버전의 insert 구현
		return "대륙";
	}
}
