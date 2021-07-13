package pack_CusCls03;

import java.util.Scanner;

public class Conversion {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Kg을 입력해주세요 : ");
		double kilo = scanner.nextDouble();
		scanner.close();
		
		Pound pound = new Pound(kilo);
		pound.mtdChange();
	}

}
