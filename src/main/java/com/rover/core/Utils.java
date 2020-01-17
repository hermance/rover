package com.rover.core;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Utils{

    public static Position changeOrientationOrPosition(Position oldPosition, Grid grid, String newOrientations, List<Obstacle> obstacles){
        Position position = oldPosition;
        // todo check for obstacles
        char[] array = newOrientations.toCharArray();
        for(char change : array){
            Position copyOldPosition = new Position(position.getPositionX(), position.getPositionY(), position.getOrientation());
            switch(oldPosition.getOrientation()){
                case "N":
                    if(change == 'L'){
                        position.setOrientation("W") ;
                    }else if (change == 'R'){
                        position.setOrientation("E") ;
                    }else if(change=='F'){
                        if(position.getPositionY()+1 >= grid.getLimY()){
                            // si on essaie d'aller au dela de la limite, on revient à 0
                            position.setPositionY(0);
                        }else{
                            position.setPositionY(position.getPositionY()+1);
                        }
                    }else if(change=='B'){
                        if(position.getPositionY()-1 <= 0){
                            // on ne peut plus aller en négatif
                            position.setPositionY(0);
                        }else{
                            position.setPositionY(position.getPositionY()-1);
                        }
                    }
                    break;
                case "S":
                    if(change == 'L'){
                        position.setOrientation("E") ;
                    }else if (change == 'R'){
                        position.setOrientation("W") ;
                    }else if(change=='F'){
                        if(position.getPositionY()-1 <= 0){
                            // on ne peut plus aller en négatif
                            position.setPositionY(0);
                        }else{
                            position.setPositionY(position.getPositionY()-1);
                        }
                    }else if(change=='B'){
                        if(position.getPositionY()+1 >= grid.getLimY()){
                            position.setPositionY(0);
                        }else{
                            position.setPositionY(position.getPositionY()+1);
                        }
                    }
                    break;
                case "E":
                    if(change == 'L'){
                        position.setOrientation("N") ;
                    }else if (change == 'R'){
                        position.setOrientation("S") ;
                    }else if(change=='F'){
                        if(position.getPositionX()+1 >= grid.getLimX()){
                            position.setPositionX(0);
                        }else{
                            position.setPositionX(position.getPositionX()+1);
                        }
                    }else if(change=='B'){
                        if(position.getPositionX()-1 <= 0){
                            // on ne peut plus aller en négatif
                            position.setPositionX(0);
                        }else{
                            position.setPositionX(position.getPositionX()-1);
                        }
                    }
                    break;
                case "W":
                    if(change == 'L'){
                        position.setOrientation("S") ;
                    }else if (change == 'R'){
                        position.setOrientation("N") ;
                    }else if(change=='F'){
                        if(position.getPositionX()-1 <= 0){
                            // on ne peut plus aller en négatif
                            position.setPositionX(0);
                        }else{
                            position.setPositionX(position.getPositionX()-1);
                        }
                    }else if(change=='B'){
                        if(position.getPositionX()+1 >= grid.getLimX()){
                            position.setPositionX(0);
                        }else{
                            position.setPositionX(position.getPositionX()+1);
                        }
                    }
                    break;
            }
            position = checkObstacle(position, copyOldPosition, obstacles);
        }
        return position;
    }

    public static Position checkObstacle(Position newPosition, Position oldPosition, List<Obstacle> obstacles){
        Position position = newPosition;
        for(Obstacle obstacle : obstacles){
            boolean hasHurtObstacle = false;
            if(newPosition.getPositionX() == obstacle.getPositionX() && newPosition.getPositionY() == obstacle.getPositionY()){
                position.setPositionX(oldPosition.getPositionX());
                position.setPositionY(oldPosition.getPositionY());
                hasHurtObstacle = true;
            }
            if(hasHurtObstacle){
                System.out.println("Obstacle:("+obstacle.getPositionX()+":"+obstacle.getPositionY()+")");
            }
        }
        return position;
    }

    public static int randomInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

}