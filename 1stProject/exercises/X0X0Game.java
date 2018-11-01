package exercises;

import java.util.Scanner;

public class X0X0Game {
	
	char winningPlayer = 'N';
    static char[][] game = new char[][] {
                                {' ' ,' ' ,' '}, 
                                {' ' ,' ' ,' '}, 
                                {' ' ,' ' ,' '} };
	    
    public boolean pickPos(char pos) {
        System.out.println("Position for " + pos + " :");
		try (Scanner s = new Scanner(System.in)) {

			int position = s.nextInt();

			try {
				if (game[position / 10][position % 10] == 'x' 
						|| game[position / 10][position % 10] == '0') {
					System.out.println("Position is already taken, try again...");
					return false;
				} else {
					game[position / 10][position % 10] = pos;
					return true;
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Wrong position entered");
				return false;
			}
		}
    }
   
    public void display(char[][] game) {
        System.out.println("    0 | 1 | 2 |");
		System.out.println("---------------");
		for (int i=0; i<= 2; i++) {
			System.out.print(i + " | ");
			for (int j= 0; j<=2; j++) {
				System.out.print(game[i][j] + " | ");
			} System.out.println();
			  System.out.println("---------------");	
		}
    }
	
    public void displayResult(char winningPlayer, int step) {
    	if (step == 9 && winningPlayer=='N') {
            System.out.println("It's a tie");
        } else {
        	System.out.println("Congratulations!" +winningPlayer+ " has won the game"); 
        }
         
    }
	
    public boolean isGameOver(int step) {
        if (step < 5) {
            return false;
        }
        // verifica linii
        boolean result = true;
        for (int i = 0; i < 3; i++) {
            char check = game[i][0];
            for (int j = 1; j < 3; j++) {
                if (game[i][j] != check) {
                    result = false;
                    break;
                }
            }
            if (result) {
                return result;
            }
        }
        // verifica coloane
        result = true;
        for (int j = 0; j < 3; j++) {
            char check = game[0][j];
            for (int i = 1; i < 3; i++) {
                if (game[i][j] != check) {
                    result = false;
                    break;
                }
            }
            if (result) {
                return result;
            }
        }
        // verifica diagPrinc
        result = true;
        char check = game[0][0];
        for (int i = 1; i < 3; i++) {
            if (game[i][i] != check) {
                result = false;
                break;
            }
        }
        if (result) {
            return result;
        }
        // verifica diagSec
        result = true;
        check = game[0][2];
        for (int i = 1; i < 3; i++) {
            if (game[i][2 - i] != check) {
                result = false;
                break;
            }
        }
        if (result) {
            return result;
        }
        
        if (step == 9) {
        	winningPlayer = 'N';
        	return true;
        }
        
        return false;
        
    }
    
    public void start() {
        char p1, p2;
        
        // picking the simbols
        System.out.println("Player 1, pick a symbol (x or 0): ");
        Scanner s = new Scanner(System.in);
        p1 = s.nextLine().charAt(0);
        if (p1 == 'x') {p2 = '0';} 
        else {p2 = 'x'; }
        
        int step = 0;
        char currPlayer = p1;
        
        
        display(game);
        
        while (!isGameOver(step)) {
           
           while (!pickPos(currPlayer)) {
                pickPos(currPlayer);
            }
            
            display(game);
            
            if (currPlayer == p1) {
                winningPlayer = currPlayer;
                currPlayer = p2;
                step++;
            } else {
                winningPlayer = currPlayer;
                currPlayer = p1;
                step++;
            }
        } 
        
    	displayResult(winningPlayer, step);

    }  
    // MAIN       
    public static void main(String args[]) {
        new X0X0Game().start();
    	char[][] game = {{'0','0','x'}, {'x','x','0'}, {'0','0','x'}};
//    	X0X0Game.game = game;  
//    	new X0X0Game().isGameOver(9);
    	}
}