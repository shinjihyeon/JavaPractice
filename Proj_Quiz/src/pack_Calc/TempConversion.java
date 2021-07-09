package pack_Calc;

import java.util.Scanner;

public class TempConversion {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.printf("화씨 온도를 입력하세요 : ");
		int f_Temp = scanner.nextInt();
		
		double c_Temp = 5/(double)9 * (f_Temp-32); // 형변환
		
		System.out.printf("섭씨 온도는 %.1f 입니다.", c_Temp);
		
		scanner.close();
	}

}
