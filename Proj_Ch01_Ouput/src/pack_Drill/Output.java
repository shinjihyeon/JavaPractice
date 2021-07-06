package pack_Drill;

public class Output {

	public static void main(String[] args) {
	
		// 주석(Comment) , 설명글
		// 내용을 이해하기 위해 적어둔글
		// 변수 사용법 : 자료형 변수명 = 데이터;
		
		String username = "내친구"; // 변수의 선언과 초기화
		
		System.out.println(username);
		
		// 변수 2개 사용하여 동일한 결과 만들기
		int number1 = 2;
		double number2 = 3.5;
		
		System.out.println( number1 + number2 );
		
		// 출력할 때 안내메시지 함께 출력하기
		System.out.print(" 가진 돈은 " + 25000 + " 원 ");
		
		System.out.println("println");
		System.out.print("print");
		System.out.printf("printf");
	}

}
