package shipsGame;
import java.util.ArrayList;

public class Game {
	
	private Helper helper = new Helper();
	private ArrayList<Ship> shipsList = new ArrayList<>();
	private int noOfGuesses = 0;
	
	private void setUpGame() {
		Ship one = new Ship();
		Ship two = new Ship();
		Ship three = new Ship();
		
		one.setName("Bombarder");
		two.setName("Canoe");
		three.setName("Viking");
		
		System.out.println("Your goal is to sink the three boats:");
		System.out.println("Bombarder " + "Canoe "+ "Viking");
		System.out.println("Try to sink them all in the fewest number of guesses");
		
		for(Ship s: shipsList) {
			ArrayList<String> newLocation = helper.placeShips(3);
			s.setLocationCells(newLocation);
		}
	}
	
	private void startPlaying() {
		while (!shipsList.isEmpty()) {
			String userGuess = helper.getUserInput ("Enter a guess");
			checkUserGuess(userGuess);
		}
		finishGame();
	}
	
	private void checkUserGuess (String userGuess) {
		
	}
	
	private void finishGame() {
		
	}
	
	public static void main(String[] args) {
		Game game = new Game();
		game.setUpGame();
		game.startPlaying();
	}
}
