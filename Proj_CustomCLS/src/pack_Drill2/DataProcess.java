package pack_Drill2;

public class DataProcess {

	// 필드
	String userName;
	
	public DataProcess(String userName) {
		this.userName = userName;
	}
	
	public String test() {
		userName += "님 입니다!";
		
		return userName;
	}
}
