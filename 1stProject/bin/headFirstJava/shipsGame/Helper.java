package shipsGame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Helper {
	
	private static final String alphabet = "abcdefg";
	private int gridLength = 7;
	private int gridSize = 49;
	private int[] grid = new int[gridSize];
	private int count =0;
	

	public ArrayList<String> placeShips(int i) {
		ArrayList<String> alphaCells = new ArrayList<>();
		
		String temp = null;
		int[] coords = new int[i];
		int attempts = 0;
		boolean success = false;
		int location = 0;
		
		count++;
		int incr = 1;
		if ((i%2)==1) {
			incr = gridLength;
		}
		
		while(!success&attempts++<200) {
			location = (int) (Math.random()* gridSize);
		
		int x= 0;
		success = true;
		
		while(success && x < i) {
			if (grid[location] == 0) {
				coords[x++] = location;
				location += incr;
				if (location >= gridSize) {
					success = false;
				}
				if (x>0 && (location % gridLength == 0)) {
					success = false;
				}
			} else {
				success = false;
			}
		}
		}
		int x = 0;
		int row = 0;
		int column = 0;
		
		while (x<i) {
			grid[coords[x]] = 1;
			row = (int) (coords[x]/gridLength);
			column = coords[x] % gridLength;
			temp = String.valueOf(alphabet.charAt(column));
			
			alphaCells.add(temp.concat(Integer.toString(row)));
			x++;
		}
		return alphaCells;
	}

	public String getUserInput(String prompt) {
		String inputLine = null;
		System.out.println(prompt+ " ");
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			inputLine = is.readLine();
			if (inputLine.length()==0) return null;
		} catch (IOException e) {
			System.out.println("IOException " +e);
		}
		return inputLine.toLowerCase();
	}

}
