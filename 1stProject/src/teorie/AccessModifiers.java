package teorie;

public class AccessModifiers {
	public static void main(String[] args) { 	
	}
	
	// this method can be accessed anywhere in the program
	public void doSmthPublic() {
	}
	
	// default: acces doar in interiorul packetului
	void doSmth() {
	}

	// access in the package and the subclasses
	protected void doSmthProtected() {
	}

	// access just in the class
	@SuppressWarnings("unused")
	private void doSmthPrivate() { };
	
		
	

	
}
