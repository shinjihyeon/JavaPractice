package pack_CusCls08;

import java.util.Scanner;

public class GrowthRateMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("10년간의 경제성장률을 입력하세요 : ");
		double[] growthRate = new double[10];
		for (int i = 0; i < 10; i++) {
			growthRate[i] = scanner.nextDouble();
		}
		System.out.println();
		scanner.close();
		
		GrowthRate obj = new GrowthRate(growthRate);
		obj.avgRate(); // 평균 경제성장률
		obj.excAvgCnt(); // 평균 성장률 초과 횟수
	}

}
