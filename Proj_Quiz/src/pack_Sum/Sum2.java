package pack_Sum;

import java.util.Scanner;

public class Sum2 {

	public static void main(String[] args) {
		System.out.print("두개의 값을 입력하세요 : ");
		Scanner scanner= new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		scanner.close();
		
		int res= 0;
		int start = num1;
		int end = num2;
		
		if(num1 > num2) {
			start = num2;
			end = num1;
		}
		
		for(int i = start; i <= end; i++ ) {
			res += i;
		}
		System.out.printf("%d부터 %d까지의 누적 합 : %d", start, end, res);

	}

}
