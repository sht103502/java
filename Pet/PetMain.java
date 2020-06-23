package Pet;

import java.sql.Connection;
import java.util.Scanner;

public class PetMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean run = true;
		boolean run1= true;

		Member member = new Member();
		PetSQL sql = new PetSQL();
		pet pet = new pet();

		int menu = 0;
		int amenu = 0;
		int bmenu = 0;
		int cmenu = 0;
		int dmenu = 0;
		int emenu = 0;

		while (run) {
			System.out.println("====================================");
			System.out.println("|1.회원가입          2.로그인           3.프로그램종료 |");
			System.out.println("====================================");
			System.out.print("메뉴선택 >> ");
			menu = sc.nextInt();

			switch (menu) {
			case 1: // 회원가입
				System.out.println("아이디 >> ");
				String id = sc.next();
				member.setId(id);

				System.out.println("비밀번호 >> ");
				String pw = sc.next();
				member.setPw(pw);

				System.out.println("이름 >> ");
				String name = sc.next();
				member.setName(name);

				System.out.println("전화번호 >> ");
				String phone = sc.next();
				member.setPhone(phone);

				int point = 0;
				int m_num = sql.memberNumber() + 1;

				member = new Member(id, pw, name, phone, point, m_num);

				sql.memberJoin(member);
				break;

			case 2:// 로그인
				System.out.println("아이디>>");
				id = sc.next();
				System.out.println("비밀번호>>");
				pw = sc.next();
				boolean idCheck = sql.idpwCheck(id, pw);
				run1= true;
				if (idCheck == true) {

					while (run1) {
						System.out.println(" =====================================================");
						System.out.println("|                                                     |");
						System.out.println("| 1.마이페이지           2.애완동물 등록    	 3.예약  	   4.로그아웃       | ");
						System.out.println("|                                                     |");
						System.out.println(" =====================================================");
						System.out.print("메뉴선택 >> ");
						amenu = sc.nextInt();

						switch (amenu) {

						case 1:// 마이페이지
							System.out.println("===========================");
							System.out.println("|1.포인트              2.회원탈퇴           |");
							System.out.println("===========================");
							System.out.print("메뉴선택 >> ");
							bmenu = sc.nextInt();

							switch (bmenu) {
							case 1: // 포인트
								System.out.println("===========================");
								System.out.println("|1.포인트충전              2.잔액확인    |");
								System.out.println("===========================");								System.out.print("메뉴선택 >> ");
								cmenu = sc.nextInt();

								switch (cmenu) {

								case 1: // 포인트 충전
									System.out.println("연락처를 입력하세요");
									phone = sc.next();
									System.out.println("충전 할 금액을 입력하세요 >> ");
									point = sc.nextInt();
									sql.pointPlus(point, phone);
									break;

								case 2: // 잔액확인
									System.out.println("연락처를 입력하세요.");
									phone = sc.next();
									sql.checkBalance(phone);
									System.out.println("잔액은 : " + sql.checkBalance(phone));
									break;
								}
								break;

							case 2: // 회원탈퇴
								System.out.println("회원탈퇴할 아이디를 입력하세요");
								id = sc.next();
								sql.idDelete(id);

								System.out.println("탈퇴완료되었습니다.");
								System.out.println("이용해주셔서 감사합니다.");

								break;
							}
							break;

						case 2: // 동물 등록
							System.out.println("회원등록시 기재한 전화번호를 입력해주세요 >>");
							phone = sc.next();
							
							System.out.println("애완동물 정보를 입력하세요.");

							System.out.println("이름 >> ");
							String p_name = sc.next();

							System.out.println("나이 >> ");
							int p_age = sc.nextInt();

							System.out.println("성별 >> ");
							String p_gender = sc.next();

							System.out.println("종류 >> ");
							String breed = sc.next();

							System.out.println("특이사항 >> ");
							String sp_note = sc.next();
							
							pet pet1 = new pet(phone, p_name, p_age, p_gender, breed, sp_note);
							sql.petInsert(pet1);
							break;

						case 3: // 예약
							System.out.println("===========================");
							System.out.println("|1.예약하기              2.예약확인       |");
							System.out.println("===========================");
							System.out.println(  "|메뉴선택 >> |");
							System.out.println("===========");
							dmenu = sc.nextInt();

							switch (dmenu) {
							case 1: // 예약하기
								System.out.println("===========================");
								System.out.println("|1.호텔                     2.병원             |");
								System.out.println("===========================");
								System.out.println(  "|메뉴선택 >> |");
								System.out.println("===========");
								emenu = sc.nextInt();

								switch (emenu) {
								case 1: // 호텔
									System.out.println("==========================");
									System.out.println("|개편한 호텔에 오신것을 환영합니다.|");
									System.out.println("|연락처를 입력해주세요 >>       |");
									System.out.println("==========================");
									String ho_phone = sc.next();
									System.out.println("==========================================");
									System.out.println("|1. 숙박		2. 식사		3.수영장      |");
									System.out.println("|4. 미용실		5.선택사항없음              |");
									System.out.println("==========================================");
									System.out.println("메뉴를 선택해 주세요. >>> |");
									System.out.println("=====================");
									int price = 0;
									int num = 0;
									int sum = 0;
									double avg = 0;
									
									String ho_hotel = "";
									String ho_res = "";
									String ho_swim = "";
									String ho_salon = "";
									
									int cho[] = new int[4];
									String[] menu1 = new String[4];
									for (int i = 0; i < cho.length; i++) {
										num = sc.nextInt();
										switch (num) {
										case 1:
											menu1[i] = "숙박";
											price = 50000;
											ho_hotel = "O";
											break;
										case 2:
											menu1[i] = "식사";
											price = 20000;
											ho_res = "O";
											break;
										case 3:
											menu1[i] = "수영장";
											price = 10000;
											ho_swim = "O";
											break;
										case 4:
											menu1[i] = "애견미용실";
											price = 40000;
											ho_salon = "O";
											break;
										case 5:
											menu1[i] = "선택없음";
											price = 0;
											break;

										default:
											System.out.println("해당 메뉴는 없습니다.");
											break;
										}
										cho[i] = num;
										sum += price;
										avg = sum * 0.7;
									}
									int avg2=(int)avg;
									

									for (int i = 0; i < menu1.length; i++) {
										System.out.print(menu1[i] + " ");
									}
									System.out.println();
									System.out.println("가격은 " + sum + "원 입니다.");
									System.out.println("30% 할인 들어간 금액은 " + (int) avg + "원 입니다.");
									sql.pointMinus(avg2, ho_phone);

									int ho_price = (int) avg;
									
									Hotel ho = new Hotel(ho_phone, ho_hotel, ho_res, ho_swim, ho_salon, ho_price);
									
									sql.hoInsert(ho_phone, ho_hotel, ho_res, ho_swim, ho_salon, ho_price);
									
									break;

								case 2: // 병원
									System.out.println("===========================");
									System.out.println("|개편한 병원에 오신것을 환영합니다. |");
									System.out.println("===========================");
									System.out.println("==================================");
									System.out.println(  "|회원등록시 기재한 전화번호를 입력해주세요 >> |");
									System.out.println("==================================");
									String hs_phone = sc.next();
									System.out.println("=============================================================");
									System.out.println("|1. 예방접종 \t\t 2. 건강검진\t\t3.중성화수술       |");
									System.out.println("|4. 전문의상담 \t\t 5.선택사항없음\t\t             |");
									System.out.println("=============================================================");
									System.out.println("|메뉴를 4가지 선택해 주세요. >>>|");
									System.out.println("=========================");
									int price1 = 0;
									int num1 = 0;
									int sum1 = 0;
									double avg1 = 0;
									String hs_vc = "";
									String hs_bc = "";
									String hs_ns = "";
									String hs_ad = "";
									
									int cho1[] = new int[4];
									String[] menu2 = new String[4];
									for (int i = 0; i < cho1.length; i++) {
										num1 = sc.nextInt();
										switch (num1) {
										case 1:
											menu2[i] = "예방접종";
											price1 = 30000;
											hs_vc = "O"; 
											break;
										case 2:
											menu2[i] = "건강검진";
											price1 = 50000;
											hs_bc = "O";
											break;
										case 3:
											menu2[i] = "중성화 수술";
											price1 = 100000;
											hs_ns = "O";
											break;
										case 4:
											menu2[i] = "전문의 상담";
											price1 = 10000;
											hs_ad = "O";
											break;
										case 5:
											menu2[i] = "선택없음";
											price1 = 0;
											
											break;

										default:
											System.out.println("해당 메뉴는 없습니다.");
										}
										cho1[i] = num1;
										sum1 += price1;
										avg1 = sum1 * 0.7;
									
									}
									int avg3=(int)avg1;
									for (int i = 0; i < menu2.length; i++) {
										System.out.print(menu2[i] + " ");
									}
									
									System.out.println();
									System.out.println("가격은 " + sum1 + "원 입니다.");
									System.out.println("30% 할인 들어간 금액은 " + (int) avg1 + "원 입니다.");
									sql.pointMinus(avg3, hs_phone);
									int hs_price = (int)avg1;
									
									Hospital hos = new Hospital(hs_phone, hs_vc, hs_bc, hs_ns, hs_ad, hs_price);
									
									sql.hsInsert(hs_phone, hs_vc, hs_bc, hs_ns, hs_ad, hs_price);
								}
								break;
							case 2: // 예약확인
								System.out.println("예약확인 할 연락처를 입력하세요");
								phone = sc.next();
								sql.selectM(phone);
								sql.selectP(phone);
								sql.selectHO(phone);
								sql.selectHS(phone);
								break;
							}
							break;
						case 4: //로그아웃
							System.out.println("로그아웃되었습니다.");
							run1=false;
							break;
						}
						
						
						
					}
				}

				else {//로그인의 끝
					System.out.println("아이디와 비밀번호를 다시 확인하세요.");
				}
				break;
			case 3://프로그램 종료
				System.out.println("로그아웃 되었습니다.");
				run = false;
				break;
			}
		}
	}
}
