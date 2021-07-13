package pack_CusCls02;

public class Salary {
	private int money;

	public Salary(int money) {
		this.money = money; // 필드 = 세전급여
	}
	
	public void mtd_Calc() {
		// 클래스를 객체로 만들어준다.
		// 필드를 초기화 시켜준다.
		double don = money - money * 0.033;
		System.out.println("실질급액 : " + don);
	}

}
