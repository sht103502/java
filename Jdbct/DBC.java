package Jdbct;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBC {
	
	public static Connection DBConnect() {
		Connection con = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			String user = "SHINHEETAE";
			String password = "1111";
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
			// 두번째 catch문은 SQL문(url, user, password)이 정상적으로 작동되었는지 확인
		}
		return con;
	}
	
}
