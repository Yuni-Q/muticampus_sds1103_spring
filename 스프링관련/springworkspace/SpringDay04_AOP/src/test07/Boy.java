package test07;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
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
