package pack_CusCls05;

public class Custom {

	private int start;
	private int end;
	private int chkNum;

	public Custom(int start, int end, int chkNum) {
		this.start = start;
		this.end = end;
		this.chkNum = chkNum;
	}

	public int mtd_Sum() {

		int sum = 0;
		for (int i = start; i < end; i++) {
			if(i%2 == chkNum) sum+=i;
		}
		return sum;
	}
}
