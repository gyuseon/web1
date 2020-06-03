package scope;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO { // ~DAO(Data Access Object : DB작업 담당)
	//JDBC (Java DataBase Connection)
	// ① 클래스 드라이버 로드
	// ② DB 서버와 커넥션(DB서버 IP주소/userid /userpwd)
	// ③ Statement 객체 생성 => sql 구문 전송하기 위해 필요
	// ④ sql 처리 결과를 받기 (int -> update/delete/insert, ResurtSet ->select)
	// ⑤ sql 처리 결과에 따라 자바 코드 실행
	
	
	// ① 클래스 드라이버 로드
	static {
		try {
			// oracle.jdbc.driver.OracleDriver
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	// ② DB 서버와 커넥션(DB서버 IP주소/user /password)
	public static Connection getConnection() {
		
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user="javadb";
			String password="12345";
			return DriverManager.getConnection(url ,user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	//selectOne
	// ③ Statement 객체 생성 => sql 구문 전송하기 위해 필요
	public MemberVO getUser(int no) {
		
		
		String sql="select * from memberTBL where no=?";
		MemberVO vo =null;
		try(Connection con = getConnection();
			PreparedStatement pstmt=con.prepareStatement(sql);) 
		{
			pstmt.setInt(1, no);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				vo = new MemberVO();
				vo.setNo(rs.getInt(1));
				vo.setName(rs.getString(2));
				vo.setAge(rs.getInt(3));
				vo.setGender(rs.getString(4));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vo;
	}
	
}
