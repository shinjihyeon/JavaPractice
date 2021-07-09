package pack_Method;

import java.util.Scanner;

public class AgeCalc {
	/* 2번
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("2) 평균을 구할 사람수를 입력 : ");
		int size = scanner.nextInt();
		System.out.println();
		
		int[] age = new int[size]; // 나이를 입력받기 위한 배열변수
		for (int i = 0; i < age.length; i++) {
			
			System.out.println((i + 1) + "." + "나이를 입력하세요 : ");
			age[i] = scanner.nextInt();
		}
		scanner.close();
		
		mtaAvg(age); // 배열변수 age의 자료형은 int가 아닌 int[]
				     // 정수의 배열자료형이다.

	}

	public static void mtaAvg(int[] age) {
		
		double sum = 0.0;	// 나이의 총합
		for (int i = 0; i < age.length; i++) {
			
			sum += age[i];	// 나이합산
		}
		
		double avg = sum/age.length;
		System.out.println(age.length +"명의 평균 나이 : " + avg);
		
	}
	*/
	
	/* 3번 */
	public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("3) 평균을 구할 사람수를 입력 : ");
			int size = scanner.nextInt();
			System.out.println();
			
			int[] age = new int[size]; // 나이를 입력받기 위한 배열변수
			for (int i = 0; i < age.length; i++) {
				
				System.out.println((i + 1) + "." + "나이를 입력하세요 : ");
				age[i] = scanner.nextInt();
			}
			scanner.close();
			
			double avg =  mtaAvg(age); 
			
			System.out.println(age.length +"명의 평균 나이 : " + avg);
	
		}
	
		public static double mtaAvg(int[] age) {
			
			double sum = 0.0;	// 나이의 총합
			for (int i = 0; i < age.length; i++) {
				
				sum += age[i];	// 나이합산
			}
			
			double avg = sum/age.length;
			
			return avg;
			
		}

}
