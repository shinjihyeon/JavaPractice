package pack_CusCls06;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("배열의 크기 설정 : ");
		int size = scanner.nextInt();
		double[] array = new double[size];
		
		System.out.printf("입력하실 숫자 %d개를 입력해 주세요 : ", size);
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextDouble();
		}
		scanner.close();
		
		Revert revert = new Revert(array);
		revert.mtd();
	}

}
