package day_26.pro;

import java.util.Scanner;

public class No2 {
	public static void main(String[] args) {
		int num;
		Scanner in = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		num = in.nextInt();
		System.out.println(num + "의 제곱은 " + num*num);
	}
}
