package pack_CustomCLS;

public class OddEven {

	private int num;

	public OddEven(int num) {
		this.num = num;
	}
	
	public void odd() {
		int[] array = new int[num];
		for (int i = 0; i < array.length; i++) {
			if(i % 2 == 1) {
				System.out.println(i + " ");
			}
		}
	}
	
	public void even() {
		int[] array = new int[num];
		for (int i = 0; i < array.length; i++) {
			 if(i % 2 == 0) {
				System.out.println(i + " ");
			}
		}
		
	}
}
