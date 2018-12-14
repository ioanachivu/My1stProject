package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ChoosingAList {
	
	//////////// LISTS //////////////
	// store lists of objects which remain in order
	// duplicates are allowed (exml: a shopping list)
	// elements are indexed via an integer
	// checking for a particular item in the list is slow
	// looking an item by it's index is fast
	// iterating through list is relatively fast
	// you can sort lists if you want to
	
	// use ArrayList if you only add/remove items at the end of the list
	List<String> arrayList = new ArrayList<String>();
	
	// useful for adding/removing items elsewhere in the list
	List<String> linkedList = new LinkedList<String>();
	
	//////////// SETS //////////////
	// only stores unique values, great for removing duplicates
	// not indexed, unlike lists
	// very fast to check if a particular obj exists
	// you can use with you own obj, but equals() & hashCode() must be implemented
	// can be used with SortedSet interface
	
	// HashSet has no particular order and may change 
	Set<String> hashSet = new HashSet<String>();
	
	// sorted in the natural order
	Set<String> treeSet = new TreeSet<String>();
	
	// keeps the order in which the items are inserted
	Set<String> linkedHashSet = new LinkedHashSet<String>();
	
	//////////// MAPS //////////////
	// key value pairs
	// retrieving a value by key is fast
	// you can use with you own obj, but equals() & hashCode() must be implemented
	// can be used with SortedMap interface
	// log n < n log n < n
	// 
	
	// keys in no particular order and liable to change 
	Map<Integer, String> hashMap = new HashMap<Integer, String>();
	
	// sorted in the natural order
	Map<Integer, String> treeMap = new TreeMap<Integer, String>();
	
	// keeps the order in which the items are inserted
	Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
}
