package day_26.pro2;

import java.util.Scanner;

public class No8 {
	public static void main(String[] args) {
		int num;
		int sum = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("0~999 사이의 숫자를 입력하세요 : ");
		num = in.nextInt();
		for( ; num!=0;) {
			sum += num%10;
			num /= 10;
		}
		System.out.println("각 자릿수의 합 = " + sum);
	}
}