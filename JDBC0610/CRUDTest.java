package JDBC0610;
//import java.sql.*; 모든것을 import 한다라는뜻
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUDTest {
	Connection con;
	
	//CREATE(생성)
	//READ(검색)
	//UPDATE(수정)
	//DELETE(삭제)
	
	public void insert() {
		Statement stmt =null;
		//SQL문을 DB로 전송하는 역할 
		
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "SHINHEETAE", "1111");
			stmt =con.createStatement();
			String sql = "INSERT INTO NAVER_MEMBER VALUES('아이디','비번','이름',26,'남자','메일주소@네이버','010-1234-4567')";
			
			int count = stmt.executeUpdate(sql);
			System.out.println("count : "+ count);
			
			if(count >0 ) {
				System.out.println("insert success!");
			}else {
				System.out.println("insert fail! count T^T");
			}
		}catch(SQLException se) {
			se.printStackTrace();
			System.out.println("insert fail sQLException");
		}finally {
			try {
				stmt.close();
				con.close();
			}catch(Exception e ) {
				e.printStackTrace();
			}
		}
			
			
		}//end finally
	
		//SELECT
		public void select() {
			Statement stmt = null;
			ResultSet rs =null;
			//ResultSet을 이용해서 컬럼의 데이터를 받아온다.
			try {
				con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "SHINHEETAE", "1111");
				stmt =con.createStatement();
				String sql="SELECT *FROM NAVER_MEMBER";
				rs = stmt.executeQuery(sql);
				
				while(rs.next()) {//레코드가 더이상 존재하지 않을때까지
					System.out.println("아이디 : " + rs.getString(1));
					System.out.println("비밀번호 :" + rs.getString(2));
					System.out.println("이름 :" + rs.getString(3));
					System.out.println("나이 :" + rs.getInt(4));
					System.out.println("성별 :" + rs.getString(5));
					System.out.println("이메일 :" + rs.getString(6));
					System.out.println("전화번호 :" + rs.getString(7));
					System.out.println();
					
				}
				
			}catch(SQLException se) {
				se.printStackTrace();
			}finally {
				try {
					stmt.close();//접속을 끊겠다
					con.close();//접속을 끊겠다.
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			
		}//end select()
	public void update() {
		Statement stmt = null;
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "SHINHEETAE", "1111");
			stmt =con.createStatement();
			String sql="UPDATE NAVER_MEMBER SET N_AGE = 24 WHERE N_ID ='아이디'";
			int count =stmt.executeUpdate(sql);//성공시 1을 출력 실패시 0을출력
		
			if(count >0 ) {
				System.out.println("update success!");
				
			}else {
				System.out.println("update fail  count T^T...");
				
			}
			
			
		}catch(SQLException se) {
			se.printStackTrace();
			System.out.println("update fail SQLException");
		}finally {
			try {
				stmt.close();//접속을 끊겠다
				con.close();//접속을 끊겠다.
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}//end update
	
	public void delete() {
		Statement stmt = null;
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "SHINHEETAE", "1111");
			stmt=con.createStatement();
			String sql="DELETE NAVER_MEMBER WHERE N_ID ='아이디'";
			int count =stmt.executeUpdate(sql);//성공시 1을 출력 실패시 0을출
			
			if(count >0 ) {
				System.out.println("delete success!");
				
			}else {
				System.out.println("delete fail  count T^T...");
				
			}
		}catch(SQLException se) {
			se.printStackTrace();
			System.out.println("delete fail SQLException");
		}finally {
			try {
				stmt.close();
				con.close();
			}catch(Exception e){
				e.printStackTrace();
		
			}
		}
	}//end delete
}
