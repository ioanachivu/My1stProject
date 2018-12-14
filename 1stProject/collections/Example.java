package collections;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Example {

	public static String[] vehicles = { "ambulance", "helicopter", "lifeboat" };

	public static String[][] drivers = { 
			{ "Fred", "Sue", "Pete" }, 
			{ "Sue", "Richard", "Bob", "Fred" },
			{ "Pete", "Mary", "Bob" } };

	public static void main(String[] args) {
		Map<String, Set<String>> personnel = new HashMap<String, Set<String>>();

		for (int i = 0; i < vehicles.length; i++) {
			String vehicle = vehicles[i];
			String[] driversList = drivers[i];

			Set<String> driversSet = new LinkedHashSet<String>();

			for (String value : driversList) {
				driversSet.add(value);
			}

			personnel.put(vehicle, driversSet);
		}
		Set<String> theList = personnel.get("helicopter ");

		for (String value : theList) {
			System.out.println(value);
		}

		// iterate through the whole thing
		for (String vehicle : personnel.keySet()) {
			System.out.println(vehicle + ": ");
			Set<String> driversList = personnel.get(vehicle);

			for (String driver : driversList) {
				System.out.println(driver + " ");
			}
			System.out.println();
		}
	}
}
