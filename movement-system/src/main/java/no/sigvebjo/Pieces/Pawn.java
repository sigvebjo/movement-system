package no.sigvebjo.Pieces;

import java.util.ArrayList;

import no.sigvebjo.Board;
import no.sigvebjo.Vector2;

public class Pawn extends Piece {

    public Pawn(Vector2 position) {
        super(position);
        this.validMoves = new ArrayList<Vector2>();
        this.potentialMoves = new ArrayList<Vector2>();
        this.potentialMoves.add(new Vector2(0, 2));
        this.potentialMoves.add(new Vector2(1, 1));
        this.potentialMoves.add(new Vector2(-1, 1));
    }

    @Override
    public void checkMoves() {
        
    }
}
