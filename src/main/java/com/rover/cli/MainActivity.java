package com.rover.cli;
import com.rover.core.Orientation;
import com.rover.core.Position;
import com.rover.core.Grid;
import java.util.Scanner;

public class MainActivity {
    public static void main(String[] args){
        System.out.println("Bonjour ! Entrez une commande. ");
        Scanner choose = new Scanner(System.in);
        String choice= null;
        Position position = new Position(0, 0, "N");
        Grid grid = new Grid(5,5);
        System.out.println("Grid ("+grid.getLimX()+","+grid.getLimY()+")");
        while(!"end".equals(choice)){
            choice = choose.nextLine();
            position = Orientation.changeOrientationOrPosition(position, grid, choice);
            System.out.println("Position > " + position.getOrientation() + " : " + position.getPositionX() + " : " + position.getPositionY());
        }
        choose.close();
        return;
    }
}
