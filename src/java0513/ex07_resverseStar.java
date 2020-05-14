/*
  Date : 2020.05.13
  Author :신희태
  Description :  중첩for 문
  Version : 1.6
*/
package java0513;

public class ex07_resverseStar {

	public static void main(String[] args) {
		/*
		*****
		****
		***
		**
		*
		*/
		/*
		String sum = "";
		
		for (int i=5; i<=1; i--) {
			System.out.println(sum += "*");
	*/
		
		
		
			for(int i=1; i<=5; i++) {//1번
				for (int j=5; i<=j; j--) {//2번
					
					System.out.print("*");
				}
				System.out.println();

	         }
	}
}
 
