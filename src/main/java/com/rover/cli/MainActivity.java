package com.rover.cli;
import com.rover.core.Orientation;

public class MainActivity {
    public static void main(String[] args){
        System.out.println("Bonjour !");
        String input = "";
        String position = "N";
        while(input != "QUIT"){
            position = Orientation.changeOrientation(position, input);
            System.out.println(position);
            input = System.console().readLine();
        }
        return;
    }
}
