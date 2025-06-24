package problem2;

public class King extends Piece{
	public King(Position a) {
        super(a);
    }

    public boolean isLegalMove(Position b) {
        return Math.abs(a.row - b.row) <= 1 && Math.abs(a.col - b.col) <= 1;
    }

    public char getSymbol() {
        return 'K';
    }
	

}
