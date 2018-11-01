package shipsGame;

import java.util.ArrayList;

public class Ship {

	private ArrayList<String> locationCells = new ArrayList<>();
	private String name;
	
	void setLocationCells(ArrayList<String> location) {
		locationCells = location;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public String checkYourself (String userInput) {
		String result = "miss";
		int index = locationCells.indexOf(userInput);
		
		if (index >= 0) {
			locationCells.remove(index);
		}
		
		if (locationCells.isEmpty()) {
			result = "Kill";
			System.out.println("You sunk " + name);
		} else {
			result = "hit";
		}
		return result;
	}
}
