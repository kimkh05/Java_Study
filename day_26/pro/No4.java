package day_26.pro;

import java.util.Scanner;

public class No4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int h, m, s;
		System.out.print("초 단위 정수를 입력하세요 : ");
		s = in.nextInt();
		m = s/60;
		h = m/60;
		s=s%60;
		m = m%60;
		System.out.println(h + "시간 " + m + "분 " + s + "초");
	}
}
