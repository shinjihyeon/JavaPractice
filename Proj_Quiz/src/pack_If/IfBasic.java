package pack_If;

import java.util.Scanner;

public class IfBasic {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("숫자를 입력하세요 : ");
		int num = scanner.nextInt();
		String str = "";
		if(num % 2 == 0) {
			str = "짝";
		} else {
			str = "홀";
		}
		
		System.out.println(str + "수입니다.");
		
		scanner.close();
	}

}
