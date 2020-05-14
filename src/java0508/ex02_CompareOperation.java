/*
  
  Date : 2020.05.08
  Author :booltaeliya
  Description : Java 기본설정
  Version : 1.0
  
 
 
  
*/
package java0508;

public class ex02_CompareOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int num1 = 5; int num2 = 3;
		 * 
		 * boolean result; 
		 * result = num1 > num2; 
		 * System.out.println("num1 > num2: " + result); 
		 * System.out.println(num1 + ">" + num2 + ":" + result); 
		 * result = num1 < num2; System.out.println("num1 < num2: " + result); 
		 * System.out.println(num1 + "<" + num2 + ":" + result);
		 */
		// num1과 num2 가 같다.
		// 두개의 정수가 같은지 비교할때 ==
		int num1 = 10;
		int num2 = 10;

		boolean result;
		result = num1 == num2;
		System.out.println("num1 == num2" + result);
		System.out.println(num1 + "=" + num2 + ":" + result);

		// num1 과 num2 가 다르다.
		//두개의 정수가 다른지 비교할떄 !=
		result = num1 != num2;
		System.out.println("num1 != num2" + result);
		System.out.println(num1 + "!" + num2 + ":" + result);

		// 중요!! 
		//문자열과 문자열의 비교

		String str1 = "Java";
		String str2 = "Java";
		String str3 = "자바";
		
		//문자열 두개가 같은지 비교
		//변수명1.equals(변수명2)
		
		result = str1.equals(str2);
		System.out.println("str1과str2의 문자비교" + result);

		result = str1.equals(str3);
		System.out.println("str1과str3의 문자비교" + result);

	}

}
