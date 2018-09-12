package exercises;
import java.util.Scanner;

public class App {
	
	static char[][] game = new char[][] {
					{' ' ,' ' ,' '}, {' ' , ' ' ,' '}, {' ' ,' ' ,' '}
		            };
	
	public void game() {
		char p1,p2;
		
		p1 = pickP1Symbol();
		if (p1 == 'x') {
			p2 = '0';
		}
		else p2 = 'x';
		char currentPlayer = p1;
		int step = 0;
		char winningPlayer = 'N';
		while (!isGameOver(step)) {
			pickPos(currentPlayer);
			display(game);
			if (currentPlayer == p1 ) {
				winningPlayer = currentPlayer;
				currentPlayer = p2;
				step++;
			}
			else {
				winningPlayer = currentPlayer;
				currentPlayer = p1;
			}
		}
		displayResult(winningPlayer);
	}
	
	public char pickP1Symbol() {
		System.out.println("Player 1 pick symbol : ");
		Scanner s = new Scanner(System.in);
		return s.nextLine().charAt(0);
	}
	
	public void pickPos(char pos) {
		System.out.println("Position for " + pos + " :");
		Scanner s = new Scanner(System.in);
		int position = s.nextInt();
		game[position / 10][position % 10] = pos;
	}
	
	public void display(char game[][]) {
		System.out.println(game);
	}
	
	public void displayResult(char player) {
		if(player == 'x') {
			System.out.println("The x player has won the game");
		}
		else {
			System.out.println("The 0 player has won the game");
		}
	}
	
	public boolean isGameOver(int step) {
		if(step < 3) {
			return false;
		}
		// verifica linii
		boolean result = true;
		for(int i = 0 ; i < 3 ; i++) {
			char check = game[i][0];
			for(int j = 1 ; j < 3 ; j++) {
				if(game[i][j] != check) {
					result = false;
					break;
				}
			}
			if(result) {
				return result;
			}
			
		}
		// verifica coloane
		result = true;
		for(int j = 0 ; j < 3 ; j++) {
			char check = game[0][j];
			for(int i = 1 ; i < 3 ; i++) {
				if(game[i][j] != check) {
					result = false;
					break;
				}
			}
			if(result) {
				return result;
			}
			
		}
		// verifica diagPrinc
		result = true;
		char check = game[0][0];
		for(int i = 1 ; i < 3 ; i++) {
			if(game[i][i] != check) {
				result = false;
				break;
			}
		}
		if(result) {
			return result;
		}
		// verifica diagSec
		result = true;
		check = game[0][2];
		for(int i = 1 ; i < 3 ; i++) {
			if(game[i][2-i] != check) {
				result = false;
				break;
			}
		}
		if(result) {
			return result;
		}
		return result;
		
	}
	
	
	public static void main(String args[]) {
		new App().game();
	}
	
	}
		

