package test06;

import org.springframework.stereotype.Component;

// ex) mysql 버전의 Dao
@Component
public class KoreaTire implements Tire{

	@Override
	public String getModel() {
		// ex) mysql 문법의 insert 구현
		return "한국";
	}
}
