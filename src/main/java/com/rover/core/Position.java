package com.rover.core;

public class Position{
    private int positionX;
    private int positionY;
    private String orientation;

    public Position(){

    }
    public Position(int positionX, int positionY, String orientation){
        this.orientation = orientation;
        this.positionY = positionY;
        this.positionX = positionX;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }
}