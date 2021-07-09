package pack_For;

import java.util.Scanner;

public class ForBasic {

	public static void main(String[] args) {

		System.out.print("숫자를 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		System.out.println(num + "의 약수");
		
		for(int i = 1; i <= num; i++) {
			
			if(num % i == 0) {
				System.out.print(i);
				
				if(num > i) {
					
					System.out.print(",");
				}
			}
			
		}
		
		scanner.close();
	}
}
