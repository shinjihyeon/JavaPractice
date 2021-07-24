package pack_Inherit;

import java.util.Scanner;

public class Main {
	// 1. 메인클래스에서 숫자 2개 입력받기
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 숫자 입력 : ");
		int num1 = scanner.nextInt();
		System.out.print("두번째 숫자 입력 : ");
		int num2 = scanner.nextInt();
		scanner.close();
		
		// 커스텀클래스사용한다. = 객체 만든다.
		Sum objSum = new Sum(num1, num2);
					  // 생성자
		int sum = objSum.mtdSum();
		
		System.out.printf("%d, %d의 합 : %d", num1, num2, sum);
	}

}
