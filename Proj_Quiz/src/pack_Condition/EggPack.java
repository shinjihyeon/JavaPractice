package pack_Condition;

import java.util.Scanner;

public class EggPack {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		int eggWeight = 0;
		int grade1Cnt = 0;
		
		while (true) {
			System.out.println("계란의 무게를입력하세요(단위는 g) : ");
			eggWeight = scanner.nextInt();
			
			if(eggWeight >= 300 ) {
				grade1Cnt++;
				
				if(grade1Cnt == 6) break; //6개가 채워지면 즉시 종료!
				System.out.println("현재 1등급 계란의 수 : " + grade1Cnt);
			}
		}
		System.out.println("제품 포장이 완료되었습니다!");
		scanner.close();
	}

}
