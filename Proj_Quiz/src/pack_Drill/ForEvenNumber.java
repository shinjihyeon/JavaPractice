package pack_Drill;

import java.util.Scanner;

public class ForEvenNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 입력 :");
		int first = scanner.nextInt();
		
		System.out.print("두 번째 숫자 입력 : ");
		int second = scanner.nextInt();
		scanner.close();
		
		System.out.println(first + "부터 " + second + "사이의 짝수");
		
		for(int i = first; i <= second; i++) {// 초기식 생각 잘하기 // 바보같이 못하지말고 생각 좀 더 하기.
			
			if(i %2 == 0) {
				System.out.print(i);
				
				if(i < second - 1) {
					System.out.print(",");
				}
			}
		}
	}
}
