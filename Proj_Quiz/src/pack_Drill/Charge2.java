package pack_Drill;

import java.util.Scanner;

public class Charge2 {

	public static void main(String[] args) {
		// 변수선언
				int code;
				int use;
				int basic = 0;
				double kw = 0;
				double tax = 0;
				double charge1;
				double charge2;
				
				System.out.println("코드번호를 입력하세요(1- 가정용, 2: 산업용, 3- 교육용) : ");
				Scanner scanner = new Scanner(System.in);
				code = scanner.nextInt();
				
				System.out.println("전기 사용량을 입력하새요(kw) : ");
				use = scanner.nextInt();
				scanner.close();
				
				switch (code) {
					case 1: {
						basic = 1130;
						kw = 127.8;
						tax = 0.09;
						break;
					}
					case 2: {
						basic = 660;
						kw = 88.5;
						tax = 0.08;
						break;
					}
					case 3: {
						basic = 370;
						kw = 52.0;
						tax = 0.05;
						break;
					}
				}
				charge1 = basic + (use * kw);
				charge2 = charge1 + charge1 * tax;
				System.out.printf("전기요금은 %.0f원 입니다.", charge2);

	}

}
