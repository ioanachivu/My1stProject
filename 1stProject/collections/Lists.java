package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {
	public static void main(String[] args) {
		
		// arrayList: if you want to add/remove items from the back of the list
		List<Integer> arrayList = new ArrayList<Integer>();
		// linkedList: if you want to add/remove from the middle of the list
		List<Integer> linkedList = new LinkedList<Integer>();
		
		arrayList.add(33);
		arrayList.add(66);
		arrayList.add(77);
		
		// for iteration
		for (int i=0; i<arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		
		for (Integer value:arrayList) {
			System.out.println(value);
		}
		
		// removing numbers.
		arrayList.remove(0); // removing the first number from the 1st position
		arrayList.remove(arrayList.size()-1); // removing the last number
		
		timing("ArrayLit", arrayList);
		timing("LinkedList", linkedList);
		}

	private static void timing (String type, List<Integer> list) {
		
		for (int i=0; i<1E5; i++) { // 1E5 = 1 la puterea a5a (exponential) 
			list.add(i);
		}
		long start = System.currentTimeMillis();
		
		for (int i=0; i<1E5; i++) {
			list.add(i);
		}
		
		long end = System.currentTimeMillis();
		System.out.println("time taken: "+(end-start)+" ms for "+type);
	}
	
	
}
