
package java0526;

public class StarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i;//세로줄 
int j;//가로줄
/*
    *
   ***
  *****
 *******
 
 */
for( i=0; i<4; i++) {
	for(j=0; j<3-i;j++) {
		System.out.print(" ");
	}
	for(j=0; j<2*i+1;j++) {
		System.out.print("*");
	}
	System.out.println("");
}



	}
}
