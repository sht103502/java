package Pet;

public class pet {
	
	private String p_phone;
	private String p_name;
	private int p_age;
	private String p_gender;
	private String breed;
	private String sp_note;
	
	public String getP_phone() {
		return p_phone;
	}
	public void setP_phone(String p_phone) {
		this.p_phone = p_phone;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public int getP_age() {
		return p_age;
	}
	public void setP_age(int p_age) {
		this.p_age = p_age;
	}
	public String getP_gender() {
		return p_gender;
	}
	public void setP_gender(String p_gender) {
		this.p_gender = p_gender;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getSp_note() {
		return sp_note;
	}
	public void setSp_note(String sp_note) {
		this.sp_note = sp_note;
	}
	
	public pet() {
		// TODO Auto-generated constructor stub
	}
	
	public pet(String p_phone, String p_name, int p_age, String p_gender, String breed, String sp_note) {
		super();
		this.p_phone = p_phone;
		this.p_name = p_name;
		this.p_age = p_age;
		this.p_gender = p_gender;
		this.breed = breed;
		this.sp_note = sp_note;
	}

}
