package pack_Inherit;

public class ExamJava {

	public static void main(String[] args) {
		
		// 지역변수 만들기
		int random;
		// 1. 10~20 사이 랜덤값
		random = (int) (Math.random() * 11) + 10;
		
		// 2. 출력하기
		System.out.println("생성된 랜덤 값 : " + random);
		
		// 3. 슈퍼클래스와 서브클래스의 객체 생성
		YaksuList objSuper = new YaksuList(random);
		YaksuSum objSub = new YaksuSum(random);
		
		//4. 각 메서드를 실행하여 출력
		objSuper.mtdYaksu();
		objSub.mtdYaksu();
	}

}
