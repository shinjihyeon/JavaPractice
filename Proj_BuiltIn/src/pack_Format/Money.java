package pack_Format;

public class Money {
	private int money;

	public Money(int money) {
		this.money = money;
	}
	
	public String mtd_Money() {
		double moneyParam = money - (money * 0.033);
		Format format = new Format(moneyParam);
		String salary = format.mtd_Format();
		return salary;
	}

}
