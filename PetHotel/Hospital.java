package Pet;

public class Hospital {
	String hs_phone;
	String hs_vc;
	String hs_bc;
	String hs_ns;
	String hs_ad;
	int pirce;
	

	public String getHs_phone() {
		return hs_phone;
	}

	public void setHs_phone(String hs_phone) {
		this.hs_phone = hs_phone;
	}

	public String getHs_vc() {
		return hs_vc;
	}

	public void setHs_vc(String hs_vc) {
		this.hs_vc = hs_vc;
	}

	public String getHs_bc() {
		return hs_bc;
	}

	public void setHs_bc(String hs_bc) {
		this.hs_bc = hs_bc;
	}

	public String getHs_ns() {
		return hs_ns;
	}

	public void setHs_ns(String hs_ns) {
		this.hs_ns = hs_ns;
	}


	public String getHs_ad() {
		return hs_ad;
	}


	public void setHs_ad(String hs_ad) {
		this.hs_ad = hs_ad;
	}

	public int getPirce() {
		return pirce;
	}

	public void setPirce(int pirce) {
		this.pirce = pirce;
	}

	public Hospital(String hs_phone, String hs_vc, String hs_bc, String hs_ns, String hs_ad, int pirce) {
		super();
		this.hs_phone = hs_phone;
		this.hs_vc = hs_vc;
		this.hs_bc = hs_bc;
		this.hs_ns = hs_ns;
		this.hs_ad = hs_ad;
		this.pirce = pirce;
	}


	
	
}
