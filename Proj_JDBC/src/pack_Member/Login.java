package pack_Member;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Login extends DBConn_Proc {

	private String uid;
	private String upw;
	
	public Login(String uid, String upw) {
		this.uid = uid;
		this.upw = upw;
	}
	
	public void mtd_Login() {
		
		mtd_dbConn();
		
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			
			stmt = objConn.createStatement(); // 접속된 DB 선택
			
			String sql = "select name from memberInfo where id='" + this.uid + "'" + "and pw ='" + this.upw + "'";
			
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				String msg = "\n["+ rs.getString("name") +"] 님께서 로그인 하셨습니다."
						+ "\n프로그램을 종료합니다.\n";
				System.out.println(msg);
				
			} else {
				System.out.println("아이디 또는 비밀번호를 다시 입력해주세요.");
			}
			
			rs.close();
			stmt.close();
			objConn.close();
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
