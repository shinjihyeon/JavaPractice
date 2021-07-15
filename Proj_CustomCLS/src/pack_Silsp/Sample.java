package pack_Silsp;

public class Sample {

	// 내용 = 구성요소 
	// 1. 필드
	// 2. 생성자
	// 3. 커스텀메서드

	// 1.필드 = 전역변수 / 동적필드(사본이 계속 만들어짐)
	static double money = 0; 
	
	// 2.생성자
	public Sample(double money) {
		this.money = money; //객체를 생성하고 필드를 초기화한다.
							// this를 넣으면 필드임을 알리는 것.
	}
	
	// 3.커스텀 메서드
	public static void moneyPrint() { // 정적메서드(사본이 만들어져도 상대적으로 정적)
		System.out.println("필드 money : " + money);
	}

}
