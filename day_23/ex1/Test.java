package day_23.ex1;

public class Test {
	public static void main(String[] args) {
		// ���
		System.out.println("Hello World!");
		System.out.println("Hello "+ "World!");
		
		// ���� ����
		String name = "Hi!"; 
		System.out.println(name);
		
		// $, _�� ���� ���� 
		String $hi = "name"; 
		System.out.println($hi);
		
		// ������ �̸� ��ҹ��� ������ ����. 
		String Name = "Hello";
		System.out.println(Name);
		
		/*String class = "hey";*/ // class�� ���� �̹Ƿ� ��� �Ұ��ϴ�. 
		
		// �⺻ Ÿ�� ����
		int a = 0xF;//����Ÿ��
		System.out.println(a);
		
		char c; //����Ÿ��
		
		
		double d = 5E-1; //�Ǽ�Ÿ��
		//���� : 5 //���� : -1
		double m = 5*3.14;
		//5�� ����ȯ���� 5.0���� �ٲ��. 
		
		//double > float > long > int > short, char > byte(������ Ÿ���� ��ȯ ������ ����)
		int n = (int)1.0;
		
		
		float f; // �Ǽ�Ÿ��
		
		
		long l = 30L;//����Ÿ��
		System.out.println(l);
		
		short sh = 017;//����Ÿ��
		System.out.println(sh);
		
		byte by = 0b1111; //����Ÿ��
		System.out.println(by);
		
		boolean bu = true;
		
		
	}
}
