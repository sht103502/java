/*
  Date : 2020.05.13
  Author :신희태
  Description :  forStar
  Version : 1.4
*/
package java0513;

public class ex06_forStar {

	public static void main(String[] args) {
		// 문제 !  트리모양 처럼 만들어라!
	//	 *
	//	 *
	//	 **
	//	 ***
	//	 ****
	//	 *****
		 
		
		/*
		// 방법1)
		 String sum="";
		  
		  for (int i=1; i<6; i++){
		     System.out.println(sum+="*");//sum=sum+"*";
		  }
		 */ 
		  
		
		//방법2)
	int i;
	int j;
		
		for(i=1; i<=5; i++) {//1번
			for (j=1; j<=i;j++) {//2번
				
				System.out.print("*");
			}
			System.out.println();
		}
			
	}
}


