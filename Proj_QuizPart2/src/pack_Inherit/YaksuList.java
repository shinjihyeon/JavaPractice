package pack_Inherit;

public class YaksuList implements Yaksu {

	private int num;

	public YaksuList(int num) {
		this.num = num;
	}

	@Override
	public void mtdYaksu() {
		System.out.println("약수");
	    int i;
	    for(i = 1; i <= num; i++) {
	    	if(num%i == 0) {
	    		System.out.print(i + " ");
	    	}
	    }
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}
