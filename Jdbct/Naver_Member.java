package Jdbct;

public class Naver_Member {
	// 필드
	private String N_ID;
	private String N_PASSWORD;
	private String N_NAME;
	private int N_AGE;
	private String N_GENDER;
	private String N_EMAIL;
	private String N_PHONE;
	
	// getter, setter
	public String getN_ID() {
		return N_ID;
	}
	public void setN_ID(String n_ID) {
		N_ID = n_ID;
	}
	public String getN_PASSWORD() {
		return N_PASSWORD;
	}
	public void setN_PASSWORD(String n_PASSWORD) {
		N_PASSWORD = n_PASSWORD;
	}
	public String getN_NAME() {
		return N_NAME;
	}
	public void setN_NAME(String n_NAME) {
		N_NAME = n_NAME;
	}
	public int getN_AGE() {
		return N_AGE;
	}
	public void setN_AGE(int n_AGE) {
		N_AGE = n_AGE;
	}
	public String getN_GENDER() {
		return N_GENDER;
	}
	public void setN_GENDER(String n_GENDER) {
		N_GENDER = n_GENDER;
	}
	public String getN_EMAIL() {
		return N_EMAIL;
	}
	public void setN_EMAIL(String n_EMAIL) {
		N_EMAIL = n_EMAIL;
	}
	public String getN_PHONE() {
		return N_PHONE;
	}
	public void setN_PHONE(String n_PHONE) {
		N_PHONE = n_PHONE;
	}
	
	// 생성자(기본, 매개변수)
	public Naver_Member() {
		super();
	}
	public Naver_Member(String n_ID, String n_PASSWORD, String n_NAME, int n_AGE, String n_GENDER, String n_EMAIL,
			String n_PHONE) {
		super();
		N_ID = n_ID;
		N_PASSWORD = n_PASSWORD;
		N_NAME = n_NAME;
		N_AGE = n_AGE;
		N_GENDER = n_GENDER;
		N_EMAIL = n_EMAIL;
		N_PHONE = n_PHONE;
	}
	
	// toString()
	@Override
	public String toString() {
		return "Naver_Member [N_ID=" + N_ID + ", N_PASSWORD=" + N_PASSWORD + ", N_NAME=" + N_NAME + ", N_AGE=" + N_AGE
				+ ", N_GENDER=" + N_GENDER + ", N_EMAIL=" + N_EMAIL + ", N_PHONE=" + N_PHONE + "]";
	}
	
	
	
}
