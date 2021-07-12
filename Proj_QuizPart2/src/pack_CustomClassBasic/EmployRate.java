package pack_CustomClassBasic;

public class EmployRate {
	int employedNum;
	int graduatedNum;
	
	public EmployRate(int employedNum, int graduatedNum) {
		this.employedNum = employedNum;
		this.graduatedNum = graduatedNum;
	}

	public double mtdCalc() {
		double pct = ((double)employedNum/graduatedNum) * 100;
		return pct;
	}
}
