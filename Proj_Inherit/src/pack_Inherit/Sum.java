package pack_Inherit;

public class Sum {
	// 2. 커스텀클래스 1번에서는 숫자 2개의 합 산출
	
	private int num1;
	private int num2;

	public Sum() {
	}
	
	// 객체를 만들고 필드를 초기화 한다.
	public Sum(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	//커스텀메서드
	public int mtdSum() {
		int sum = num1 + num2;
		return sum;
	}
	
	
	
	
	
	
}
