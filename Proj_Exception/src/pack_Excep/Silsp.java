package pack_Excep;

import java.util.Scanner;

public class Silsp {

	public static void main(String[] args) throws Exception {

		try {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫번째 숫자 입력 : ");
		int num1 = scanner.nextInt();
		System.out.println("두번째 숫자 입력 : ");
		int num2 = scanner.nextInt();
		
		int res = num1 / num2;
		System.out.println("나눗셈 결과 : " + res);

		scanner.close();
		} catch (Exception e) {
			
			System.out.println("예외발생이유" + e.getMessage());
		} finally {
			System.out.println("계산결과를 보고 추가로 입력하실 내용이 있으신가요?");
		}
		
		}
	}


