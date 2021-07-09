package pack_Interface;

public class Sub implements Distribute {

	private double num1;
	private double num2;
	
	public Sub(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	@Override
	public void calc() {
		System.out.println("Sub 객체가 생성되었습니다,");
		System.out.println("calc 메서드가 생성되었습니다,");
		double res = num1 - num2;
		System.out.printf("계산 결과는 %.1f입니다", res);
	}
}
