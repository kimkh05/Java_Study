package day_26.pro2;

import java.util.Scanner;

public class No7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a;
		System.out.print("정수를 입력하세요 : ");
		a = in.nextInt();
		System.out.println((a%4==0) && (a%5==0));
		System.out.println((a%4==0) || (a%5==0));
		System.out.println((a%4==0) ^ (a%5==0));		
	}
}
