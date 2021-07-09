package pack_Array;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int[] array;
		array = new int[3];
		
		System.out.print("1번째 숫자를 입력하세요 : ");
		array[0] = scanner.nextInt();
		
		System.out.print("2번째 숫자를 입력하세요 : ");
		array[1] = scanner.nextInt();
		
		System.out.print("3번째 숫자를 입력하세요 : ");
		array[2] = scanner.nextInt();
		
		System.out.println("덧셈결과");
		System.out.printf("%d + %d + %d = %d",array[0],array[1],array[2],array[0]+array[1]+array[2]);
		
		
	}

}
