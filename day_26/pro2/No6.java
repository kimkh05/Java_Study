package day_26.pro2;

import java.util.Scanner;

public class No6 {
	public static void main(String[] args) {
		double f;
		double c;
		Scanner in = new Scanner(System.in);
		System.out.print("ȭ���µ��� �Է��ϼ��� : ");
		f = in.nextDouble();
		c = 5.0/9.0*(f-32.0);
		System.out.println("�����µ��� " + c);
	}
}
