package pack_Array;

import java.util.Scanner;

public class Array6 {

	public static void main(String[] args) {

		System.out.print("임의의 숫자 5개를 입력하세요 : ");
		double[] num = new double[5];
		Scanner scanner= new Scanner(System.in);
		
		for(int i = 0; i < num.length; i++) {
			num[i] = scanner.nextDouble();
		}
		
		double max = num[0]; 
		for (int i = 0; i < num.length; i++) {
			if(num[i] > max) {
				max = num[i];
			}
		}
		System.out.println("가장 큰 값은 : " + max);
		scanner.close();
	}

}
