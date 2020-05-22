package java0515;

import java.util.Scanner;

public class Ex05_Arraymax {

	public static void main (String [] args) {
		//--------------------------------------------
		/*1.학생수| 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
		-----------------------------------------------
		 * 학생 수는 while 문 안에서
		 * int stuNum = sc.nextInt();
		 scores =new int[stuNum];
		 * */
	
		
	
		//scores = new int[stuNum];
	Scanner sc= new Scanner(System.in);
	int [] scores =null;
	boolean run =true;
	
		while (run) {
			 System.out.println("---------------------------------------------------");
			 System.out.println("1. 학생수 | 2. 점수입력 | 3.점수리스트 | 4.분석 | 5.종료 |");
			 System.out.println("---------------------------------------------------");
			 System.out.println("선택>>");
			 int menu = sc.nextInt();
			 int sum=0;
			 //scores.length;
		//	int  num = sc.nextInt();
			int avg=0;
			int max=0;
			int min=0;
			 
		
			 switch(menu) {
				case 1:
					System.out.println("학생수는 몇명입니까? :");//stuNum
					int stuNum= sc.nextInt();//5
					scores = new int [stuNum];//5
					break;
					
				case 2:
					for(int i=0; i<scores.length; i++) {//4까지 
					System.out.println("점수는 몇점 입니까?: ");//scores	
					scores[i] = sc.nextInt();
					System.out.println(i+1 + "번째 학생점수:" + scores[i]+" 입니다.");
					//styNum ==scores.length;
					}
					break;
					
				case 3: 
					for(int i=0; i<scores.length; i++) {
					System.out.println(i+1+ "번의 점수:" + scores[i] +"점");
					}
					break;
				case 4:
					for(int i=0; i<scores.length; i++) {
					sum += scores[i]; // sum = sum+scores[i];
					avg = sum/scores.length;
					max = (scores[i] >max )?scores[i] :max ;
					//min = (scores[i] <min )?scores[i] :min ;
					}
					System.out.println("최고점수:" +max  + "점"+"\n최저점수:" + min + "점" + "\n평균점수:"+ avg+ "점");
					break;
				case 5:
					System.out.println();
					run=false;
					break;
				
				default:
						System.out.println("잘못입력했습니다.");
						break;
			}
		System.out.println();
	}
		System.out.println("프로그램을 종료합니다!");
		sc.close();
	}

}
