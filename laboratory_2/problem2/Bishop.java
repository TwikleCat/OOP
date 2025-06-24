package problem2;

public class Bishop extends Piece{
	public Bishop(Position a) {
        super(a);
    }

    public boolean isLegalMove(Position b) {
        return Math.abs(a.row - b.row) == Math.abs(a.col - b.col);
    }

    public char getSymbol() {
        return 'B';
    }

}
