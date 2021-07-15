package pack_Random;

public class Random {

	public static void main(String[] args) {
		double num = -2.4;
		System.out.println("Math.ceil : " + Math.ceil(num));
		System.out.println("Math.reound : " + Math.round(num));
		System.out.println("Math.floor : " + Math.floor(num));
		
		int winNum = 3;
		System.out.println("[램덤값 난수]");
		for (int i = 0; i < 10; i++) {
			double rndNum = Math.ceil(4*Math.random()+1);
			System.out.print(rndNum);
			if((int)rndNum == winNum) System.out.print("당첨!");
			System.out.println("  ");
		}
	}

}
