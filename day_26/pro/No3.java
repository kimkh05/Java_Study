package day_26.pro;

import java.util.Scanner;

public class No3 {
	public static void main(String[] args) {
		double r, h, l;
		double PI = 3.14;
		Scanner in = new Scanner(System.in);
		System.out.print("원기둥의 밑면 반지름은? ");
		r = in.nextDouble();
		System.out.print("원기둥의 높이는? ");
		h = in.nextDouble();
		l = (r*r)*PI*h;
		System.out.println("원기둥이 부피는 " + l);
	}
}
