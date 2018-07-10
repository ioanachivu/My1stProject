package teorie;

class Frog {
	private String name;
	private int id;

	public Frog(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String facemSir() {
		StringBuilder sb = new StringBuilder();
		sb.append(name).append(": ").append(id);
		
		return sb.toString();
	}
}

public class ToString {
	public static void main(String[] args) {
		Frog frog1 = new Frog("Freddy", 7);
		Frog frog2 = new Frog("Ronnie", 12);
		
		System.out.println(frog1.facemSir());
		System.out.println(frog2.facemSir());
	}
}
