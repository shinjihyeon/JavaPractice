package pack_Array;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("평균을 구할 숫자 4개를 입력하세요 : ");
		int[] num = new int[4];
		num[0] = scanner.nextInt();
		num[1] = scanner.nextInt();
		num[2] = scanner.nextInt();
		num[3] = scanner.nextInt();
		
		double sum = num[0] + num[1] + num[2] + num[3];
		double avg = sum / 4;
		System.out.printf("평균 : %.1f " ,avg );
		
		scanner.close();
		
		
	}

}
