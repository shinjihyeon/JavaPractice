package pack_Break;

public class Break {

	public static void main(String[] args) {

		int num = 0; // 초기식
		
		while (num <= 10)  { // 조건식
			
			num++;			// 증감식
			
			if(num == 5) continue; // 제어문에서 continue 아래줄에 있는 코드는 실행되지 않고 바로 다음 순환으로 넘어감
				System.out.print(num); // 5빼고 다 출력됨	//실행문
			}
		}
	}

