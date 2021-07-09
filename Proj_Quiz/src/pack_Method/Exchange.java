package pack_Method;

import java.util.Scanner;

public class Exchange {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("기준환율 입력 : ");
		double exchangeRate = scanner.nextDouble();
		System.out.println("달러를 입력하세요: ");
		double dollar = scanner.nextDouble();		
		
		double exchangAmount = mtaRate(exchangeRate,dollar); //exchangAmount
		System.out.printf("환전액 : %.2f원" , exchangAmount);
		
		scanner.close();
		
	}
	
	public static Double mtaRate(double exchangeRate, double dollar) {
		
		double exchangAmount = exchangeRate * dollar;
		
		return exchangAmount;
	
	}

}
