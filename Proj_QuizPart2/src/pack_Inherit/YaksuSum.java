package pack_Inherit;

public class YaksuSum extends YaksuList {

	// 슈퍼클래스의 필드를 초기화하는 생성자 1개
	public YaksuSum(int num) {
		super(num);
	}

	@Override
	public void mtdYaksu() {
		System.out.println("\n약수의 총합");
		int sum = 0;
		int num = super.getNum();
		for (int i = 1; i <= num; i++) {
			if(num % i == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
