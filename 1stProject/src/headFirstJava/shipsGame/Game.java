package headFirstJava.shipsGame;
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
		noOfGuesses++;
		String result = "miss";
		
		for (Ship s: shipsList) {
			result = s.checkYourself(userGuess);
			if(result.equals("hit")) {
				break;
			}
			if (result.equals("kill")) {
				shipsList.remove(s);
				break;
			}
		}
		System.out.println(result);
	}
	
	private void finishGame() {
		System.out.println("All ships are under water");
		if (noOfGuesses<=18) {
			System.out.println("It only took you "+noOfGuesses+" guesses");
		} else {
			System.out.println("Took you too long "+noOfGuesses+ " guesses");
		}
	}
	
	public static void main(String[] args) {
		Game game = new Game();
		game.setUpGame();
		game.startPlaying();
	}
}
