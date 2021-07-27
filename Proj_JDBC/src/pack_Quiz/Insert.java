package pack_Quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Insert {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("번호입력 : ");
		int num = scanner.nextInt();
		System.out.println("책코드 입력");
		String bookCode = scanner.next();
		System.out.println("저자 입력");
		String writer = scanner.next();
		System.out.println("재고량 : ");
		int cnt = scanner.nextInt();
		scanner.close();
		
		Connection objConn = null;
		PreparedStatement objPstmt = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // 외부클래스를 찾게 해주는 경로
			
			String uri = "";
			uri += "jdbc:mysql://localhost:3306/booksStore?"; // DB_URL
			uri += "useSSL=false&"; // 인증방식설정
			uri += "serverTimezone=Asia/Seoul&"; // 서버시간설정
			uri += "useUnicode=true&"; // 유니코드사용여부설정
			uri += "characterEncoding=UTF-8"; // 인코딩방식지정
			String uid = "root";
			String upw = "Weak";
			
			objConn =  DriverManager.getConnection(uri, uid, upw);
			
			// insert 쿼리문 시작
			String sql = "insert into list (num, bookCode, writer, cnt)" + "value (?, ?, ?, ?)";
			//								num, bookCode, writer, stock
			objPstmt = objConn.prepareStatement(sql);
			objPstmt.setInt(1, num);
			objPstmt.setString(2, bookCode);
			objPstmt.setString(3, writer);
			objPstmt.setInt(4, cnt);
			
			int returnCnt = objPstmt.executeUpdate();
			// = affectedCount = 메서드 실행결과 반환값
			// 정상실행되면 = 1을 반환
			
			if(returnCnt < 1) {
				System.out.println("입력중에 문제가 발생하였습니다. \n정상입력되지 않았습니다.");
			} else {
				
				System.out.println("정상적으로 입력되었습니다.");
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
