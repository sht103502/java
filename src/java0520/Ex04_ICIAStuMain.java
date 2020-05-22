package java0520;

public class Ex04_ICIAStuMain {

	public static void main(String[] args) {
		
		
		Ex04_ICIAStu SHT = new Ex04_ICIAStu("ShinHeeTae", 26, "명상", "가정동", 951128);
		SHT.showInfo();
		Ex04_ICIAStu LYJ = new Ex04_ICIAStu("LeeYouJin", 30, "조립하기", "주안동", 910121);
		LYJ.showInfo();
		Ex04_ICIAStu KSJ = new Ex04_ICIAStu("KimSungJin", 26, "운동", "동인천",950410 );
		KSJ.showInfo();
		Ex04_ICIAStu LYE = new Ex04_ICIAStu("LeeYoungEun", 24, "집순이", "학익동", 970403);
		LYE.showInfo();
	
		SHT.downage();
		LYJ.downage();
		KSJ.downage();
		LYE.downage();
		System.out.println("=============================");
		System.out.println("신희태의 나이 만 "+SHT.age + "세");
		System.out.println("이유진의 나이 만 "+LYJ.age + "세");
		System.out.println("김성진의 나이 만 "+KSJ.age + "세");
		System.out.println("이영은의 나이 만 "+LYE.age + "세");
//			
//		}
	}
	

}
