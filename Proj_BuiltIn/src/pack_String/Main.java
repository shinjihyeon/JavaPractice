package pack_String;

public class Main {

	public static void main(String[] args) {
		String str = "gi305@naver.com";
		String ex = "     gi305@naver.com     ";
		// 본인의 이메일주소를 입력하세요.
		
		// 코드작성
		String userID = str.substring(0,5); // 0부터 5전까지
// 첫번째 인수 : 문자열에서 시작하는 인덱스 번호
// 두번째 인수 : 문자열에서 끝을 지정하는 인덱스 번호
//			  두번째 번호의 인덱스번호는 포함하지 않고 직전까지!
		
		System.out.println("입력하신 주소의 아이디 : " + userID);
		// 출력결과 1 => 글자의 갯수
		// 출력결과 2 => 특정부분만 반환
		System.out.println("인덱스 번호 10번의 값 : " + str.charAt(10));
		System.out.println("특정 문자열의 인덱스 번호 : " + str.indexOf("naver")); // n:6
		System.out.println("글자수 : " + str.length());
		System.out.println("공백 미제거 : " + ex);
		System.out.println("공백 제거 : " + ex.trim());
	}

}
