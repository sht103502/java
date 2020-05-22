/*
  Date : 2020.05.14
  Author :신희태
  Description : ArrayExample3
  Version : 1.0
*/
package java0518;

import java.util.Scanner;

public class Ex01_ArrayExample3 {

	public static void main(String[] args) {
		// String[][] words;
		//words[5][2];
		// 배열 [행][열];
		//
		String[][] words= {
				{"chair","의자"},
				{"desk","책상"},
				{"coffee","커피"},
				{"water", "물"},
				{"pen","볼펜"},
				{"computer","컴퓨터"}
		};	
			int score =0;
			
			Scanner sc=new Scanner(System.in);
			System.out.println("words.length:"+ words.length);
			for(int i=0; i< words.length; i++ ) {
			System.out.println("문제" + (i+1) +"."+ words[i][0]+ "뜻은 무엇입니까?");
			//words[i][0] = 단어
			//words[i][1] = 뜻
			String answer =sc.next();
			
			
			if(answer.equals(words[i][1])) {
				System.out.println("정답입니다!");
				score++;
			}else {
				System.out.println("틀렸습니다!");
				System.out.println("정답은"+ words[i][1]);
			}
			
			}
	System.out.println();
	System.out.println("총 "+ score + "개를 맞췄습니다.");
	double percent =100 * ((double)score/words.length);
	System.out.println("정답률은"+ percent +"%입니다.");
	}
	
}


