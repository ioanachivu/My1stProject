package exercitii.ticTacToe;

public class Board {
	
	Cell[][] cells; 
	
	public Board(Cell[][] cells) {
		this.cells = cells;
	}

	public Cell getCell(int i, int j) {
		return cells[i][j];
	}

	public void setCells(Cell[][] cells) {
		this.cells = cells;
	}
	
	public boolean lineVerification() {
		
		boolean result = true;
		
		for (int i = 0; i < 3; i++) {
			char check = cells[i][0].getSimbol();
			for (int j = 1; j < 3; j++) {
                if (cells[i][j].getSimbol() != check) {
                	result = false;
    				break;
                }
			}
			
            if (result) {
                return result;
            }
		}
		
		return result;
	}
	
}
