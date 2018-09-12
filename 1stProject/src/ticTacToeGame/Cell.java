package exercitii.ticTacToe;

public class Cell{

	private PieceType symbol = PieceType.EMPTY;
	
	public PieceType getSimbol() {
		return symbol;
	}

	public void setSimbol(PieceType simbol) {
		this.symbol = simbol;
	}
}
