package day_26.ex1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("2^n << 원하는 숫자를 입력하세요 : ");
		int j = sc.nextInt();
		int k = sum(j);
		System.out.println(k);
	}
	public static int sum(int n) {
		int z = 1;
		for(int i = 0;i<n;i++) z *=2;
		return z;
	}
}