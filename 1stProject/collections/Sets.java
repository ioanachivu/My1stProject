package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
	public static void main(String[] args) {

		Set<String> hashSet = new HashSet<String>(); // unsorted set
		Set<String> linkedHashSet = new HashSet<String>(); // in order of insertion
		Set<String> treeSet = new TreeSet<String>(); // in natural order

		testSet(hashSet);
		System.out.println();
		testSet(linkedHashSet);
		System.out.println();
		testSet(treeSet);

		////////////// VERIFY IF IT CONTAINS A SPECIFIC ELEMENT
		if (treeSet.contains("food")) {
			System.out.println("it has the element");
		} else {
			System.out.println("it doesn't");
		}
		///////////// VERIFI IF SET IS EMPTY
		if(treeSet.isEmpty()) {
			System.out.println("is empty");
		}
	}

	public static void testSet(Set<String> set) {
		set.add("cinamon");
		set.add("wolf");
		set.add("dairy");
		set.add("monkey");
		set.add("food");
		
		set.add("monkey"); // adding duplicate items does nothing
		
		for(String value: set) {
			System.out.println(value);
		}
	
	}
}