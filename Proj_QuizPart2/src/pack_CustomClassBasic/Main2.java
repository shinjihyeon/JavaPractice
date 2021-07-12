package pack_CustomClassBasic;

//import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.println("취업자수 : ");
		int employedNum = scanner.nextInt();
		System.out.println("졸업자수 : ");
		int graduatedNum = scanner.nextInt();
		scanner.close();*/
		
		int employedNum = 160;
		int graduatedNum = 245;
		
		EmployRate employRate = new EmployRate(employedNum, graduatedNum);

		double pct = employRate.mtdCalc();
		
		System.out.printf("취업률 : %.1f ％ ",pct);
	}

}
