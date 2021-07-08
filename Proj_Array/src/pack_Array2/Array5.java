package pack_Array2;

import java.util.Scanner;

public class Array5 {

	public static void main(String[] args) {
		
		System.out.println("임의의 숫자 다섯개를 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);
		double[] array = new double[5];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextDouble();
		}
		scanner.close();
		
		double min = array[0];
		for(int i =0; i < array.length; i++) {
			if(array[i] < min) {
				min = array[i];
			}
		}
		System.out.println("가장 작은 값은 " + min);
	}
}
