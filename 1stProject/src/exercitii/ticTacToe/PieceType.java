package exercitii.ticTacToe;

public enum PieceType {

	CROSS("x"), ZERO("0"), EMPTY(" ");

	private final String text;

	private PieceType(final String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return text;
	}
}
