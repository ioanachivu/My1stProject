package javaCollections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {
	public static void main(String[] args) {

		Map<Integer, String> hashMap = new HashMap<Integer, String>(); // unsorted list
		// keeps the values in the order in which they were entered
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		// keeps the values in the natural order
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();

		testMap(hashMap);
		System.out.println();
		testMap(linkedHashMap);
		System.out.println();
		testMap(treeMap);
	}

	public static void testMap(Map<Integer, String> map) {
		map.put(3, "banana");
		map.put(5, "carrot");
		map.put(4, "snake");
		map.put(2, "fish");
		map.put(8, "crocodile");

		for (Integer key : map.keySet()) {
			String value = map.get(key);
			System.out.println(key + ": " + value);
		}

		if (map.containsKey(2)) {
			System.out.println(map.get(2));
		}
	}
}