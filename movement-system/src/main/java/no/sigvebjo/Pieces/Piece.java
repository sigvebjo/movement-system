package no.sigvebjo.Pieces;

import java.util.ArrayList;

import no.sigvebjo.Vector2;

/**
 * Chess piece
 */
public abstract class Piece {
    protected Vector2 position;
    protected ArrayList<MoveData> validMoves;

    public Piece(Vector2 position){
        this.position = position;
    }

    /**
     * Attempts to move the piece.
     * 
     * @param move index of move to be made
     * @return success boolean
     */
    public boolean move(int move) {
        boolean success = false;

        if (move >= 0 && move < validMoves.size()) {
            this.position = this.position.add(validMoves.get(move).getDestination());
            success = true;
        }

        return success;
    }

    /**
     * Interface method to check and select valid moves for the piece.
     */
    public void checkMoves() {}

    public Vector2 getPosition() {
        return position;
    }
}
