package Pet;

public class Hotel {
	String ho_phone;
	String ho_hotel;
	String ho_res;
	String ho_swim;
	String ho_salon;
	int ho_price;
	public String getHo_phone() {
		return ho_phone;
	}
	public void setHo_phone(String ho_phone) {
		this.ho_phone = ho_phone;
	}
	public String getHo_hotel() {
		return ho_hotel;
	}
	public void setHo_hotel(String ho_hotel) {
		this.ho_hotel = ho_hotel;
	}
	public String getHo_res() {
		return ho_res;
	}
	public void setHo_res(String ho_res) {
		this.ho_res = ho_res;
	}
	public String getHo_swim() {
		return ho_swim;
	}
	public void setHo_swim(String ho_swim) {
		this.ho_swim = ho_swim;
	}
	public String getHo_salon() {
		return ho_salon;
	}
	public void setHo_salon(String ho_salon) {
		this.ho_salon = ho_salon;
	}
	public int getHo_price() {
		return ho_price;
	}
	public void setHo_price(int ho_price) {
		this.ho_price = ho_price;
	}
	
	public Hotel(String ho_phone, String ho_hotel, String ho_res, String ho_swim, String ho_salon, int ho_price) {
		super();
		this.ho_phone = ho_phone;
		this.ho_hotel = ho_hotel;
		this.ho_res = ho_res;
		this.ho_swim = ho_swim;
		this.ho_salon = ho_salon;
		this.ho_price = ho_price;
	}
	
	
	
	
}
