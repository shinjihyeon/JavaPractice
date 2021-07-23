package pack_CusMtd;

import java.util.Scanner;

public class CntOdd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 두개를 입력하세요 : ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		scanner.close();
		
		Odd(num1, num2);
		
	}

	static public void Odd(int num1, int num2) {
		int odd = 0;
		for (int i = num1; i <= num2; i++) {
			if(i % 2 == 1) {
				odd++;
			}
		}
		System.out.printf("%d에서 %d까지의 홀수 갯수 : %d", num1, num2, odd);
	}
}
