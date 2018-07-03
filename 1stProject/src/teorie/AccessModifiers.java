package teorie;

public class AccessModifiers {
	public static void main(String[] args) {	
	}
	
	// this method can be accessed anywhere in the program
	public void doSmthPublic() {
	}

	// acces din ierarhie + pachet + mostenitorii clasei
	protected void doSmthProtected() {
	}

	// acces doar din clasa
	//private void doSmthPrivate() { };
	
		
	// default: acces doar in interiorul packetului
	void doSmth() {
	}

	
}
