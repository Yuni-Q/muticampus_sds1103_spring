package test01;

import java.util.Random;

public class Girl implements Person{

	@Override
	public void makeFood() {
		System.out.println("�谡 ������.");
		try{
			/////////////// �ٽ� ���ɻ���///////////////////
			System.out.println("�����̸� �����.");
			if (new Random().nextBoolean())
				throw new Exception("�ҳ���!!!!");
			////////////////////////////////////////////////
			// ���� �Ϸ�
			System.out.println("������ �Դ´�.");
		} catch(Exception ex){
			System.out.println(ex.getMessage());
			System.out.println("������ �θ���.");
		} finally {
			System.out.println("�������� �Ѵ�.");
		}
	}

}
