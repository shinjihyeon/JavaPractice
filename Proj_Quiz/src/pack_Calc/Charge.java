package pack_Calc;

import java.util.Scanner;

public class Charge {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("전기 사용량을 입력하세요(kw) : ");
		int use = scanner.nextInt(); //use사용량
		
		/* 직업 관련 정보 *
		 * 전체 사용 요금 = 기본요금 + (사용량 * kw당 사용요금)
		 * 1차 요금 =       660   + (use * 88.5)
		 * total + use + pay => totUsePay 전체사용요금 (= 1차 요금) 
		 */
		int basePay = 660;
		double payPerKW = 88.5;
		double totUsePay = basePay + (use * payPerKW);
		
		//System.out.println("totUsePay : " + totUsePay);
		double taxRate = 0.09;
		
		double endCharge = totUsePay + totUsePay * taxRate; // 세후사용요금
		System.out.printf("전기 사용 요금(세후 사용 요금)은 %.1f원입니다.", endCharge);
		
		scanner.close();

	}

}
