package no.sigvebjo.Pieces;

import no.sigvebjo.Vector2;

public class MoveData {
    private Vector2 destination;
    private boolean capture;

    public MoveData(int x, int y, boolean capture){
        this.destination = new Vector2(x, y);
        this.capture = capture;
    }

    public MoveData(Vector2 destination, boolean capture){
        this.destination = destination;
        this.capture = capture;
    }

    public Vector2 getDestination() {
        return destination;
    }

    public boolean isCapture() {
        return capture;
    }    
}
