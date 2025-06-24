package problem2;
import java.util.*;

public class ChessTest {
	
	    public static void main(String[] args) {
	    	
	            Scanner input = new Scanner(System.in);
	            Board board = new Board();

	            
	            while (true) {
	                System.out.println("\n1. Add piece");
	                System.out.println("2. Move piece");
	                System.out.println("3. Print board");
	                System.out.println("0. Exit");
	                System.out.print("Enter option: ");
	                int option = input.nextInt();

	                if (option == 0) {
	                    System.out.println("Goodbye!");
	                    break;
	                }

	                if (option == 1) {
	                    System.out.println("Select piece to add:");
	                    System.out.println("1. Rook");
	                    System.out.println("2. Bishop");
	                    System.out.println("3. Knight");
	                    System.out.println("4. Queen");
	                    System.out.println("5. King");
	                    System.out.println("6. Pawn");
	                    System.out.print("Enter piece number: ");
	                    int pieceChoice = input.nextInt();

	                    System.out.print("Enter position (row col): ");
	                    int row = input.nextInt();
	                    int col = input.nextInt();

	                    Piece piece = null;
	                    Position pos = new Position(row, col);

	                    if (pieceChoice == 1) piece = new Rook(pos);
	                    else if (pieceChoice == 2) piece = new Bishop(pos);
	                    else if (pieceChoice == 3) piece = new Knight(pos);
	                    else if (pieceChoice == 4) piece = new Queen(pos);
	                    else if (pieceChoice == 5) piece = new King(pos);
	                    else if (pieceChoice == 6) {
	                        System.out.print("Is white? (true/false): ");
	                        boolean isWhite = input.nextBoolean();
	                        piece = new Pawn(pos, isWhite);
	                    }

	                    if (piece != null) {
	                        board.placePiece(piece, pos);
	                        System.out.println(piece.getSymbol() + " added at (" + row + "," + col + ")");
	                    } else {
	                        System.out.println("Invalid piece choice.");
	                    }
	                }

	                else if (option == 2) {
	                    System.out.print("Enter FROM position (row col): ");
	                    int fromRow = input.nextInt();
	                    int fromCol = input.nextInt();

	                    System.out.print("Enter TO position (row col): ");
	                    int toRow = input.nextInt();
	                    int toCol = input.nextInt();

	                    board.movePiece(new Position(fromRow, fromCol), new Position(toRow, toCol));
	                }

	                else if (option == 3) {
	                    board.printBoard();
	                }

	                else {
	                    System.out.println("Invalid option.");
	                }
	            }

	            input.close();
	            }

}
