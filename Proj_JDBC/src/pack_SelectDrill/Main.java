package pack_SelectDrill;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		
		Connection objConn = null; // DB 접속(연동)
		Statement objStmt = null;  
		ResultSet objRs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/db_Test?";
			url += "useSSL=false&"; // 인증방식설정
			url += "serverTimezone=Asia/Seoul&"; // 서버시간설정
			url += "useUnicode=true&"; // 유니코드사용여부설정
			url += "characterEncoding=UTF-8"; // 인코딩방식지정
			String uid = "root";
			String upw = "Weak";
			
			objConn = DriverManager.getConnection(url, uid, upw);
			
			objStmt = objConn.createStatement();
			
			String sql = "select * from dataList order by num desc";
			objRs = objStmt.executeQuery(sql);
			
			System.out.println("번호     코드명");
			System.out.println("-------------");
			while(objRs.next()) {
				System.out.println(objRs.getInt("num") + "   " + objRs.getString("codeName"));
			}
			
			objRs.close();
			objStmt.close();
			objConn.close();
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
