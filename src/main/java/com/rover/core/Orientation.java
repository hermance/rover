package com.rover.core;

public class Orientation{

    public static String changeOrientation(String oldPosition, String newOrientations){
        String newPosition = oldPosition;
        String[] array = newOrientations.split("");
        for(int i = 0; i < array.length; i++){
            String orientation = array[i];
            if(orientation == "L"){
                switch(newPosition){
                    case "N":
                        newPosition= "W" ;
                    case "S":
                        newPosition= "E" ;
                    case "E":
                        newPosition= "N" ;
                    case "W":
                        newPosition= "S" ;
                }
            }else if (orientation == "R"){
                switch(newPosition){
                    case "N":
                        newPosition= "E" ;
                    case "S":
                        newPosition= "W" ;
                    case "E":
                        newPosition= "S" ;
                    case "W":
                        newPosition= "N" ;
                }
            }
        }
        return newPosition;
    }
}