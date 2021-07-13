package pack_CusCls04;

import java.util.Scanner;

public class Shape {

	public static void main(String[] args) {
		System.out.print("숫자를 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		scanner.close();
		
		NumRectangle numRectangle = new NumRectangle(num);
		numRectangle.mtdRect();
	}

}
