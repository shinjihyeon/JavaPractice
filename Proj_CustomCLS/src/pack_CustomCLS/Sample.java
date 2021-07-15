package pack_CustomCLS;

public class Sample {

	int a = 10; // 변수 => 필드(전역변수)
				// 클래스 레벨에서 만든다
	
	// 생성자 Constructor
	public Sample(int a) {
		this.a = a; // this.필드명 = 매개변수명
	}
	
	public static void main(String[] args) {

		int b = 20 ; // 변수 => 지역변수
					 // 메서드 레벨에서 만든다.
	}

	public static void customMtd() {
		int c = 30; // 변수 => 지역변수
	}
}
