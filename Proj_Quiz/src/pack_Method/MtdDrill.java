package pack_Method;

import java.util.Scanner;

public class MtdDrill {
	/*
	 * 메서드 정리
	 *
	 *
	// 필드 = 전역변수
	int variable;  
	
	public static void main(String[] args) {
		// 메서드 호출 = 코드 실행 = Call
		input(27); // 인수
		
		int num2; // local variable = 지역변수
	}
	
	// 메서드 정의 = definition
	public static void input(int num) { // 매개변수 
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 : ");
		num = scanner.nextInt();
		System.out.println("출력하신 정수는 : " + num + "입니다.");
		
		scanner.close();
	}
	*/
	
	/* 문제 *
	  3) 인수 27을 전달하고 전달받은 매개변수를 문자열로 만든 후
	     반환값으로 돌려받은 후 출력합니다.
    */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 : ");
		int num = scanner.nextInt();
		
		String txt = input(num); // txt의 값이 들어옴
		System.out.println("출력하신 정수는 : " + txt + "입니다.");
		
		scanner.close();
	}
	
	public static String input(int num) {
		String txt = num + "";
		
		return txt;
	}
}
