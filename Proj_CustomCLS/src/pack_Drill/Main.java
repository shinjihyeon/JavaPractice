package pack_Drill;

import java.util.Scanner;

			// 1.메인클래스
public class Main {
				// 1.메인메서드 => 입력받기
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 숫자 입력 : ");
		int num1 = scanner.nextInt();
		System.out.println("두번째 숫자 입력 : ");
		int num2 = scanner.nextInt();
		scanner.close();
		
		
		PulsCLS pulsCLS = new PulsCLS(num1, num2); // 2. 객체생성
		
		// 4. 커스텀클래스 커스텀메서드에서 실행된 결과를 메인에서 출력
		int res = pulsCLS.mtdPlus();
		System.out.println("(cuscomclass) res : " + res);
	}

}
