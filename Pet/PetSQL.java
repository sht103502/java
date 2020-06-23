package Pet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PetSQL {
	
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	Scanner sc = new Scanner(System.in);
	Connection con = DBC.DBConnect();
	
	// 회원가입
	public void memberJoin(Member member) {
		String sql = "INSERT INTO MEMBER VALUES(?,?,?,?,?,?)";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPw());
			pstmt.setString(3, member.getName());
			pstmt.setString(4, member.getPhone());
			pstmt.setInt(5, member.getPoint()); 
			pstmt.setInt(6, member.getM_num());
			pstmt.executeUpdate();

			System.out.println("환영합니다!");
			System.out.println("회원가입 성공하였습니다.");

		} catch (SQLException se) {
			se.printStackTrace();
		}
	}
	//아이디체크
	public boolean idCheck(String id) {
		boolean checkResult = false;
		
		String sql = "SELECT M_ID FROM MEMBER WHERE M_ID = ? ";
		
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,id);
			rs = pstmt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return checkResult;
		
	}
	// 로그인
	public boolean idpwCheck(String id, String password) {
		boolean checkReult = false;
		String sql = "SELECT M_ID FROM MEMBER WHERE M_ID = ? AND M_PW = ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1,id);
			pstmt.setString(2,password);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				checkReult = true;
				System.out.println("로그인 성공");
			} else {
				checkReult = false;
				System.out.println("로그인 실패");
			}
			
		} catch (SQLException se) {
			se.printStackTrace();
		}
		
		return checkReult;
	}
	
	// 포인트 충전
	public void pointPlus(int point, String phone) {
		String sql = "UPDATE MEMBER SET M_POINT = M_POINT +? WHERE M_PHONE=?";

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, point);
			pstmt.setString(2, phone);

			int count = pstmt.executeUpdate();

			if (count > 0) {
				System.out.println("충전 성공");
			} else {
				System.out.println("충전 실패");
				System.out.println("전화번호를 확인하세요.");
			}

		} catch (SQLException se) {
			se.printStackTrace();
		}
	}

	// 포인트 차감
		public void pointMinus(int point, String phone) {
			String sql = "UPDATE MEMBER SET M_POINT = M_POINT -? WHERE M_PHONE=?";

			try {
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, point);
				pstmt.setString(2, phone);

				int count = pstmt.executeUpdate();

				if (count > 0) {
					System.out.println("결제 성공");
				} else {
					System.out.println("결제 실패");
					System.out.println("전화번호를 확인하세요.");
				}

			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
	// 잔여 포인트조회
	public int checkBalance(String phone) {
		String sql = "SELECT M_POINT FROM MEMBER WHERE M_PHONE=?";

		 int point = 0;

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, phone);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				point = rs.getInt("M_POINT");
			}

		} catch (SQLException se) {
			se.printStackTrace();
		}
		return point;
	}
	
	// 회원탈퇴
	public void idDelete(String id) {
		String sql = "DELETE MEMBER WHERE M_ID = ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}
	
	// 예약
		public String insertRev(int phone) {
			String sql = "SELECT M_NAME FROM MEMBER WHERE M_PHONE = ?";
			String c_name = "";
			try {
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, phone);
				rs = pstmt.executeQuery();

				if(rs.next()) {
					c_name = rs.getString("M_NAME");
					System.out.println("안녕하세요. " + c_name + "님!");
					
				} else {
					System.out.println("전화번호가 일치하지 않습니다.");
					System.out.println("다시 시도해주세요.");
				}

			} catch (SQLException se) {
				se.printStackTrace();
			}

			return c_name;
		}
		
		public int memberNumber() {
			String sql = "SELECT MAX(M_NUM) FROM MEMBER";
			int memberNumber = 0;
			try {
				pstmt = con.prepareStatement(sql);
				rs = pstmt.executeQuery();
				
				if(rs.next()) {
					memberNumber = rs.getInt(1);
				}
				
			} catch (SQLException se) {
				se.printStackTrace();
			}
			
			return memberNumber;
		}
		
		
		
		// 펫정보 등록
		public void petInsert(pet pet) {
			String sql = "INSERT INTO P_INFO VALUES(?,?,?,?,?,?)";

			try {
				pstmt = con.prepareStatement(sql);			
				pstmt.setString(1, pet.getP_phone());
				pstmt.setString(2, pet.getP_name());
				pstmt.setInt(3, pet.getP_age());
				pstmt.setString(4, pet.getP_gender());
				pstmt.setString(5, pet.getBreed());
				pstmt.setString(6, pet.getSp_note());
				
				int count = pstmt.executeUpdate();

				if (count > 0) {
					System.out.println("등록에 성공하였습니다.");
				} else {
					System.out.println("등록에 실패하였습니다.");
					System.out.println("다시 시도해주세요.");
				}

			} catch (SQLException se) {
				se.printStackTrace();
			}

		}
		
	


		public void hoInsert(String ho_phone, String ho_hotel, String ho_res, String ho_swim, String ho_salon, int ho_price) { //호텔서비스
			String sql = "INSERT INTO HOTEL VALUES(?,?,?,?,?,?)";

			try {
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, ho_phone);
				pstmt.setString(2, ho_hotel);
				pstmt.setString(3, ho_res);
				pstmt.setString(4, ho_swim);
				pstmt.setString(5, ho_salon);
				pstmt.setInt(6, ho_price);
	
				int count = pstmt.executeUpdate();

				if (count > 0) {
					System.out.println("등록에 성공하였습니다.");
				} else {
					System.out.println("등록에 실패하였습니다.");
					System.out.println("다시 시도해주세요.");
				}

			} catch (SQLException se) {
				se.printStackTrace();
			}
			
		}

		public void hsInsert(String ho_phone, String ho_vc,String ho_bc,String ho_ns,String ho_ad, int ho_price) {  //병원서비스
			String sql = "INSERT INTO HOSPITAL VALUES( ?, ?, ?, ?, ?, ?) ";
			
			try {
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, ho_phone);
				pstmt.setString(2,ho_vc);
				pstmt.setString(3, ho_bc);
				pstmt.setString(4, ho_ns);
				pstmt.setString(5, ho_ad);
				pstmt.setInt(6, ho_price);
	
				int count = pstmt.executeUpdate();

				if (count > 0) {
					System.out.println("등록에 성공하였습니다.");
				} else {
					System.out.println("등록에 실패하였습니다.");
					System.out.println("다시 시도해주세요.");
				}

			} catch (SQLException se) {
				se.printStackTrace();
			}
			
		}

		public void selectM(String phone) {// 1번째
			String sql = "SELECT *FROM  MEMBER WHERE M_PHONE=?";

			try {
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, phone);
				rs = pstmt.executeQuery();

				while (rs.next()) {
					System.out.println();
					System.out.println("이름 : " + rs.getString(3));
					System.out.println("핸드폰번호 : 0" + rs.getInt(4));
					System.out.println();
//					System.out.println("고객번호 : " + rs.getInt(6));

				}

			} catch (SQLException se) {
				se.printStackTrace();

			}

		}
		
		public void selectP(String phone) {
			String sql = "SELECT *FROM P_INFO WHERE P_PHONE=?";
			
			try {
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, phone);
				rs = pstmt.executeQuery();

				while (rs.next()) {
					System.out.println("반려동물 이름 : " + rs.getString(2));
					System.out.println("반려동물 나이 : " + rs.getString(3));
					System.out.println("반려동물 성별 : " + rs.getString(4));
					System.out.println("견종: " + rs.getString(5));
					System.out.println("특이사항 : " + rs.getString(6));
					System.out.println();

				}

			} catch (SQLException se) {
				se.printStackTrace();

			}
			
		}

		public void selectHO(String phone) {
			
			String sql2 = 
			"SELECT HO_PHONE,NVL(HO_HOTEL,'X'),NVL(HO_RES,'X'),NVL(HO_SWIM,'X'),NVL(HO_SALON,'X'),HO_PRICE FROM HOTEL WHERE HO_PHONE=?";
			
			try {
				
				pstmt = con.prepareStatement(sql2);
				pstmt.setString(1, phone);
				rs = pstmt.executeQuery();
				
				while (rs.next()) {
					System.out.println("숙박 : " + rs.getString(2));
					System.out.println("식사 : " + rs.getString(3));
					System.out.println("수영장 : " + rs.getString(4));
					System.out.println("애견미용실 : " + rs.getString(5));
					System.out.println("호텔 이용금액 : " + rs.getInt(6));
					System.out.println();
				}
				
			} catch (SQLException se) {
				se.printStackTrace();
				
			}
			
		}
		
		
		
		public void selectHS(String phone) {

			String sql3 = 
			"SELECT HS_PHONE,NVL(HS_VC,'X'),NVL(HS_BC,'X'),NVL(HS_NS,'X'),NVL(HS_AD,'X'),HS_PRICE FROM HOSPITAL WHERE HS_PHONE=?";

			try {

				pstmt = con.prepareStatement(sql3);
				pstmt.setString(1, phone);
				rs = pstmt.executeQuery();

				while (rs.next()) {
					
					System.out.println("예방접종 : " + rs.getString(2));
					System.out.println("건강검진 : " + rs.getString(3));
					System.out.println("중성화 수술 : " + rs.getString(4));
					System.out.println("전문의 상담 : " + rs.getString(5));
					System.out.println("병원 이용금액 : " + rs.getInt(6));
				}

			} catch (SQLException se) {
				se.printStackTrace();

			}

		}
	}