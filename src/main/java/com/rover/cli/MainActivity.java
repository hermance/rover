package com.rover.cli;
import com.rover.core.Orientation;
import com.rover.core.Position;
import java.util.Scanner;

public class MainActivity {
    public static void main(String[] args){
        System.out.println("Bonjour ! Choisissez une orientation. ");
        Scanner choose = new Scanner(System.in);
        String choice= null;
        Position position = new Position(0, 0, "N");
        while(!"end".equals(choice)){
            choice = choose.nextLine();
            position = Orientation.changeOrientationOrPosition(position, choice);
            System.out.println("Position > " + position.getOrientation() + " : " + position.getPositionX() + " : " + position.getPositionY());
        }
        choose.close();
        return;
    }
}
