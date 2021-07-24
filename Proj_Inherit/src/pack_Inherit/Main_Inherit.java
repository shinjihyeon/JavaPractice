package pack_Inherit;

import java.util.Scanner;

public class Main_Inherit {

	public static void main(String[] args) {
		// 상속의 개념 소스코드에 적용
		// 상속을 받는 이유 : 슈퍼클래스를 상속받은 서브클래스는
		// 				  객체로 만들었을 때 슈퍼클래스의 
		//				  모든 구성요소를 사용할 수 있다.
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 숫자 입력 : ");
		int num1 = scanner.nextInt();
		System.out.println("두번째 숫자 입력 : ");
		int num2 = scanner.nextInt();
		scanner.close();
		
		// 서브클래스의 객체 생성(슈퍼클래스의 모든 내용 사용 가능)
		Avg objAvg = new Avg(num1, num2);
		System.out.println("두 수의 합 : " + objAvg.mtdSum());
		System.out.println("두 수의 합 : " + objAvg.mtdAvg());
		
		
	}

}
