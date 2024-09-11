package boardgame;

public class Piece {
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; //Se não colocar esse comando por padrão o Java já coloca como null
	}

	protected Board getBoard() {
		return board;
	}

}
