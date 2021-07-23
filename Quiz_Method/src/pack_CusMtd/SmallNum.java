package pack_CusMtd;

import java.util.Scanner;

public class SmallNum {

	public static void main(String[] args) {
		System.out.print("임의의 숫자를 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);
		double[] arry = new double[5];
		int i = 0;
		for(i = 0; i < arry.length; i++) {
			arry[i] = scanner.nextDouble();
		}
		double res= mtd_FindSmall(arry);
		System.out.println("가장 작은 수는 : " + res);
		scanner.close();
		
	}

	static public double mtd_FindSmall(double[] arry) {
		double min = arry[0];
		for(int i = 0; i < arry.length; i++) {
			if(min > arry[i]) {
				min = arry[i];
			}
		}
		return min;
	}
}
