package pack_CusCls07;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("배수를 구할 정수를 입력해주세요 : ");
		int num = scanner.nextInt();
		if (num <= 0) {
			System.out.println("올바른 값을 입력하세요. 프로그램을 종료합니다.");
		} else {
			Custom custom = new Custom(num);
			custom.mtd();
		}
		scanner.close();
	}

}
