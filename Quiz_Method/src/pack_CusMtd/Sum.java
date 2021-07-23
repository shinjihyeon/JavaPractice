package pack_CusMtd;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {

		System.out.print("2개의 값을 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		scanner.close();
		int start = num1;
		int end = num2;
		if(num1 > num2) {
			start = num2;
			end = num1;
		}
		int res = mtd_Sum(start, end);
		System.out.printf("%d에서 %d까지의 누적 합 : %d", start, end, res);
	}
	
	static public int mtd_Sum(int start, int end) {
		
		int res= 0;
		for(int i = start; i <= end; i++) {
			res += i;
		}
		
		return res;
	}

}
