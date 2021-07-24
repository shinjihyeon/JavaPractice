package pack_Inherit;

import java.util.Scanner;

public class MainAvg {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 숫자 입력 : ");
		int num1 = scanner.nextInt();
		System.out.print("두번째 숫자 입력 : ");
		int num2 = scanner.nextInt();
		scanner.close();
		
		Avg objAvg = new Avg(num1, num2);
		double avg = objAvg.mtdAvg();
		System.out.printf("%d, %d 의 평균 : %.2f", num1,num2,avg);;
	}

}
