package lessons;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
	public static void main(String[] args) {

		File fisier = new File("D:\\PROGRAME\\eclipse-workspace\\My1stProject\\src\\tutorials\\exercitiu.txt");
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(fisier))) {
			bw.write("banana1\n");
			bw.write("banana2\n");
			bw.write("last banana");
		} catch (IOException e) {
			System.out.println("fisierul nu poate fi deschis");
		}
	}
}
