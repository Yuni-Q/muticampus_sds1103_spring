package test02_2;


// ex) oracle 버전의 Dao
public class ChinaTire implements Tire{

	@Override
	public String getModel() {
		// ex) oracle 버전의 insert 구현
		return "대륙";
	}
}
