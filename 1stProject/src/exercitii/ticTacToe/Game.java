package exercitii.ticTacToe;

import java.util.Scanner;

public class Game {
	
	int step = 0;
	Player player1 = new Player();
	Player player2 = new Player();
	Player currPlayer = new Player();
	
	Cell[][] cells = new Cell[][] {
		{new Cell(), new Cell(), new Cell()},
		{new Cell(), new Cell(), new Cell()},
		{new Cell(), new Cell(), new Cell()}};
		
	Board board = new Board(cells);

	public void playGame() {

		pickSimbol();
		display();
		
		while (!isGameOver(step)) {
			pickPosition(currPlayer);
			display();
			changePlayer(currPlayer);
			step++;
		}
	}
	
	// pick symbol method
	public void pickSimbol () {
		System.out.println("Player 1, pick a symbol (x or 0): ");
	    Scanner s = new Scanner(System.in);
	    
	    player1.setSimbol (s.nextLine().charAt(0));
	    if (player1.equals('x')) {
	    	player2.setSimbol('0');} 
	    else {player2.setSimbol('x');}
	    
	    currPlayer = player1;
	}
    
	// display the board method
	private void display() {
		System.out.println("    0 | 1 | 2 |");
		System.out.println("---------------");
		for (int i = 0; i <= 2; i++) {
			System.out.print(i + " | ");
			for (int j = 0; j <= 2; j++) {
				System.out.print(board.getCell(i, j).getSimbol() + " | ");
			}
			System.out.println(); 
			System.out.println("---------------");
		}
		}
	
	// pick position method
	public void pickPosition (Player currPlayer) {
		System.out.println("Row for player with symbol " + currPlayer.getSimbol() + " :");
		Scanner s = new Scanner(System.in);
		int row = s.nextInt();
		
		System.out.println("Column for player with symbol " + currPlayer.getSimbol() + " :");
		int column = s.nextInt();
		
		Cell c = board.getCell(row, column);
		
		if (c.getSimbol() == 'x' || c.getSimbol() == '0') {
			System.out.println("Position is already taken, try again...");
		} else {
			c.setSimbol(currPlayer.getSimbol());
		}
	}

	// change players
	public void changePlayer(Player currPlayer) {

		if (currPlayer.getSimbol() == 'x') {
			currPlayer.setSimbol('0');
		} else {
			currPlayer.setSimbol('x');
		}
	}
	
	
    public boolean isGameOver(int step) {
    
        if (step < 5) {
            return false;
        }
        
        // line verification
        boolean resultLineVerification = board.lineVerification();
        
        if(resultLineVerification == true) {
        	return true;
        }
        
        // afisare cine a castigat
        
        // verificare coloana
        
        // verificare diagonala
        
        // 
        
        return false; // return temporrar
        
//        // verifica coloane
//        result = true;
//        for (int j = 0; j < 3; j++) {
//            char check = game[0][j];
//            for (int i = 1; i < 3; i++) {
//                if (game[i][j] != check) {
//                    result = false;
//                    break;
//                }
//            }
//            if (result) {
//                return result;
//            }
//        }
//        // verifica diagPrinc
//        result = true;
//        char check = game[0][0];
//        for (int i = 1; i < 3; i++) {
//            if (game[i][i] != check) {
//                result = false;
//                break;
//            }
//        }
//        if (result) {
//            return result;
//        }
//        // verifica diagSec
//        result = true;
//        check = game[0][2];
//        for (int i = 1; i < 3; i++) {
//            if (game[i][2 - i] != check) {
//                result = false;
//                break;
//            }
//        }
//        if (result) {
//            return result;
//        }
//        
//        if (step == 9) {
//        	winningPlayer = 'N';
//        	return true;
//        }
        
    }


	
}
