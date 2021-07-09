package pack_InOut;

import java.util.Scanner;

public class Inch {

	public static void main(String[] args) {
		System.out.print("센티미터 길이 입력 : ");
		Scanner scanner = new Scanner(System.in);
		int cm = scanner.nextInt();
		scanner.close();
		double inch = cm / 2.54;
		System.out.printf("%d cm = %.1f inch", cm, inch);
	}

}
