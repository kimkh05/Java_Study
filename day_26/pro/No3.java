package day_26.pro;

import java.util.Scanner;

public class No3 {
	public static void main(String[] args) {
		double r, h, l;
		double PI = 3.14;
		Scanner in = new Scanner(System.in);
		System.out.print("������� �ظ� ��������? ");
		r = in.nextDouble();
		System.out.print("������� ���̴�? ");
		h = in.nextDouble();
		l = (r*r)*PI*h;
		System.out.println("������� ���Ǵ� " + l);
	}
}
