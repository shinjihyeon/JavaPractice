package pack_Silsp;

public class If {

	public static void main(String[] args) {
		
		int num = 0;
		
		if(num > 0) {
			
			System.out.println("양수입니다");
		}
		else if (num < 0){
			System.out.println("음수입니다");
		}
		else {
			System.out.println("0"); // switch에서는 default
		}

		System.out.println("Process End");
	}

}
