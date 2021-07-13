package pack_CusCls02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("세전급여를 입력해 주세요.(단위. 원) : ");
		int money = scanner.nextInt();
		scanner.close();
		
		// 객체를 만드는 것
		Salary obj = new Salary(money);
		obj.mtd_Calc();

	}

}
