package pack_InOut;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("급여를 입력해 주세요 (단위, 원) : ");
		int pay = scanner.nextInt();
		int real = pay - (int)(pay * 0.033);
		scanner.close();
		
		System.out.println(real);
	}

}
