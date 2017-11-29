package test04_1;


// ex) oracle 버전의 Dao
public class ChinaTire implements Tire{

	@Override
	public String getModel() {
		// ex) oracle 버전의 insert 구현
		return "대륙";
	}
}
