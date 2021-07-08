package pack_If;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {

		System.out.println("숫자를 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		scanner.close();
		
		if(num % 3 == 0) {
			System.out.println("3의 배수입니다.");
		} else {
			System.out.println("3의 배수가 아닙니다.");
		}
	}

}
