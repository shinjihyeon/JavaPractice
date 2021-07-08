package pack_Array2;

public class Array2 {

	public static void main(String[] args) {

		// arr 배열 중에서 값이 90인 곳의 인덱스를 출력
		
		 int[] arr = { 100, 2, 0, 65, 35, -3, 9, 60, 90};
		 for(int i = 0; i < arr.length; i++) {
			 if(arr[i] == 60) {
				 System.out.println(i);
			 }
		 }
	}

}
