package test04;

import java.util.Random;

public class Girl implements Person {

	@Override
	public String makeFood(int a, int b) throws Exception {
		/////////////// �ٽ� ���ɻ���///////////////////
		System.out.println(a+"�ÿ� ������ "+b+"�κ� ����� ����");
		System.out.println("�����̸� �����.");
		if (new Random().nextBoolean())
			throw new Exception("�ҳ���!!!!");
		////////////////////////////////////////////////
		return "���޴��� ȣ�η�";
	}

}
