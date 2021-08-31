package day_23.pro1;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("직사각형의 가로 길이를 입력하세요 : ");
		double w = in.nextDouble();
		System.out.print("직사각형의 세로 길이를 입력하세요 : ");
		double h = in.nextDouble();
		double area = w * h;
		System.out.println("가로 : " + w);
		System.out.println("세로 : " + h);
		System.out.println("직사각형의 넓이는 " + area + "입니다.");
	}
}
