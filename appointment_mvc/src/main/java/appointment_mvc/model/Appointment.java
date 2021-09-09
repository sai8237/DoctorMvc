package appointment_mvc.model;



public class Appointment {
	
	
    private int bookId;
	
	private String doctorName;
	
	private String patientName;
	
	private String payment;
	private String status;
	
	private String dateTime;
	
	
	public Appointment() {}
	
	public Appointment(int bookId, String doctorName, String patientName, String paymentStatus, String dateTime) {
		super();
		this.bookId = bookId;
		this.doctorName = doctorName;
		this.patientName = patientName;
		this.payment= paymentStatus;
		this.dateTime = dateTime;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String paymentStatus) {
		this.payment= paymentStatus;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
