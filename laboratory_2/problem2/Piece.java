package problem2;

public abstract class Piece {
	protected Position a;

    public Piece(Position a) {
        this.a = a;
    }

    public abstract boolean isLegalMove(Position b);
    
    public void move(Position b) {
        if (isLegalMove(b)) {
            a = b;
        }
    }

    public abstract char getSymbol();

}
