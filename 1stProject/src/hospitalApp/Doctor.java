package hospitalApp;

public class Doctor extends Person {

	private String docID;
	
	
	public Doctor(String name, String SSN, String docID) {
		super(name, SSN);
		this.docID = docID;
	}

	public String getDocID() {
		return docID;
	}

	public void setDocID(String docID) {
		this.docID = docID;
	}
	
	
}
