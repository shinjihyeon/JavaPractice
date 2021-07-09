package pack_Operator;

import java.util.Scanner;

public class ChkOddEven {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 : " );
		int num=scanner.nextInt();
		
		String str = (num % 2 == 0) ? "짝수" : "홀수";
		System.out.println("입력하신 숫자는 " + str + "입니다");
		
		scanner.close();
		
		
		
		
	}

}
