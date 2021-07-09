package pack_While;

public class NumberPrint {

	public static void main(String[] args) {

		
		int num = 1;
		
		while(num <= 10) {
		
			// 홀수 출력하기
			if(num % 2 == 1) {
				
				System.out.println(num + "  ");
			}
			
			num++;
		}
		
	}

}
