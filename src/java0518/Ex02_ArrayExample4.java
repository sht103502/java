/*
  Date : 2020.05.18
  Author :신희태
  Description : 배열구구단
  Version : 1.1
*/
package java0518;

import java.util.Scanner;

public class Ex02_ArrayExample4 {

	public static void main(String[] args) {
		//
//		for(int i=2; i<=9; i++) {
//			for(int j=1; j<=9; j++) {
//				System.out.print(i+"x" + j+"="+i*j);
//				System.out.print("\t");
		/*int multi[][] = new int[8][9];
		//System.out.println(multi.length); // 방크기  =9
		
		
		for(int i=0; i<multi.length; i++) {
			for (int j=0; j<multi.length; j++) {
				
				multi[i][j] = i*j;
				multis[i][j] = multi[i-1][j-2];
				
				System.out.print(i + "x" + j + "=" + multis[i][j]+"\t");
		
			*/
		
		//2번
//		int multi[][]=new int[8][9];//{{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{9},{9},{9},{9},{9},{9}}
//		
//	//System.out.println(multi.length);
//	for(int i=0; i< multi.length; i++){
//		for(int j=0; j<=multi.length; j++) {
//			//System.out.println(multi[i);
//			multi[i][j] = (i+2)* (j+1);
//			System.out.print((i+2)+ "x"+ (j+1)+"="+ multi[i][j] );
//			System.out.print("\t");
//		
		
		//3번
		int [][]multi =new int[9][8];
		
	
	for(int i=0; i< multi.length; i++){
		for(int j=0; j<multi[i].length; j++) {
			//System.out.println(multi[i);
			multi[i][j] = (i+1)* (j+2);
			
			System.out.print((j+2)+ "x"+ (i+1)+"="+ multi[i][j] +"\t");
		}
		
	System.out.println();
	}
	
		
		





}
}