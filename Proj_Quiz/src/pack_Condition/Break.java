package pack_Condition;

import java.util.Scanner;

public class Break {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int sum = 0; // 누적을 위한 변수
		int num = 0; // 사용자 입력값
		
		for(int i = 1; i <= 100; i++) {
			System.out.print(i + ". 숫자입력(누적 " + sum + ") : ");
			num = scanner.nextInt();
			
			if(num == 999) {
				break;
			} else {
				sum += num;
			}
		}
		System.out.println("프로그램 종료!");
		scanner.close();
	}

}
