package pack_Quiz;

import java.util.Scanner;

public class Conversion {

	public static void main(String[] args) {

		System.out.print("Inch 입력 : ");

		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		double inch = 2.54;
		System.out.println("입력하신 인치는 : " + number * inch + "cm 입니다.");
		scanner.close(); 
	}

}
