package JDBC0610;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static Connection DBConnect() {
		//DB에 접속정보 저장을 위한 Connection 변수 con 선언
		//
		Connection con =null;
		// 접속할 DB의 계정정보
		String user = "SHINHEETAE";
		String password = "1111";
		
		//접속할 DB의 주소정보
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//ojdbc6 파일을 현재 소수에 적용
			con = DriverManager.getConnection(url, user, password);
			System.out.println("DB 접속 성공!");
		}catch(ClassNotFoundException cne) {
			cne.printStackTrace();
			System.out.println("DB 접속 실패 : 드라이버 로딩 실패");
		}catch (SQLException se) {
			se.printStackTrace();
			System.out.println("DB 접속 실패 : SQLException");
		}
		return con;
		//DB접속이 정상적으로 되면 접속상채를 리턴
	}
}
