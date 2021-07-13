package pack_CusCls07;

public class Custom {

	private int num;

	public Custom(int num) {
		this.num = num;
	}

	public void mtd() {
		int cnt = 0;
		
		for (int i = 2; i <= 50; i++) {
			if(i % num == 0) {
				System.out.print(i + " ");
				cnt++;
				if(cnt % 10 == 0) {
					System.out.println(" ");
				}
			}
		}
	}

}
