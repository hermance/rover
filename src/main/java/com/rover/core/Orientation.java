package com.rover.core;

public class Orientation{

    public static Position changeOrientationOrPosition(Position oldPosition, String newOrientations){
        Position position = oldPosition;

        char[] array = newOrientations.toCharArray();
        for(char change : array){
            switch(oldPosition.getOrientation()){
                case "N":
                    if(change == 'L'){
                        position.setOrientation("W") ;
                    }else if (change == 'R'){
                        position.setOrientation("E") ;
                    }else if(change=='F'){
                        position.setPositionY(position.getPositionY()+1);
                    }else if(change=='B'){
                        position.setPositionY(position.getPositionY()-1);
                    }
                    break;
                case "S":
                    if(change == 'L'){
                        position.setOrientation("E") ;
                    }else if (change == 'R'){
                        position.setOrientation("W") ;
                    }else if(change=='F'){
                        position.setPositionY(position.getPositionY()-1);
                    }else if(change=='B'){
                        position.setPositionY(position.getPositionY()+1);
                    }
                    break;
                case "E":
                    if(change == 'L'){
                        position.setOrientation("N") ;
                    }else if (change == 'R'){
                        position.setOrientation("S") ;
                    }else if(change=='F'){
                        position.setPositionX(position.getPositionX()+1);
                    }else if(change=='B'){
                        position.setPositionX(position.getPositionX()-1);
                    }
                    break;
                case "W":
                    if(change == 'L'){
                        position.setOrientation("S") ;
                    }else if (change == 'R'){
                        position.setOrientation("N") ;
                    }else if(change=='F'){
                        position.setPositionX(position.getPositionX()-1);
                    }else if(change=='B'){
                        position.setPositionX(position.getPositionX()+1);
                    }
                    break;
            }
        }
        return position;
    }
}