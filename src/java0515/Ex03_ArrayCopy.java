/*
  Date : 2020.05.15
  Author :신희태
  Description : 배열복사
  Version : 1.2
*/
package java0515;

public class Ex03_ArrayCopy {

	public static void main(String[]args) {
	
		 String[] str1 = {"신희태", "이유진", "김성진", "이영은"};//
		 String[] str2 = new String[4];
		 
		 //str1= 人人人 // str1에있는 사람들을
		 //str2= ㅁㅁㅁ// str2에 넣으려고 한다.
		 //방법1)
//		 for(int i=0; i<str1.length; i++) {// str.length 값은 
//			 str2[i] = str1[i];  //str2 [i] 값은 str[i] 값이다. 집어 넣은것이다. 
//			 System.out.println("str1[" + i +"]="+ str1[i]);
//			 System.out.println("\t str2[" + i +"]="+ str2[i]);
//		 }
		 //방법2)
//		 System.arraycopy(str1, 0, str2, 1, str1.length-1);   //str1의, 0번부터 복사해서, str2의, 0번부터 붙여넣기, str1의 옮길 갯수는 3개)
//		 System.arraycopy(str1, 3, str2, 0, str1.length-3);   //str1의, 3번부터 복사해서, str2의, 0번부터 붙여넣기, str1의 옮길 갯수는 1개
		// System.arraycopy(str1, 2, str2, 1, str1.length-2); //str1의,1부터 복사해서, str2의,2번부터 붙여넣기, str1의 옮길 갯수는 3개)이거 정리하자
		// System.arraycopy(str1, 0, str2, 0, str1.length);   //str1의,1부터 복사해서, str2의,2번부터 붙여넣기, str1의 옮길 갯수는 3개) 이거 정리 하자
		 
		 //System.arraycopy(str1, 0, str2, 0, str1.length);
		 // 복사할 배열명,복사할 index번호,붙여넣기할 배열명 ,붙여넣기할 index번호,복사배열크기
		 for(int i=0; i<str1.length; i++) {// str.length 값은 
			
			 System.out.print("str1[" + i +"]="+ str1[i]);
			 System.out.println("\t str2[" + i +"]="+ str2[i]);
		 
		 }
		 
	}
}
