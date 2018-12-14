package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lessons.Person;

public class FileReading {
	public static void main(String[] args) { 

		List<Person> personsList = new ArrayList<>();

		File file = new File("D:/PROGRAME/eclipse-workspace/MyFirstProject/src/tutorials/ioana.txt");
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {

			String line;
			while ((line = br.readLine()) != null) {
				// splitting a line in a file and adding it to the list
				String[] tokens = line.split("/");
				
				// making a new object and adding to the list
				Person person = new Person(tokens[0], Integer.parseInt(tokens[1]));
				personsList.add(person);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Can't find file: " + file.toString());
		} catch (IOException e) {
			System.out.println("Unable to read file: " + file.toString());
		}
	}
}