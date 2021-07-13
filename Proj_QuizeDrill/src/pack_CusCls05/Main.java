package pack_CusCls05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.print("두개의 값을 입력하세요. : ");
		Scanner scanner = new Scanner(System.in);
		int start = scanner.nextInt();
		int end = scanner.nextInt();
		System.out.print("누적할 숫자 : ");
		String chkStr = scanner.next();
		int chkNum = 0; //짝수임을 가정함
		if(chkStr.equals("홀수")) chkNum = 1;
		scanner.close();

		int num1 = start;
		int num2 = end;
		if (start > end) {
			start = num2;
			end = num1;
		}
		Custom custom = new Custom(start, end, chkNum);
		int sum = custom.mtd_Sum();
		System.out.printf("%d에서 %d까지의  %s 누적 : %d", start, end, chkStr, sum);
	}

}
