package pack_InOut;

import java.util.Scanner;

public class InOut {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num1 = scanner.nextInt();
		
		System.out.printf("입력하신 정수는 %d 입니다.", num1);
		scanner.close();

	}

}
