package problem2;

public class Rook extends Piece {
	public Rook(Position a) {
        super(a);
    }

    public boolean isLegalMove(Position b) {
        return a.row == b.row || a.col == b.col;
    }

    public char getSymbol() {
        return 'R';
    }

}
