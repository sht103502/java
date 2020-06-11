package Jdbct;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// 쿼리문을 모아놓은 클래스
public class NaverSQL {
	// DB 접속을 위한 변수 선언
	Connection con = null;
	
	// 쿼리문 전송을 위한 변수 선언
	// Statement stmt = null;
	// PreparedStatement = ?를 문자로 인식
	PreparedStatement pstmt = null;
	
	// 조회(Select) 결과를 저장하기 위한 변수 선언
	ResultSet rs = null;
	Statement stmt = null;
	public void connect() {
		con = DBC.DBConnect();
	}
		
		
		public void memberJoin(Naver_Member n_member) {
			String sql = "INSERT INTO NAVER_MEMBER VALUES(?,?,?,?,?,?,?)";
			System.out.println("n_member : "+ n_member);
			try {
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, n_member.getN_ID());
				pstmt.setString(2, n_member.getN_PASSWORD());
				pstmt.setString(3, n_member.getN_NAME());
				pstmt.setInt(4, n_member.getN_AGE());
				pstmt.setString(5, n_member.getN_GENDER());
				pstmt.setString(6, n_member.getN_EMAIL());
				pstmt.setString(7, n_member.getN_PHONE());
				//String sql = "INSERT INTO NAVER_MEMBER VALUES(?,?,?,?,?,?,?)"에 숫자대로 들어간다. 
				pstmt.executeUpdate();
				System.out.println("회원가입 성공!");
				
			} catch(SQLException se) {
				se.printStackTrace();
			}
			
			
		}
		public void conClose() { // DB 접속 해지
			
			try {
				con.close();
				System.out.println("DB 접속  해지!");
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		public void select() {
			
			
			
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
	
	public boolean idCheck(String id, String password) {
		boolean checkResult =false;
		//SQL : n_id =A , n_pw = B인사람의 아이디 조회
		//SELECT /FROM /WHERE
		String sql = "SELECT N_ID FROM NAVER_MEMBER WHERE N_ID = ? AND N_PASSWORD = ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				checkResult = true;
			
			}else {
				checkResult = false;
			}
		} catch (SQLException se) {
			// TODO Auto-generated catch block
			se.printStackTrace();
		}
		
		return checkResult;
	}


	public void modify(String id, String name) {
		String sql ="UPDATE NAVER_MEMBER SET N_NAME=?WHERE N_ID=?";
		try {
			pstmt =con.prepareStatement(sql);
			
			pstmt.setString(1, name);
			pstmt.setString(2, id);
			
			pstmt.executeUpdate();
			
			System.out.println("회원정보수정 성공!");
			
		}catch(SQLException se){
			se.printStackTrace();
			
		}
		}


	public void delete(String id1) {
		String sql ="DELETE NAVER_MEMBER WHERE N_ID =?";
		try {
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,  id1);
			pstmt.executeUpdate();
			System.out.println("회원탈퇴가 되었습니다.");
		} catch (SQLException se) {
			
			se.printStackTrace();
		}
		
	}

}
