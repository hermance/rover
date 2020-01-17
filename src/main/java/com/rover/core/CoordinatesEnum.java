package com.rover.core;
public enum CoordinatesEnum {
    NORTH('N'), SOUTH('S'), EAST('E'), WEST('W');

    CoordinatesEnum(char coordinate){
        this.coordinate=coordinate;
    }
    private final char coordinate;
}