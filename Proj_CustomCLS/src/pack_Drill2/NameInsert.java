package pack_Drill2;

import java.util.Scanner;

public class NameInsert {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요 : ");
		String userName = scanner.nextLine();
		scanner.close();

		// 1. 커스텀 클래스를 메인클래스에서 사용하겠다.
		// 커스텀클래스의 객체생성
		DataProcess dataProcess = new DataProcess(userName);
		// 2. 사용자가 원하는 결과를얻어내기 위한 데이터 전송
	
		String res = dataProcess.test();
		System.out.println("본인이름 : " + res);
	}

}
