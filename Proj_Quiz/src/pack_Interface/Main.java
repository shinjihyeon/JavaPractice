package pack_Interface;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("1개를 선택하세요");
		System.out.println("1.덧셈 2.뺄셈 3.곱셈 4.나눗셈");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("선택한 연산 : ");
		int calcCode = scanner.nextInt();
		
		System.out.println("\n 2. 연산에 이용할 숫자 2개 : ");
		double num1 = scanner.nextDouble();
		double num2 = scanner.nextDouble();
		scanner.close();
		System.out.println("---------------------\n");
		
		System.out.println("[처리결과]");
		
		Distribute obj = null; //참조자료형에 대해서 초기화값은 null을 사용함 
		
		switch (calcCode) {
		case 1: 
			obj = new Add(num1, num2);
			break;
		case 2: 
			obj = new Sub(num1, num2);
			break;
		case 3: 
			obj = new Times(num1, num2);
			break;
		case 4: 
			obj = new Div(num1, num2);
			break;
		}
		
		obj.calc();
		
	}

}
