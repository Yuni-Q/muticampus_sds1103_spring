package test04;

import java.util.Random;

public class Boy implements Person {

	@Override
	public String makeFood(int a, int b) throws Exception {
		/////////////// �ٽ� ���ɻ���///////////////////
		System.out.println("���̸� �����." +a+ "/" +b);
		if (new Random().nextBoolean())
			throw new Exception("�ҳ���!!!!");
		////////////////////////////////////////////////
		return "��� ������ ����";
	}

}
