package packQuiz_Insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {

		Connection objConn = null;	// DB연결
		PreparedStatement objPstmt = null; // 
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // 외부클래스를 찾게 해주는 경로
			
			String uri = "";
			uri += "jdbc:mysql://localhost:3306/mallDB?"; // DB_URL
			uri += "useSSL=false&"; // 인증방식설정
			uri += "serverTimezone=Asia/Seoul&"; // 서버시간설정
			uri += "useUnicode=true&"; // 유니코드사용여부설정
			uri += "characterEncoding=UTF-8"; // 인코딩방식지정
			String uid = "root";
			String upw = "Weak";
			
			objConn =  DriverManager.getConnection(uri, uid, upw);
			
			// insert 쿼리문 시작
			String sql = "insert into goodsInfo value (?, ?, ?, ?, ?)";
			objPstmt = objConn.prepareStatement(sql);
			objPstmt.setInt(1, 7);
			objPstmt.setString(2, "M021R");
			objPstmt.setString(3, "에어컨");
			objPstmt.setInt(4, 1900000);
			objPstmt.setString(5, "대현");
			
			int result = objPstmt.executeUpdate();
			
			if (result == 1) {
				System.out.println("정상 입력 완료");
			}
			else {
				System.out.println("오류가 발생하여 미입력되었습니다.");
			}
			
			objPstmt.close();
			objConn.close();
			
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFound " + e.getMessage());
		}catch (SQLException e) {
			System.out.println("SQLException" + e.getMessage());
		}

	}

}
