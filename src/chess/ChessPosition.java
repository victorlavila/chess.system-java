package chess;

import boardgame.Position;

public class ChessPosition {
	
	private char coluum;
	private int row;
	
	public ChessPosition(char coluum, int row) {
		if(row < 1 || row > 8 || coluum < 'a' || coluum > 'h') {
			throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8.");
		}
		this.coluum = coluum;
		this.row = row;
	}

	public char getColuum() {
		return coluum;
	}


	public int getRow() {
		return row;
	}
	
	protected Position toPosition() {
		return new Position(8 - row, coluum - 'a');
	}
	
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a' - position.getColumn()), 8 - position.getRow());
	}
	
	@Override
	public String toString() {
		return "" + coluum + row;
	}

}
