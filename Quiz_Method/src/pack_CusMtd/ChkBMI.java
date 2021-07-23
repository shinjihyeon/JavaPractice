package pack_CusMtd;

import java.util.Scanner;

public class ChkBMI {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("성별을 입력하세요(m/f) : ");
		String gender = scanner.next();
		System.out.print("몸무게를 입력하세요(kg) : ");
		double kg = scanner.nextDouble();
		System.out.print("키를 입력하세요(cm) : ");
		double cm = scanner.nextDouble();
		scanner.close();
		
		mtd_BIM(gender, kg, cm);
		
	}
	
	static public void mtd_BIM(String gender, double kg, double cm) {
		String txt = "";
		cm /= 100;
		double bmi = kg / Math.pow(cm, 2);
		
		System.out.printf("당신의 BMI는 : %.1f 입니다.", bmi);

		if(gender == "m") {
			if(bmi < 20.0) {
				txt= "저체중입니다";
			}
			else if(bmi >= 20.0) {
				txt= "표준체중입니다";
			}
			else if(bmi >= 28.0) {
				txt= "과체중입니다";
			}
		}
		else if(gender == "f") {
			if(bmi < 18.5) {
				txt= "저체중입니다";
			}
			else if(bmi >= 18.5) {
				txt= "표준체중입니다";
			}
			else if(bmi >= 26.0) {
				txt= "과체중입니다";
			}
		}
		System.out.println(txt + " 입니다.");
	}

}
