package pack_CusMtd;

import java.util.Scanner;

public class Exchange {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("환전액 입력 : ");
		double money = scanner.nextDouble();
		scanner.close();
		double res = mtd_Change(money);
		System.out.printf("환전 후 지급액 : %.1f USD", res);
	}

	static public double mtd_Change(double money) {
		double exRate = 1200;
		double doller = money / exRate;
		
		return doller;
	}
}
