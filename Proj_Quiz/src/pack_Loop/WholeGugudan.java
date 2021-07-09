package pack_Loop;

public class WholeGugudan {

	public static void main(String[] args) {

		System.out.println("[전체구구단]");
		
		for(int i =2; i <10; i++) {
			for(int j =1; j <10; j++) {
				int result = i * j;
				System.out.print(i + "*" + j + "=" + result + "  ");
			}
			System.out.println();
		}
	}

}
