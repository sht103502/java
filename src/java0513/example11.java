package java0513;

public class example11 {

	public static void main(String[] args) {
		// 
		for(int i=2; i<=9; i++) {
			System.out.println("구구단을 외자!\n구구단을 외자!" + i + "단");
			for(int j=1; j<=9; j++) {
				System.out.print(i+"X");
				System.out.println(j+"="+ i*j);
			}
			  System.out.println("========");
		}
		
	}

}
