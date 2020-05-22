package java0515;

import java.util.Scanner;

public class Ex06_ArrayExample2 {

	public static void main(String[] args) {
//		//2차원 배열
//		//타입 [][] 배열명=new int [i][j];
//		//타입 [] 배열명 =new int[i];
//		int[][] num1 =new int[2][3];// length 가 3개인 애가 2개가 있다.
//		int[][] num2 =new int[3][3];// length 가 3개인 애가 3개가 있다.
//		
//		
//		num1[0][0]=1;
//		num1[0][1]=2;
//		num1[0][2]=3;
//		num1[1][0]=4;
//		num1[1][1]=5;
//		num1[1][2]=6;
//		
//		for (int i=0; i<num1.length; i++) {
//			for(int j=0; j<num1.length; j++) {
//				System.out.println("num[" + i + "]["+ j + "]="+ num1[i][j] );
//			}
//		}
		Scanner sc= new Scanner(System.in);
		String[][] words = {
				{"chair","의자"},
				{"desk","책상"},
				{"coffee","커피"},
				{"pen","볼펜"},
				{"computer","컴퓨터"}
		};
		
		for (int i=0; i<words.length; i++) {
			for(int j=0; j<words[i].length; j++) {
				System.out.println("words[" + i + "]["+ j + "]="+ words[i][j] );
			}
		}
		for (int i=0; i<words.length; i++) {
			
				System.out.println("문제"+ (i+1)+"." + words[i][0]+"뜻이 무엇인가요");
				String answer= sc.next();
				if (answer.contentEquals(words[i][1])) {
				 	System.out.println("정답입니다.");
				}else {
					System.out.println("틀렸습니다.");
					System.out.println(" 정답은"+ words[i][1]+ "입니다.");
				}
		}
		
//		System.out.println(num1.length);
//		System.out.println(num1[0].length);
//		System.out.println(num1[1].length);
//		System.out.println();
//		
//		System.out.println(num2.length);
//		System.out.println(num2[0].length);
//		System.out.println(num2[1].length);
//		System.out.println(num2[2].length);
//		
//		//num1 = { {1,2,3}, {4,5,6} }
//		//num2 = { {1,2,3}, {4,5,6}, {7,8,9}}
		
	}

}
