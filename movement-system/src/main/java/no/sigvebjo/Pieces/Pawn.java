package no.sigvebjo.Pieces;

import java.util.ArrayList;

import no.sigvebjo.Board;
import no.sigvebjo.Vector2;

public class Pawn extends Piece {

    public Pawn(Vector2 position) {
        super(position);
        this.validMoves = new ArrayList<MoveData>();
    }

    @Override
    public void checkMoves() {
        Board board = Board.getInstance();

        Vector2 targetRight = position.add(new Vector2(1, 1));
        if (board.checkPositionForPiece(targetRight) != null) {
            validMoves.add(new MoveData(targetRight, false));
        }
    }
}
