package pack_Input;

import java.util.Scanner;

public class Input_2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("거리(km)와 속력(km/h)을 입력하세요 : ");
		int km = scanner.nextInt();
		int km_h = scanner.nextInt();
		scanner.close();
		
		int h = km/km_h;
		int rest = km%km_h;
		System.out.printf("%d시간 소요되고 %dkm 남습니다.", h, rest);
		
		
	}

}

/*
 * Scanner scanner = new Scanner(System.in);
		System.out.println("전기사용량을 입력하세요(kw) : ");
		int use = scanner.nextInt();
		scanner.close();
		
		int basic = 660;
		double kw = 88.5;
		double total = basic + (use * kw);
		double se = 0.09;
		double endBill = total + total * se;
		System.out.printf("전기사용요금(세후사용요금)은 %.0f원 입니다.", endBill);*/

/*
 * Scanner scanner = new Scanner(System.in);
		System.out.println("몸무게를 입력하세요(kg) : ");
		double m =scanner.nextDouble();
		System.out.println("키를 입력하세요(cm) : ");
		double k = scanner.nextDouble();
		scanner.close();
		k /= 100;
		double BMI = m/Math.pow(k, 2);
		System.out.printf("BMI : %.1f", BMI);
 * */


