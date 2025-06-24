package problem2;

public class Knight extends Piece{
	public Knight(Position a) {
        super(a);
    }

    public boolean isLegalMove(Position b) {
        int dx = Math.abs(a.row - b.row);
        int dy = Math.abs(a.col - b.col);
        return (dx == 2 && dy == 1) || (dx == 1 && dy == 2);
    }

    public char getSymbol() {
        return 'N';
    }

}
