package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class Scriere {
	public static void main(String[] args) {
		System.out.println("writing shit");
		
		Person mike = new Person (56, "Michael");
		Person sue = new Person (48, "Susan");
		
		System.out.println(mike);
		System.out.println(sue);
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.bin"))) {
			
			oos.writeObject(mike);
			oos.writeObject(sue);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}