package Jdbct;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUD {

	Connection con = null;
	Statement stmt = null;
	// 쿼리문 전송을 위한 변수 stmt
	
//	 insert() {
//		 con = Driver.....
//	 }
	
	public void connect() {  // DB 접속
		con = DBC.DBConnect();
	}
	
	public void conClose() { // DB 접속 해지
		
		try {
			con.close();
			System.out.println("DB 접속  해지!");
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void insert() {
		
		try {
			stmt = con.createStatement();
			String sql = "INSERT INTO NAVER_MEMBER VALUES('ID','PW','NAME',26,'GENDER','EMAIL','PHONE')";
			int count = stmt.executeUpdate(sql);
			//excuteUpdate() 메소드를 통해 값 sql을 stmt의 필드인 DB로 값을 전송  
			
			if(count > 0) {
				System.out.println("insert success!!");
			} else {
				System.out.println("insert fail!!");
			}
			
		} catch(SQLException se) {
			se.printStackTrace();
		} finally {
			try {
				stmt.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
public void select() {
		
	ResultSet rs = null;	
	
		try {
			stmt = con.createStatement();
			String sql = "SELECT * FROM NAVER_MEMBER";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println("아이디 : " + rs.getString(1));
				System.out.println("비밀번호 : " + rs.getString(2));
				System.out.println("이름 : " + rs.getString(3));
				System.out.println("나이 : " + rs.getInt(4));
				System.out.println("성별 : " + rs.getString(5));
				System.out.println("이메일 : " + rs.getString(6));
				System.out.println("전화번호 : " + rs.getString(7));
				System.out.println();
			}
			
		} catch(SQLException se) {
			se.printStackTrace();
		} finally {
			try {
				stmt.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}


public void update() {
	
	try {
		stmt = con.createStatement();
		String sql = "UPDATE NAVER_MEMBER SET N_AGE = 27 WHERE N_ID = 'ID'";
	
		int count = stmt.executeUpdate(sql);
	
		if(count > 0) {
			System.out.println("update success!!");
			System.out.println(count);
		} else {
			System.out.println("update fail!!");
			System.out.println(count);
		}
		
	} catch(SQLException se) {
		se.printStackTrace();
		System.out.println("update fail SQLException");
	} finally {
		try {
			stmt.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}

public void delete() {
	
	try {
		stmt = con.createStatement();
		String sql = "DELETE NAVER_MEMBER WHERE N_ID = 'ID'";
		
		int count = stmt.executeUpdate(sql);
		
		if(count > 0) {
			System.out.println("delete success!!");
			System.out.println(count);
		} else {
			System.out.println("delete fail!!");
			System.out.println(count);
		}
		
	} catch(SQLException se) {
		se.printStackTrace();
	} finally {
		try {
			stmt.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}

	
}
