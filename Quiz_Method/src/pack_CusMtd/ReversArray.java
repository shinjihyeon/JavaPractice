package pack_CusMtd;

import java.util.Scanner;

public class ReversArray {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("배열크기 지정 : ");
		int size = scanner.nextInt(); 
		int[] arry = new int[size]; 
		System.out.print("입력하실 숫자" + size + " 개를 입력해주세요 : ");
		for(int i = 0; i < arry.length; i++) {
			arry[i] = scanner.nextInt(); 
		}
		scanner.close();
		
		mtd_Revers(arry);
		
	}
	
	static public void mtd_Revers(int[] arry) {
		
		System.out.println("입력하실 숫자들의 역순은 다음과 같습니다.");
		
		for (int i = arry.length-1; i >= 0 ; i--) {
			System.out.println(arry[i]);
		}
	}

}
