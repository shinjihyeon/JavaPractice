package pack_Member;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Join extends DBConn_Proc {
	private String uid;
	private String upw;
	private String uName;
	private String uAddr;

	public Join(String uid, String upw, String uName, String uAddr) {
		this.uid = uid;
		this.upw = upw;
		this.uName = uName;
		this.uAddr = uAddr;
	}

	public void mtd_Join() {
		
		mtd_dbConn();
		
		PreparedStatement pstmt = null;
		
		try {
			
			String sql = "insert into memberInfo values (?, ?, ?, ?);";
			pstmt = objConn.prepareStatement(sql); // sql의 내용이 mysql로 전달되는 것 => prepareStatement
			pstmt.setString(1, this.uid);
			pstmt.setString(2, this.upw);
			pstmt.setString(3, this.uName);
			pstmt.setNString(4, this.uAddr);
			int resultCode = pstmt.executeUpdate(); //executeUpdate => 현재 DB의 내용을 수정하는 것.
			if(resultCode < 1) { // 행의 갯수
				System.out.println("문제가 발생했습니다,");
			} else {
				System.out.println("가입되었습니다.");
			}
			
			objConn.close();
			
		} catch (SQLException e) {
			System.out.println("SQLException : " + e.getMessage());
		} 
		
	}

}
