package no.sigvebjo;

import java.util.HashMap;

import no.sigvebjo.Pieces.Piece;

public class Board {
    public static final Vector2 BOARD_DIMENSIONS = new Vector2(8, 8);

    /** Singleton behaviour */
    private static Board instance = null;

    public static Board getInstance() {
        if (instance == null) {
            instance = new Board();
        }

        return instance;
    }
    /** ** ** ** ** ** ** **/

    private HashMap<Vector2, Piece> board;

    private Board() {
        board = new HashMap<Vector2, Piece>();
    }

    public Piece checkPositionForPiece(Vector2 position) {
        return board.get(position);
    }

    public boolean updateBoard() {
        boolean success = false;

        HashMap<Vector2, Piece> updatedBoard = new HashMap<Vector2, Piece>();

        for (Vector2 key : board.keySet()) {
            Piece tempPiece = board.get(key);
            updatedBoard.put(tempPiece.getPosition(), tempPiece);
        }

        return success;
    }
}
