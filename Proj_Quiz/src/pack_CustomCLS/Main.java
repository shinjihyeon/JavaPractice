package pack_CustomCLS;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.print("홀/짝수 출력선택 (1.홀수, 2.짝수) : ");
		Scanner scanner = new Scanner(System.in);
		int code = scanner.nextInt();
		System.out.println("숫자를 입력하세요 : ");
		int num = scanner.nextInt();
		scanner.close();
		OddEven even = new OddEven(num);
		
		if(code == 1) {
			even.odd();
		}
		if(code == 2) {
			even.even();
		}
	}

}
