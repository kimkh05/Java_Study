package day_23.pro1;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("���簢���� ���� ���̸� �Է��ϼ��� : ");
		double w = in.nextDouble();
		System.out.print("���簢���� ���� ���̸� �Է��ϼ��� : ");
		double h = in.nextDouble();
		double area = w * h;
		System.out.println("���� : " + w);
		System.out.println("���� : " + h);
		System.out.println("���簢���� ���̴� " + area + "�Դϴ�.");
	}
}
