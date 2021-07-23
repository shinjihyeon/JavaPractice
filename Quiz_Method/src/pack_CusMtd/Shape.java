package pack_CusMtd;

import java.util.Scanner;

public class Shape {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요(1~10) : ");
		int num = scanner.nextInt();
		scanner.close();
		if (1 <= num && num <= 10) {
			mtd_Shape(num);
		} else {
			System.out.println("1이상 10이하의 정수만 입력가능함.");
		}
		
	}

	static public void mtd_Shape(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}
