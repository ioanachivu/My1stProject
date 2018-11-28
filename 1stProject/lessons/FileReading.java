package lessons;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReading {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter a string value: ");

		String value = input.nextLine(); 
		System.out.println("You entered: " + value); 

		List<String> list = new ArrayList<String>();

		File file = new File("D:/PROGRAME/eclipse-workspace/MyFirstProject/src/tutorials/ioana.txt");
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {

			String line;
			while ((line = br.readLine()) != null) {
				// splitting a line in a file and adding it to the list
				String[] tokens = line.split("/");
				list.add(tokens[0]);
			}
		
			
			

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