/*
  Date : 2020.05.11
  Author :신희태
  Description : 조건문if (ifElse)
  Version : 1.0
*/
package java0511;

public class ex10_ifElse {

	public static void main(String[] args) {
		/*
		 		if(조건식){
		 			조건식이 참일 경우 실행
		 		}else{
		 			조건식이 거짓일 경우 실행
		 		}
		 
		 
		 */
		
		boolean condition = true;
		 System.out.println("if문 시작");
		 
		 if(condition) {
			 System.out.println("조건만족");
			 System.out.println("condition이" + condition + "일때");
		 }else {
			 System.out.println("조건불만족");
			 System.out.println("condition이" + !condition + "일때");
		 }
		 System.out.println("if문종료");
		 
		 System.out.println();
		 System.out.println("===================");
		 
		 int num1 = 5, num2 = 3;
		 if(num1>num2) {
			 System.out.println("num1이 크다");
			 
		 }else {
			 System.out.println("num2가 크다");
			 
		 }
		
		 //문제.
		 //나이가 8살이면 학교에 갑니다. 그렇지 않으면 학교에 가지 않습니다.
	   
		
	    int Age=10, num= 8;
	    
	    
	    
		
	     if(Age >= 8) {
			System.out.println("나이가 8살이상이니 학교에 갑니다.");
			
		}else {
			System.out.println("나이가 8살 보다 적으니 학교에 가지 않습니다.");
		}
 
	     String str1= "id";
	     String str2= "naver.serverid ";
	     
	     if(str1.equals(str2)) {
	    	 System.out.println("두 문장이 같다.");
	     }else {
	    	 System.out.println("두 문장이 다르다.");
	     }
	     
	}
}
