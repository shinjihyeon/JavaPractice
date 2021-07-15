package pack_BuiltlnCLS;

import java.time.LocalDateTime;
import java.util.Scanner;

public class JuminMain {

	public static void main(String[] args) {
		// 95 02 08 - 2 ******
		// 01 23 45 6 7
		Scanner scanner = new Scanner(System.in);
		System.out.print("주민등록번호 입력 : ");
		String num = scanner.next();
		
		num = num.trim();
		
		scanner.close();
		
		// 성별구분코드
		String genderCode = num.substring(7,8);
		String gender = "";
		if(Integer.parseInt(genderCode) % 2 == 0) {
			gender = "Female";
		} else {
			gender = "Male";
		}
		// 나이산출코드
		String yearPrefix = ""; // 접두사
		switch (genderCode) {
		case "1", "2": 
			yearPrefix = "19";
			break;
		case "3", "4":
			yearPrefix = "20";
			break;
		default:
			break;
		}
		
		//출생년도 출력
		String birthYear = yearPrefix + num.substring(0,2);
		System.out.println("출생년도 : " + birthYear);
		 
		// Date now = new Date(); // deprecate
		// LocalDateTime 클래스 사용
		LocalDateTime date = LocalDateTime.now();
		System.out.println("now.Date() : " + date.getYear());
		int age = date.getYear()-Integer.parseInt(birthYear)+1;
		
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
	}

}
