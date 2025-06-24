package problem2;

public class Board {
	 private Piece[][] board = new Piece[8][8];

	    public void placePiece(Piece p, Position pos) {
	        if (pos.isValid()) {
	            board[pos.row][pos.col] = p;
	        }
	    }

	    public void movePiece(Position from, Position to) {
	        Piece p = board[from.row][from.col];
	        if (p != null && p.isLegalMove(to)) {
	            System.out.println("Moving " + p.getSymbol() + " from " + from.row + "," + from.col + " to " + to.row + "," + to.col);
	            board[to.row][to.col] = p;
	            board[from.row][from.col] = null;
	            p.move(to);
	        } else {
	            System.out.println("Illegal move!");
	        }
	    }

	    public void printBoard() {
	        for (int i = 0; i < 8; i++) {
	            for (int j = 0; j < 8; j++) {
	                Piece p = board[i][j];
	                System.out.print((p == null ? "." : p.getSymbol()) + " ");
	            }
	            System.out.println();
	        }
	        System.out.println();
	    }

}
