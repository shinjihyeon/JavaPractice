package pack_Quiz;

import java.util.Scanner;

public class NumberCount {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자를 입력하세요 : ");
		int number1 = scanner.nextInt();
		System.out.print("두 번째 숫자를 입력하세요 : ");
		int number2 = scanner.nextInt();
		
		for(int i = number1; i <= number2; i++) {
			int[] count = new int[i];
		}
	}
	
}
