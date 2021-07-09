package pack_NumberList;

public class OddList {

	private int number;

	public OddList(int number) {
		this.number = number;
	}

	public void mtdOdd() {
		int[] array = new int[number];
		for (int i = 0; i <= array.length; i++) {
			if (i % 2 == 1) {
				System.out.println(i + "  ");
			}
		}
	}

}
