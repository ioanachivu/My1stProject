package hospitalApp;

public class Patient {

	private String name;
	private String SSN;
	private int fileNo;
	
	
	public Patient(String name, String sSN) {
		super();
		this.name = name;
		SSN = sSN;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}
	public int getFileNo() {
		return fileNo;
	}
	public void setFileNo(int fileNo) {
		this.fileNo = fileNo;
	}
	
	
	
}
