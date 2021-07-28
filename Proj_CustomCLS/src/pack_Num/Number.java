package pack_Num;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 세 개를 입력하세요 : ");
		double[] num = new double[3];
		for (int i = 0; i <= num.length; i++) {
			num[i] = scanner.nextDouble();
		}
		scanner.close();
		
		Comparison comparison = new Comparison(num);
		comparison.mtd_Com();
		
	}

}
