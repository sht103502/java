package java0526;

import java.util.Scanner;

public class StarExample2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("홀수숫자를 입력해주시오>>");
		int num=sc.nextInt();
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) 
			{
				if(i<=num/2)//위쪽 영역
				{
					if(i+j<=num/2-1)//왼쪽위 공백찍기
						System.out.print(" ");
					else if(j-i>=num/2+1)//오른쪽 위 공백찍기
						System.out.print(" ");
					else
						System.out.print("*");//*찍기
				}
				else if(i>num/2)//아래쪽영역
				{
					if(i-j>=num/2+1)//왼쪽 및 공백
						System.out.print(" ");
					else if (i+j>=num/2*3+1)//오른쪽 밑 공백
						System.out.print(" ");
					else
						System.out.print("*");//*찍기
				}
			}
			System.out.println();//줄 바꿈
		}
	}
}