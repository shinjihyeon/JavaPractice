package pack_Inherit;

public class Avg extends Sum {

	public Avg() {
		
	}

	public Avg(int num1, int num2) {
		super(num1, num2);
	}
	
	public double mtdAvg() {
		// 커스텀 메서드 = 숫자 2개의 평균
		double avg = 0;
		avg = mtdSum() /2;
		return avg;
		
	}

}
