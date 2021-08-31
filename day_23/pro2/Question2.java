package day_23.pro2;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = in.nextInt();
		if(num%2==0) System.out.println("짝수");
		else System.out.println("홀수");
	}
}
