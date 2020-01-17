package com.rover.cli;
import com.rover.core.Orientation;
import java.util.Scanner;

public class MainActivity {
    public static void main(String[] args){
        System.out.println("Bonjour !");
        Scanner choose = new Scanner(System.in);
        String choice= null;
        String input = "";
        String position = "N";
        while(!"end".equals(choice)){
            choice = choose.nextLine();
            position = Orientation.changeOrientation(position, choice);
            System.out.println("Rover > " + position);
        }
        choose.close();
        return;
    }
}
