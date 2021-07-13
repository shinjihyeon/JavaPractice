package pack_CusCls01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("값을 입력하세요 : ");
		int num = scanner.nextInt();
		Sample obj = new Sample(num);
		scanner.close();
		
		obj.mtdPrint();
	}

}
