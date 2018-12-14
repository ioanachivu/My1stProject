package serialization;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

class Reading {
	public static void main(String[] args) {
		System.out.println("reading shit");
		
		try (FileInputStream fis = new FileInputStream("people.bin")) {
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Person mike = (Person) ois.readObject();
			Person sue = (Person) ois.readObject();
			
			System.out.println(mike);
			System.out.println(sue);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}