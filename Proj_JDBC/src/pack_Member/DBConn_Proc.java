package pack_Member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn_Proc {
	// 슈퍼클래스 => 공통적인것 뽑아내기
	
	Connection objConn;
	
	public void mtd_dbConn() {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver"); // 외부클래스를 찾게 해주는 경로

			String uri = "";
			uri += "jdbc:mysql://localhost:3306/memberShip?"; // DB_URL
			uri += "useSSL=false&"; // 인증방식설정
			uri += "serverTimezone=Asia/Seoul&"; // 서버시간설정
			uri += "useUnicode=true&"; // 유니코드사용여부설정
			uri += "characterEncoding=UTF-8"; // 인코딩방식지정
			String uid = "root";
			String upw = "Weak";

			// MySql 접속경로, 접속계정root,비번 Weak
			objConn = DriverManager.getConnection(uri, uid, upw);
			
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	

}
