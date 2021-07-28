package pack_Num;

public class Comparison {
	
	private double[] num;
	
	public Comparison(double[] num) {
		this.num = num;
	}

	public void mtd_Com() {
		double temp = 0;
		if(num[0]<num[1]) {
			temp = num[0];
			num[0] = num[1];
			num[1] = temp;
		}
		if(num[0]<num[2]){
			temp = num[0];
			num[0] = num[1];
			num[1] = temp;
		}
		if(num[1]<num[2]){
			temp = num[1];
			num[1] = num[2];
			num[2] = temp;
		}
		for (int j = 0; j < num.length; j++) {
			System.out.println(num[j]);
		}
	}

}
