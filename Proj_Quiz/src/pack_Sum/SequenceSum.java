package pack_Sum;

public class SequenceSum {

	public static void main(String[] args) {
		
		System.out.println("숫자   누적값");
		
		int number = 1;  // 증가하는 숫자
		int number2 = 0; // 누적하는 숫자
		
		number2 += number;
		
		System.out.println(number++ + "     " + number2);
		
		number2 += number;
		System.out.println(number++ + "     " + number2);
		
		number2 += number;
		System.out.println(number++ + "     " + number2);
		
		number2 += number;
		System.out.println(number++ + "     " + number2);
		
		number2 += number;
		System.out.println(number + "     " + number2);

		
	}

}
