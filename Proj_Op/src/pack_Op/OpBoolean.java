package pack_Op;

public class OpBoolean {

	public static void main(String[] args) {
		

		boolean a = true;
		boolean b = false;
		boolean result = a || b; // && 논리곱, || 논리합, ! 논리부정
		
		System.out.println(result);
		
		System.out.println(3>=5 && 5!=5 || 0<-1);
	}

}
