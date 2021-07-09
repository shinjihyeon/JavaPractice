package pack_NumberList;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.print("숫자를 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		scanner.close();
		
		OddList oddList = new OddList(number);
		
		oddList.mtdOdd();
		
	}

}
