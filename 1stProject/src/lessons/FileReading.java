package teorie;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReading {
	public static void main(String[] args) {

		// String from the console:
		Scanner input = new Scanner(System.in); // create scanner object
		System.out.println("Enter a string value: "); // cout<<

		String value = input.nextLine(); // cin>>
		System.out.println("You entered: " + value); // tell them what they entered

		// Buffered Read // reads the file line by line

		File file = new File("D:/PROGRAME/eclipse-workspace/MyFirstProject/src/tutorials/ioana.txt");

		try (BufferedReader br = new BufferedReader(new FileReader(file))) {

			String st;
			while ((st = br.readLine()) != null)
				System.out.println(st);

		} catch (FileNotFoundException e) {
			System.out.println("Can't find file: " + file.toString());
		} catch (IOException e) {
			System.out.println("Unable to read file: " + file.toString());
		}

		input.close();

		/**
		 * Scanner File fisier= new
		 * File("D:/PROGRAME/eclipse-workspace/MyFirstProject/src/tutorials/ioana.txt");
		 * Scanner scan= new Scanner(fisier);
		 * 
		 * while(scan.hasNextLine()) System.out.println(scan.nextLine());
		 */

		/*
		 * File Reader // reads the first line of the file
		 * 
		 * FileReader fr= new FileReader(
		 * "D:/PROGRAME/eclipse-workspace/MyFirstProject/src/tutorials/ioana.txt");
		 * 
		 * int i; while ((i=fr.read()) != -1) System.out.println((char)i);
		 */

	}
}