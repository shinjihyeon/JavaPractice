package pack_Silsp;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("입금액을 입력하세요 :");
		double inputMoney = scanner.nextDouble();
		scanner.close();

		// 스캐너클래스 관련내용 사용 구간
		Sample sample = new Sample(inputMoney);
		
		sample.moneyPrint();
		
	}

}
