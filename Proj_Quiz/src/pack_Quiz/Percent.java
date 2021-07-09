package pack_Quiz;

import java.util.Scanner;

public class Percent {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("응시자 수 : ");
		double num1 = scanner.nextDouble();  // 정수->실수

		System.out.print("합격자 수 : ");
		double num2 = scanner.nextDouble();  // 정수->실수

		double result = (num2 / num1) * 100;  

		System.out.printf("합격률(%%) : %.1f%%", result);
		scanner.close();

	}

}
