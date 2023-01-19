package no.sigvebjo;

import java.util.HashMap;

import no.sigvebjo.Pieces.Piece;

public class Board {
    public static final Vector2 BOARD_DIMENSIONS = new Vector2(8, 8);

    private HashMap<Vector2, Piece> board;

    public Piece checkPositionForPiece(Vector2 position) {
        return board.get(position);
    }

    public boolean updateBoard() {
        boolean success = false;

        return success;
    }
}
