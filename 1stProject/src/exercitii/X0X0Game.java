package exercitii;

import java.util.Scanner;

//	Write a game of X and 0 in the console (optional).
//	Displaying will be done in text mode.
//	It requires the first player to choose a symbol, then gives the player the opportunity to put the symbol in a pen, 
//	after which the two player will move and so on until the game ends.

public class X0X0Game {
	
	public static boolean isOver() {
		String[][] square = new String[3][3];
		// verificare linii
		if (square[0][0]==square[0][1] && square[0][0]==square[0][2]) return false;
		if (square[1][0]==square[1][1] && square[1][0]==square[1][2]) return false;
		if (square[2][0]==square[2][1] && square[2][0]==square[2][2]) return false;
		// verificare coloane
		if (square[0][0]==square[1][0] && square[0][0]==square[2][0]) return false;
		if (square[0][1]==square[1][1] && square[0][1]==square[2][1]) return false;
		if (square[0][2]==square[1][2] && square[0][2]==square[2][2]) return false;
		// verificare diagonale	
		if (square[0][0]==square[1][1] && square[0][0]==square[2][1]) return false;
		if (square[0][2]==square[1][1] && square[0][2]==square[2][0]) return false;
		
		return true;
		}
	
	public static void showGame(String[][] s) {
		System.out.println("    a | b | c |");
		System.out.println("---------------");
		for (int i=0; i<= 2; i++) {
			System.out.print(i + " | ");
			for (int j= 0; j<=2; j++) {
				System.out.print(s[i][j] + " | ");
			} System.out.println();
			  System.out.println("---------------");	
		}
	}

	public static void player1Turn () {

	}
	
	public static void player2Turn () {
		
	}
	
	
	public static void main(String[] args) {
		int line, column;
		String[][] square = new String[3][3];
		for (int i=0; i<= 2; i++) {
			for (int j= 0; j<=2; j++) 
				square[i][j] = " ";
		}
		
		// picking the signs
		Scanner input = new Scanner(System.in);
		System.out.println("Player 1, pick a sign: (x or 0)");
		String sign1 = input.nextLine();
		String sign2;
		if (sign1.equals("x")) { 
			sign2="0";
			System.out.println("Player 2 is playing with: 0");
		} else {
			sign2="x";
			System.out.println("Player 2 is playing with: x");
		}
		
		showGame(square);
		
	
		// player 1
		System.out.println("Player 1, please insert the line:");
		line = input.nextInt();

		System.out.println("Player 1, please insert the column:");
		String s = input.next();

		if (s.equals("a")) {
			column = 0;
		} else {
			if (s.equals("b")) {
				column = 1;
			} else
				column = 2;
		}

		square[line][column] = sign1;
		showGame(square);

		// player 2
		System.out.println("Player 2, please insert the line:");
		line = input.nextInt();

		System.out.println("Player 2, please insert the column:");
		s = input.next();

		if (s.equals("a")) {
			column = 0;
		} else {
			if (s.equals("b")) {
				column = 1;
			} else
				column = 2;
		}

		square[line][column] = sign2;
		showGame(square);
		
		// player 1
		System.out.println("Player 1, please insert the line:");
		line = input.nextInt();

		System.out.println("Player 1, please insert the column:");
		s = input.next();

		if (s.equals("a")) {
			column = 0;
		} else {
			if (s.equals("b")) {
				column = 1;
			} else
				column = 2;
		}

		square[line][column] = sign1;
		showGame(square);

		// player 2
		System.out.println("Player 2, please insert the line:");
		line = input.nextInt();

		System.out.println("Player 2, please insert the column:");
		s = input.next();

		if (s.equals("a")) {
			column = 0;
		} else {
			if (s.equals("b")) {
				column = 1;
			} else
				column = 2;
		}

		square[line][column] = sign2;
		showGame(square);
		
		// player 1
		System.out.println("Player 1, please insert the line:");
		line = input.nextInt();

		System.out.println("Player 1, please insert the column:");
		s = input.next();

		if (s.equals("a")) {
			column = 0;
		} else {
			if (s.equals("b")) {
				column = 1;
			} else
				column = 2;
		}

		square[line][column] = sign1;
		showGame(square);
		
		// verify if it's over
		if (isOver()==false) {
			System.out.println("Game over, player 1 won!");
			System.exit(0);
		}
		
		// player 2
		System.out.println("Player 2, please insert the line:");
		line = input.nextInt();

		System.out.println("Player 2, please insert the column:");
		s = input.next();

		if (s.equals("a")) {
			column = 0;
		} else {
			if (s.equals("b")) {
				column = 1;
			} else
				column = 2;
		}

		square[line][column] = sign2;
		showGame(square);
		
		// verify if it's over
		if (isOver()==false) {
			System.out.println("Game over, player 2 won!");
			System.exit(0);
		}
	}
}