package pack_Drill;
		// 커스텀 클래스
public class PulsCLS {

	// 2.전달한 데이터를 저장하는 필드(변수) 필요
	int num1;
	int num2;
	
	// 2.생성자 의 매개변수로 전달
	public PulsCLS(int num1, int num2) {
		// 필드값으로 초기화
		this.num1 = num1;
		this.num2 = num2;
	}
	
	// 3. 커스텀메서드
	public int mtdPlus() {
		// 3. 초기화된 필드를 커스텀 메서드를 사용하여 덧셈
		int res = num1 + num2;
		
		// 3. 메인에서 실행하기 위해 리턴
		return res;
	}
	
}

