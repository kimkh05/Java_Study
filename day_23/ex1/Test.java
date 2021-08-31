package day_23.ex1;

public class Test {
	public static void main(String[] args) {
		// 출력
		System.out.println("Hello World!");
		System.out.println("Hello "+ "World!");
		
		// 변수 선언
		String name = "Hi!"; 
		System.out.println(name);
		
		// $, _로 시작 가능 
		String $hi = "name"; 
		System.out.println($hi);
		
		// 변수의 이름 대소문자 구분이 있음. 
		String Name = "Hello";
		System.out.println(Name);
		
		/*String class = "hey";*/ // class는 변수 이므로 사용 불가하다. 
		
		// 기본 타입 정리
		int a = 0xF;//정수타입
		System.out.println(a);
		
		char c; //문자타입
		
		
		double d = 5E-1; //실수타입
		//가수 : 5 //지수 : -1
		double m = 5*3.14;
		//5가 형변환으로 5.0으로 바뀐다. 
		
		//double > float > long > int > short, char > byte(데이터 타입의 변환 기준의 순서)
		int n = (int)1.0;
		
		
		float f; // 실수타입
		
		
		long l = 30L;//정수타입
		System.out.println(l);
		
		short sh = 017;//정수타입
		System.out.println(sh);
		
		byte by = 0b1111; //정수타입
		System.out.println(by);
		
		boolean bu = true;
		
		
	}
}
