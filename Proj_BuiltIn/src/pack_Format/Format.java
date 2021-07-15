package pack_Format;

import java.text.NumberFormat;

public class Format {
	private double money;

	public Format(double money) {
		this.money = money;
	}


	public String mtd_Format() {
		NumberFormat nf = NumberFormat.getInstance();
		String salary = nf.format(money);
		return salary;
	}

}
