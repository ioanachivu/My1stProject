package hospitalApp;

public class Person {

	private String name;
	private String SSN;
	
	
	public Person(String name, String SSN) {
		this.name = name;
		this.SSN = SSN;
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
	
	@Override
	public String toString() {
		return  name;
	}
}
