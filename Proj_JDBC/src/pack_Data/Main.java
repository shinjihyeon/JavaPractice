package pack_Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {

		Connection objConn = null; // DB접속 => DB의 URL, Port, ID, PW ...
		Statement objStmt = null; // Select 쿼리문에 적용 => 사용할 select 쿼리문
		ResultSet objRs = null; // select로 조회된 데이터 => 메서드, getter로 데이터 가져옴

		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // 외부클래스를 찾게 해주는 경로
			
			String uri = "";
			uri += "jdbc:mysql://localhost:3306/jdbc_test?"; // DB_URL
			uri += "useSSL=false&"; // 인증방식설정
			uri += "serverTimezone=Asia/Seoul&"; // 서버시간설정
			uri += "useUnicode=true&"; // 유니코드사용여부설정
			uri += "characterEncoding=UTF-8"; // 인코딩방식지정
			String uid = "root";
			String upw = "Weak";
			
			objConn =  DriverManager.getConnection(uri, uid, upw);
			//									MySql 접속경로, 접속계정root,비번 Weak
		
			objStmt = objConn.createStatement(); // 접속된 DB 선택
			String sql = "select * from data_sample";
			objRs = objStmt.executeQuery(sql);
			
			int no = 0;
			String name = "";
			
			System.out.println("번호     이름");
			System.out.println("------------");
			while(objRs.next()) {
				
				no = objRs.getInt("no");
				name = objRs.getString("name");
				System.out.print(no + "      ");
				System.out.println(name);
				
			}
			
			objRs.close();
			objStmt.close();
			objConn.close();
			
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}
}