package hospitalApp;

public class Patient extends Person {

	private int fileNo;
	
	
	public Patient(String name, String SSN, int fileNo) {
		super(name, SSN);
		this.fileNo = fileNo;
	}
	
	public int getFileNo() {
		return fileNo;
	}
	public void setFileNo(int fileNo) {
		this.fileNo = fileNo;
	}
	
	
	
}
