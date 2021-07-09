package pack_If;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		double num1;
		double num2;
		double res = 0;
		System.out.println("========< 메뉴 >========");
		System.out.println("1. 덧셈(add)");
		System.out.println("2. 뺄셈(sub)");
		System.out.println("3. 곱셈(mul)");
		System.out.println("4. 나눗셈(div)");
		System.out.println("=======================");
		
		System.out.println("원하는 메뉴를 선태하세요 : ");
		Scanner scanner = new Scanner(System.in);
		int menu = scanner.nextInt();
		System.out.println("두개의 숫자를입력하세요 : ");
		num1 = scanner.nextDouble();
		num2 = scanner.nextDouble();
		scanner.close();
		
		if(menu == 1) {
			res = num1 + num2;
		}
		else if(menu == 2) {
			res = num1 - num2;
		}
		else if(menu == 3) {
			res = num1 * num2;
		}
		else if(menu == 4) {
			res = num1 / num2;
		}
		System.out.printf("결과 값은 %.2f 입니다.", res);
	}

}
