package exercitii.ticTacToe;

import java.util.Scanner;

public class Game {
	
	int step = 0;
	Player player1 = new Player();
	Player player2 = new Player();
	Player currPlayer;	
	
	Cell[][] cells = new Cell[][] {
		{new Cell(), new Cell(), new Cell()},
		{new Cell(), new Cell(), new Cell()},
		{new Cell(), new Cell(), new Cell()}};
		
	Board board = new Board(cells);

	public void playGame() {

		pickSimbol();
		board.display();
		
		while (!isGameOver(step)) {	
			pickPosition(currPlayer);
			board.display();
			changePlayer(currPlayer);
			step++;
		}
		displayResult(board.gs);
	}
	
	// pick symbol method
	public void pickSimbol() {
		int i = 0;
		do {
			System.out.println("Player 1, pick a symbol: " + PieceType.CROSS + " or " + PieceType.ZERO);
			Scanner s = new Scanner(System.in);
			char type = s.next().charAt(0);

			if (type == 'x' || type == '0') {

				switch (type) {
				case 'x':
					player1.setSimbol(PieceType.CROSS);
					break;
				case '0':
					player1.setSimbol(PieceType.ZERO);
					break;
				}

				if (player1.getSimbol().equals(PieceType.CROSS)) {
					player2.setSimbol(PieceType.ZERO);
				} else {
					player2.setSimbol(PieceType.CROSS);
				}

				currPlayer = player1;
				i++;

			} else
				System.out.println("Wrong symbol entered, try again");
		} while (i == 0);

	}
	
	// pick position method
	public void pickPosition(Player currPlayer) {
		int m = 0;

		do {
			System.out.println("Row for player with symbol " + currPlayer.getSimbol() + " :");
			Scanner s = new Scanner(System.in);
			int row = s.nextInt();

			System.out.println("Column for player with symbol " + currPlayer.getSimbol() + " :");
			int column = s.nextInt();

			if ((row == 0 || row == 1 || row == 2) &&
					(column == 0 || column == 1 || column == 2)) {
				Cell c = board.getCell(row, column);

				if (c.getSimbol().equals(PieceType.CROSS) || c.getSimbol().equals(PieceType.ZERO)) {
					System.out.println("Position is already taken, try again...");
				} else {
					c.setSimbol(currPlayer.getSimbol());
					m++;
				}
			} else {
				System.out.println("Wrong position entered, please try again");
				break;
			}
		} while (m == 0);

	}

	
	// change players
	public void changePlayer(Player currPlayer) {

		if (currPlayer.getSimbol().equals(PieceType.CROSS)) {
			currPlayer.setSimbol(PieceType.ZERO);
		} else {
			currPlayer.setSimbol(PieceType.CROSS);
		}
	}
	
	// display result method
	public void displayResult(GameState gs) {
		
		switch (board.gs) {
		case X_WIN:
			System.out.println(" X won!");;
			break;
		case X_LOSE:
			System.out.println(" 0 won!");
			break;
		case TIE:
			System.out.println("It's a tie!");
			break;
		}
    }
	
    public boolean isGameOver(int step) {
		if (step < 5) {
			return false;
		}

		if (board.isGameOverOnLine()|| 
			board.isGameOverOnColumn() || 
			board.isGameOverOnDiagonal1() || 
			board.isGameOverOnDiagonal2()) {
			return true;
		}

		if (step == 9) {
			board.gs = GameState.TIE;
			return true;
		}

		return false;
    }	
}
