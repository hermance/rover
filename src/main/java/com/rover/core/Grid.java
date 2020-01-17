package com.rover.core;

public class Grid {
    private int limX;
    private int limY;
    public Grid(int limX, int limY){
        this.limX = limX;
        this.limY = limY;
    }

    public int getLimX() {
        return limX;
    }

    public void setLimX(int limX) {
        this.limX = limX;
    }

    public int getLimY() {
        return limY;
    }

    public void setLimY(int limY) {
        this.limY = limY;
    }
}