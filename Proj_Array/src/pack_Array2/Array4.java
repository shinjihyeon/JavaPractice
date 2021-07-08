package pack_Array2;

public class Array4 {

	public static void main(String[] args) {
		// arr 배열의 인덱스가 3인 곳은 출력하지 말고, 나머지만 출력해보자.
		int[] arr = {1, 2, 5, 3, 4, 11, 9};
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]==3) {
				continue;
			}
			else {

				System.out.print(arr[i] + ",");
			}
		}
	}

}
