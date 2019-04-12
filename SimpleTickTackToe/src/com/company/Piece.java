package com.company;

public class Piece {
    private char state;
    private boolean blocked;

    public Piece(char state) {
        this.state = state;
        blocked=false;

    }
    public Piece(){blocked=false;}

    public char getState() {

        return state;
    }

    public void setState(char state) {
        this.state = state;
        blocked=true;

    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    @Override
    public String toString() {
        return "Piece{" +
                "state=" + state +
                ", blocked=" + blocked +
                '}';
    }
}
