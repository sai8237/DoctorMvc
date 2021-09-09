package appointment_mvc.model;


public class Doctor {

	
	private String email;
	private String name;
	private String category;
	private  int  fee;
	private String password;
	private String gender;
	private String mobile;
	
	public Doctor(){}
	
	public Doctor(String email, String name, String category, int fee, String password, String mobile) {
		super();
		this.email = email;
		this.name = name;
		this.category = category;
		this.fee = fee;
		this.password = password;
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
}
