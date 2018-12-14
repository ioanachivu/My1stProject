package anonymousClasses;

class Machine {
	public void start() {
		System.out.println("machine starting....");
	}
}

interface Plant {
	public void grow();
}

public class AnonymousClasses {
	public static void main(String[] args) {
		
		// creating an anonymous class: create new obj from class and override the methods
		Machine bmw = new Machine() {
		@Override public void start() {
			System.out.println(" the bmw started"); 
			}
		};
		
		bmw.start();
		
		// creating anonymous class/methods from an interface
		Plant iarba = new Plant() {
			@Override public void grow() {
				System.out.println("plant growing");
			}
		};
		
		iarba.grow();
	}
}
