package pack_Input;

import java.util.Scanner;

public class input {

	public static void main(String[] args) {
		
		// 1.입력을 받기 위해 필요한 Scanner class
		Scanner scanner = new Scanner(System.in);
		
		// 2. 입력 받기 위한 출력용 안내 메시지 작성
		System.out.println("구매하실 상품 갯수를 입력하세요. : ");
		
		// 3. Scanner class 변수를 사용하여 규칙에 맞는 입력코드를 작성한다.
			// 1) 정수입력 => scanner.nextInt();
			// 2) 실수입력 => scanner.nextDouble();
			// 3) 문자열입력 => scanner.nextLine();
		
		int insert = scanner.nextInt();
		
		// 4. 입력받을 값을 사용할 코드를 작성한다.
		System.out.println("입력하신 갯수는 " + insert + "개 입니다."); 
		
		// 5. scanner class를 사용하지 않겠다고 정리한다.
		// scanner class변수.close();
		scanner.close();
		

	}

}
