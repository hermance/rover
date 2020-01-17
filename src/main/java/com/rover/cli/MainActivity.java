package com.rover.cli;
import com.rover.core.Utils;
import com.rover.core.Position;
import com.rover.core.Obstacle;
import com.rover.core.Grid;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class MainActivity {
    public static void main(String[] args){
        System.out.println("Bonjour ! Entrez une commande. ");
        Scanner choose = new Scanner(System.in);
        String choice= null;
        Position position = new Position(0, 0, "N");
        Grid grid = new Grid(Utils.randomInt(5,20),Utils.randomInt(5,20));
        List<Obstacle> obstacles = new ArrayList<>();
        for(int i = 0; i < Utils.randomInt(1,grid.getLimX())*Utils.randomInt(1,grid.getLimY()); i++){
            Obstacle obstacle = new Obstacle(Utils.randomInt(0,grid.getLimX()), Utils.randomInt(0,grid.getLimY()));
            obstacles.add(obstacle);
        }

        System.out.println("Grid ("+grid.getLimX()+","+grid.getLimY()+")");
        String displayObstacles = "Terrain (";
        for(Obstacle obstacle : obstacles){
            displayObstacles += obstacle.getPositionX()+":"+obstacle.getPositionY();
            displayObstacles += " ";
        }
        displayObstacles+="= Obstacle(s))";
        System.out.println(displayObstacles);
        while(!"end".equals(choice)){
            System.out.print("Rover > ");
            choice = choose.nextLine();
            position = Utils.changeOrientationOrPosition(position, grid, choice, obstacles);
            System.out.println("Position > " + position.getOrientation() + " : " + position.getPositionX() + " : " + position.getPositionY());
        }
        choose.close();
    }
}
