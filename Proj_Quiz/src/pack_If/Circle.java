package pack_If;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		
		System.out.print("반지름을 입력하세요 : ");
		Scanner scanner= new Scanner(System.in);
		int radius = scanner.nextInt();
		scanner.close();
		
		double square = Math.PI * Math.pow(radius, 2); 
		System.out.println("면적 : " + square);

	}

}
