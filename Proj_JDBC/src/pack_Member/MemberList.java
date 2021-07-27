package pack_Member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MemberList extends DBConn_Proc{

	public void mtd_List() {

		mtd_dbConn();
		
		Statement stmt = null;
		ResultSet rs = null;

		try {
			stmt = objConn.createStatement(); // 접속된 DB 선택

			String sql = "select * from memberInfo order by id";

			rs = stmt.executeQuery(sql);

			System.out.println("id\t\tpw\t\tname\t\taddress");
			System.out.println("---------------------------------------");
			String row; // row 에는 null
			while (rs.next()) {
				row = ""; // 누적값을 공백으로 만들기 위해
				row += rs.getString("id");
				row += "\t\t";
				row += rs.getString("pw");
				row += "\t\t";
				row += rs.getString("name");
				row += "\t\t";
				row += rs.getString("address");
				System.out.println(row);
			}

			rs.close();
			stmt.close();
			objConn.close();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
