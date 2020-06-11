package JdbcEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcEx {
	
	public static Connection DBConnect() {
		Connection con = null;
		
		try {
			// 1. ojdbc6 없이 실행
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			String user = "SHINHEETAE";
			String password = "1111";
			
			// 2. ojdbc 추가후 url, user, password 틀리고 실행
			con = DriverManager.getConnection(url, user, password);
			System.out.println("DB접속 성공!");
		} catch(ClassNotFoundException cne) {
			cne.printStackTrace();
			// printStackTrace() : 에러 발생 시 경로를 찾아준다.
			System.out.println("DB접속 실패 : 드라이버 로딩 실패");
			// 첫번째 catch문은 ojdbc6이 잘 연결되었는지 확인
		} catch(SQLException se) {
			se.printStackTrace();
			System.out.println("DB접속 실패 : url, user, password 확인");
			// 두번째 catch문은 
		}
		return con;
	}
}
