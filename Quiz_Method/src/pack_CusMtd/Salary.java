package pack_CusMtd;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("세전급여를 입력해 주세요 : ");
		int money = scanner.nextInt();
		scanner.close();
		
		mtd_Salary(money);
	}
	
	static public void mtd_Salary(int money) {
		
		int salary = money - (int)(money*0.033);
		
		System.out.printf("실지금액 : %d원", salary);
	}

}
