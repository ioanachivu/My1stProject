package hospitalApp;

public class Doctor {

	private String name;
	private String docID;
	
	public Doctor(String name, String docID) {
		this.name = name;
		this.docID = docID;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDocID() {
		return docID;
	}

	public void setDocID(String docID) {
		this.docID = docID;
	}	
}
