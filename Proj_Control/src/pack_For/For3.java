package pack_For;

import java.util.Scanner;

public class For3 {

	public static void main(String[] args) {

		System.out.print("숫자를 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		scanner.close();

		int res = 0; // 누적용 변수
		if (num <= 0) {
			System.out.println("입력한 숫자는 1보다 커야합니다.");
		} else {
			for (int i = 1; i <= num; i++) {
				res += i;
			}
			System.out.printf("1부터 %d까지의 합은 : %d", num, res);
		}
	}

}
