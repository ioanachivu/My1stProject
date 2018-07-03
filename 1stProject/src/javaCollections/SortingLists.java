package javaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingLists {
	public static void main(String[] args) {
		

		List<String> animals = new ArrayList<String>();
		animals.add("tiger");
		animals.add("lion");
		animals.add("elephant");
		animals.add("parrot");
		animals.add("monkey");
		animals.add("albatros");

		Collections.sort(animals);  // sorts in natural order
		for (String value : animals) {
			System.out.println(value);
		}
		System.out.println();
		
		//////////////// SORTING IN THE ORDER OF THE STRING LENGHT
		class StringLengthComparator implements Comparator<String> {

			@Override
			public int compare(String s1, String s2) {
				int len1 = s1.length();
				int len2 = s2.length();

				if (len1 > len2) {
					return 1;
				} else if (len1 < len2) {
					return -1;
				}
				return 0;
			}
		}
		
		Collections.sort(animals, new StringLengthComparator());
		for (String values : animals) {
			System.out.println(values);
		}
		//////////////// WITH NUMBERS
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(3);
		numbers.add(8);
		numbers.add(9);
		numbers.add(25);

		Collections.sort(numbers);
		for (Integer number : numbers) {
			System.out.println(number);
		}
	}
}
