package pack_CusCls08;

public class GrowthRate {
	private double[] growthRate;
	private double avg;

	public GrowthRate(double[] growthRate) {
		this.growthRate = growthRate;
	}
	// 9.3 5.3 5.7 8.4 8.1 4.8 2.1 -9.1 9.4 3.6
	public void avgRate() { // 평균 성장률
		double sum = 0.0;
		double avg = 0.0;
		for (int i = 0; i < growthRate.length; i++) {
			sum += growthRate[i];
		}
		avg = sum / growthRate.length;
		System.out.printf("평균 경제성장률 : %.2f \n", avg);

	}

	public void excAvgCnt() { // 평균성장률 초과 횟수
		int cnt = 0;
		for (int i = 0; i < growthRate.length; i++) {
			if(growthRate[i] > this.avg) {
				cnt++;
			}
		}
		System.out.print("평균 경제성장률을 초과한 횟수 : " + cnt);
	}

}
