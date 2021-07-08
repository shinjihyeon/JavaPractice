package pack_Switch;

import java.util.Scanner;

public class switch_Silsp {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("월을 입력하세요 : ");
		int month = scanner.nextInt();
		scanner.close();
		
		System.out.print(month + "월에 맛있는 과일은 ");
		String frult = "";
		
		switch (month) {
		case 1:
		  frult = "딸기";	
			break;
		case 2:
			frult = "한라봉";
			break;
		case 6:
			frult = "참외";
			break;
		case 7:
			frult = "수박";
			break;
		default:
			frult = "(사실 다 맛있어요)";
			break;
		}
		
		System.out.println(frult + " 입니다.");
	}

}
