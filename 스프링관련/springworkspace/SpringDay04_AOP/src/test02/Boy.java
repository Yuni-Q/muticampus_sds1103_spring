package test02;

import java.util.Random;

public class Boy implements Person {

	@Override
	public void makeFood() throws Exception {
		/////////////// �ٽ� ���ɻ���///////////////////
		System.out.println("���̸� �����.");
		if (new Random().nextBoolean())
			throw new Exception("�ҳ���!!!!");
		////////////////////////////////////////////////
	}

}
