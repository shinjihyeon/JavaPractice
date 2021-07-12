package pack_CustomClassBasic;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		// 3) 메인메서드에서 숫자입력을처리할 수 있는 코드를 만듭니다.
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자입력 : ");
		double num = scanner.nextDouble();
		scanner.close();
		
		// 5) 메인메서드에서 커스텀 클래스의 객체를 생성합니다.
		Basic basic = new Basic(num);

		// 7) 메인 메서드에서 커스텀 클래스의 커스텀 메서드를 실행할 수 있는
		//    메서드 참조 코드를 만들고 실행하여 결과를 확인합니다.
		double res = basic.mtdCLS();
		
		System.out.println("필드에 지정된 숫자 X2 : " + res);
	   
	}

}
