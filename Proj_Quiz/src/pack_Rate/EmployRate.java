package pack_Rate;

import java.util.Scanner;

public class EmployRate {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("취업자 수 : ");
		double employedNum = scanner.nextDouble();
		
		System.out.print("졸업자 수 : ");
		double graduatedNum = scanner.nextDouble();
		
		double pct = (employedNum / graduatedNum) * 100;
		System.out.printf("취업률 : %.1f", pct);
		
		scanner.close();
	}

}
