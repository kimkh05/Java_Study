package day_26.pro2;

import java.util.Scanner;

public class No8 {
	public static void main(String[] args) {
		int num;
		int sum = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("0~999 ������ ���ڸ� �Է��ϼ��� : ");
		num = in.nextInt();
		for( ; num!=0;) {
			sum += num%10;
			num /= 10;
		}
		System.out.println("�� �ڸ����� �� = " + sum);
	}
}