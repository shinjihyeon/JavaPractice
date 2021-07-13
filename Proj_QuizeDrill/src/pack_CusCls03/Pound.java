package pack_CusCls03;

public class Pound {

	private double kilo;

	public Pound(double kilo) {
		this.kilo = kilo;
	}
	
	public void mtdChange() {
		double lb = 2.2;
		double res = 0.0;
		double pound = 2.2 * this.kilo;
		System.out.printf("파운드(lb) : %.1f lb", pound);;
	}
}
