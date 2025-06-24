package problem2;

public class Queen extends Piece{
	public Queen(Position a) {
        super(a);
    }

    public boolean isLegalMove(Position b) {
        return (a.row == b.row || a.col == b.col || 
                Math.abs(a.row - b.row) == Math.abs(a.col - b.col));
    }

    public char getSymbol() {
        return 'Q';
    }

}
