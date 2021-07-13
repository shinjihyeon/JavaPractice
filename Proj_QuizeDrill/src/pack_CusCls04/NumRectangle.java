package pack_CusCls04;

public class NumRectangle {

	private int num;

	public NumRectangle(int num) {
		this.num = num;
	}

	public void mtdRect() {
		int k = 1;

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(" " + k++ + " ");
				
				if(k > num) k =1;
			}
			System.out.println();
		}
	}
}
