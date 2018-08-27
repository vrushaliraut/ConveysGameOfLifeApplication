package com.gojek.bootcamp;

public class Cell {
    private int xPoint;
    private int yPoint;
    private State state;

    public Cell(int xPoint, int yPoint) {
        this.xPoint = xPoint;
        this.yPoint = yPoint;
        this.state = State.DEAD;
    }

    public void markAlive() {
        state = State.ALIVE;
    }

    public void markDead() {
        state = State.DEAD;
    }

    public boolean isStateDead() {
        return state == State.DEAD;
    }

    public boolean isStateAlive() {
        return state == State.ALIVE;
    }
}
