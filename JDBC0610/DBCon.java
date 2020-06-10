package JDBC0610;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon {
	// DB 접속정보 저장을 위한Connection 변수con 선언
	Connection con= null;
	//static 메소드
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//ojdbc6 파일을 현재 소스에 적용
		}catch(ClassNotFoundException cne) {
			cne.printStackTrace();
			System.out.println("DB접속실패 : 드라이버 로딩  실패");
		}
	}//end static
	
	
	public void connect() {
		try {
//			String url ="jdbc:oracle:thin:@localhost:1521:XE";
//			String user ="SHINHEETAE";
//			String password = "1111";
//			con= DriverManager.getConnection(url,user,password);
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "SHINHEETAE", "1111");
			System.out.println("DB접속 성공!");
		}catch(SQLException se) {
			se.printStackTrace();
		}
//		finally{//무조건 실행이 된다.
//			try {
//				con.close();
//				System.out.println("DB접속 종료");
//				
//			}catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
	}//connect()
	
}
