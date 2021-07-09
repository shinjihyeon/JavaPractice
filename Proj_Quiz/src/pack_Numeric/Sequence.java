package pack_Numeric;

public class Sequence {

	public static void main(String[] args) {
		
		int number = 11;
		
		System.out.println(number++); 
		// 출려 후 증가 (후증가)
		System.out.println(++number); 
		// 증가 후 출력 (선증가)
		
		System.out.println("-----------------");
		
		// 후증가
		int a = 1;
		System.out.print(a++);
		System.out.print(a++);
		System.out.print(a++);
		System.out.print(a++);
		System.out.print(a);
		
		
		// 선증가
		int b = 0;
		System.out.print(++b);
		System.out.print(++b);
		System.out.print(++b);
		System.out.print(++b);
		System.out.print(++b);;
		
	}
}
