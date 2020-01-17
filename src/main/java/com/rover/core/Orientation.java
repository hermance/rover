package com.rover.core;

public class Orientation{

    public static String changeOrientation(String oldPosition, String newOrientations){
        String newPosition = oldPosition;
        char[] array = newOrientations.toCharArray();
        for(char orientation : array){
            if(orientation == 'L'){
                switch(newPosition){
                    case "N":
                        newPosition= "W" ;
                        break;
                    case "S":
                        newPosition= "E" ;
                        break;
                    case "E":
                        newPosition= "N" ;
                        break;
                    case "W":
                        newPosition= "S" ;
                        break;
                }
            }else if (orientation == 'R'){
                switch(newPosition){
                    case "N":
                        newPosition= "E" ;
                        break;
                    case "S":
                        newPosition= "W" ;
                        break;
                    case "E":
                        newPosition= "S" ;
                        break;
                    case "W":
                        newPosition= "N" ;
                        break;
                }
            }
        }
        return newPosition;
    }
}