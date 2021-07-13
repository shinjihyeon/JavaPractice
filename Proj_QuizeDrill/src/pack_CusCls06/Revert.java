package pack_CusCls06;

public class Revert {
	
	private double array[];

	public Revert(double[] array) {
		this.array = array;
	}

	public void mtd() {
		for (int i = array.length-1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
	}
}
