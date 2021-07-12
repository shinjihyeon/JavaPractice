package pack_CustomClassBasic;

public class Basic {

	// 1) 커스텀클래스를만들고 필드를 만듭니다.
	double num;
	
	// 4) 메인메서드에서 입력받은 값을 전달받기위해 생성자를 만듭니다.
	public Basic(double num) {
		this.num = num;
	}

	// 6) 커스텀 클래스에서 "필드에 저장된 숫자"를 출력할 수 있는
	//    커스텀 메서드를 만듭니다.
	public double mtdCLS() {
		double res = num * 2;
		
		return res;
	}
}
