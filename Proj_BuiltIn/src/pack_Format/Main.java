package pack_Format;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.print("세전급여를 입력해 주세요(단위. 원) : ");
		Scanner scanner = new Scanner(System.in);
		int money = scanner.nextInt();
		scanner.close();
		
		Money obj = new Money(money);
		String salary = obj.mtd_Money();
		System.out.print("실질금액 : " + salary + "원");
	}

}
