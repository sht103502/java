package java0513;

public class exampple33 {
	public static void main(String[] args) {
		int i;
		int j;
		int k;
		for(i=1; i<=4; i++) {
			for(j=1; j<=4-i; j++) {
				System.out.print("0");
		}
			for (k=1; k<=2*i-1; k++) {
				System.out.print("*");
		}
			for(j=1; j<=4-i; j++) {
				System.out.print("0");
			}
			for(j=1; j<=4-i; j++) {
				System.out.print("0");
			}for (k=1; k<=2*i-1; k++) {
					System.out.print("*");
			}
			for(j=1; j<=4-i; j++) {
				System.out.print("0");
			}
			
			System.out.println();
	
	
	}
	}
}
