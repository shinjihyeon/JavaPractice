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


