package problem2;

public class Pawn extends Piece{
	   private boolean isWhite;

	    public Pawn(Position a, boolean isWhite) {
	        super(a);
	        this.isWhite = isWhite;
	    }

	    public boolean isLegalMove(Position b) {
	        int direction = isWhite ? -1 : 1;
	        return (a.col == b.col && b.row - a.row == direction);
	    }

	    public char getSymbol() {
	        return isWhite ? 'P' : 'p';
	    }

}
