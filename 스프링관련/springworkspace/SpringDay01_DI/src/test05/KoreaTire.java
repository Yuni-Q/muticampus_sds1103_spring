package test05;

import org.springframework.stereotype.Component;

// ex) mysql ������ Dao
@Component
public class KoreaTire implements Tire{

	@Override
	public String getModel() {
		// ex) mysql ������ insert ����
		return "�ѱ�";
	}
}
