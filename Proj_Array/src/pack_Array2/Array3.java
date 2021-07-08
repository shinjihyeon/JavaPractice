package pack_Array2;

public class Array3 {

	public static void main(String[] args) {
		//  arr 배열 안의 모든 값을 더하고, 총합과 평균을 출력
		int[] arr = {1, 3, 4, 2, 5, 3, 2};
		
		int sum = 0;
		int avg = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		avg = sum / arr.length;
		System.out.printf("총합은 : %d \n평균은 : %d", sum, avg);
		
		// 출력값
		// 총합은 : 20 
		//평균은 : 2
	}

}
