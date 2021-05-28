public class CastlingLocationChecker {

    /**
     * Checks if there are any potential castling opportunities based on position of rook and king.
     * It is also assumed there is a Piece class that stores the color and type of piece.
     * Still seems to have a bit more repetition than I'd like.
     *
     * @param board - a chess board with functions to get the pieces at given coordinates
     * @return - a boolean representing if any potential castle was found.
     */
    public static boolean castlingOpportunityExists(ChessBoard board){

        // Check for black castling potential
        Piece peiceInKingPosition = board.getPieceAt("E",8);
        Piece maybeRook = board.getPieceAt("A",8);
        if (castlingPotential(peiceInKingPosition, maybeRook, "black")) return true;

        maybeRook = board.getPieceAt("H",8);
        if (castlingPotential(peiceInKingPosition, maybeRook, "black")) return true;

        // Check for white castling potential
        peiceInKingPosition = board.getPieceAt("E",1);
        maybeRook = board.getPieceAt("A",1);
        if (castlingPotential(peiceInKingPosition, maybeRook, "white")) return true;
        maybeRook = board.getPieceAt("H",1);
        if (castlingPotential(peiceInKingPosition, maybeRook, "white")) return true;

        // If neither then
        return false;
    }

    public static boolean castlingPotential(Piece king, Piece rook, String color){
        return rightPiece(peiceInKingPosition, color, "king") && rightPiece(maybeRook, color, "rook");
    }

    public static boolean rightPiece(Piece piece, String desiredColor, String desiredType){
        return piece.getColor().equals(desiredColor) && peice.getType().equals(desiredType);
    }
}
