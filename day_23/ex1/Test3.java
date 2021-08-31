package day_23.ex1;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); //1~100000
		int s = n%5;
		System.out.println(s);
	}
}
