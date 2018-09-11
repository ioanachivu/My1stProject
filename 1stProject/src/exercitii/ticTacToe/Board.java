package exercitii.ticTacToe;

public class Board {
	
	Cell[][] cells; 
	
	GameState gs = GameState.IN_PROGRESS;
	
	public Board(Cell[][] cells) {
		this.cells = cells;
	}

	public Cell getCell(int i, int j) {
		return cells[i][j];
	}

	public void setCells(Cell[][] cells) {
		this.cells = cells;
	}
	
	// display the board method
	public void display() {
		System.out.println("    0 | 1 | 2 |");
		System.out.println("---------------");
		for (int i = 0; i <= 2; i++) {
			System.out.print(i + " | ");
			for (int j = 0; j <= 2; j++) {
				System.out.print(getCell(i, j).getSimbol() + " | ");
			}
			System.out.println();
			System.out.println("---------------");
		}
	}
	
	// line verification method
	public boolean isGameOverOnLine() {
		boolean result = true;
		for (int i = 0; i < 3; i++) {
			PieceType check = cells[i][0].getSimbol();
			for (int j = 1; j < 3; j++) {
                if (cells[i][j].getSimbol() != check) {
                	result = false;
    				break;
                }
			}
			if (!result) {
				if (check.equals(PieceType.CROSS)) {
					gs = GameState.X_WIN;
				} else {
					gs = GameState.X_LOSE;
				}
			}
		}
		return result;
	}
	
	// column verification method
	public boolean isGameOverOnColumn() {
		boolean result = true;
		for (int j = 0; j < 3; j++) {
			PieceType check = cells[0][j].getSimbol();
			for (int i = 1; i < 3; i++) {
				if (cells[i][j].getSimbol() != check) {
					result = false;
					break;
				}
			}
			if (!result) {
				if (check.equals(PieceType.CROSS)) {
					gs = GameState.X_WIN;
				} else {
					gs = GameState.X_LOSE;
				}
			}
		}
		return result;
	}
	
	// diagonal1 verification method
	public boolean isGameOverOnDiagonal1() {
		boolean result = true;
		PieceType check = cells[0][0].getSimbol();
		for (int i = 1; i < 3; i++) {
			if (cells[i][i].getSimbol() != check) {
				result = false;
					break;
			}
			if (!result) {
				if (check.equals(PieceType.CROSS)) {
					gs = GameState.X_WIN;
				} else {
					gs = GameState.X_LOSE;
				}
			}
		}
		return result;
	}
	
	// diagonal2 verification method
	public boolean isGameOverOnDiagonal2() {
		boolean result = true;
		PieceType check = cells[0][2].getSimbol();
        for (int i = 1; i < 3; i++) {
            if (cells[i][2 - i].getSimbol() != check) {
            	result = false;
                break;
            }
			if (!result) {
				if (check.equals(PieceType.CROSS)) {
					gs = GameState.X_WIN;
				} else {
					gs = GameState.X_LOSE;
				}
			}
        }
		return result;
	}
}
