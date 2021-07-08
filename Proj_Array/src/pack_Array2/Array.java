package pack_Array2;

public class Array {

	public static void main(String[] args) {

		int[] array = {20, -3, 0, 5, -7, 14};
		int sum = array[0] + array[2] + array[4];
		System.out.println("인덱스번호 0,2,4에 해당하는 값");
		System.out.print(array[0] + "," + array[2] + "," + array[4]);
		System.out.printf(" (합 : " + sum + ")");
	}

}
