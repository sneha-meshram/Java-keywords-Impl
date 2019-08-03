package com.stackroute;

public class ControlFlow {

    //enum declaration
    enum Colors {
        red, blue, green, yellow, pink
    }

    public static void main(String[] args) {

        String color = "white";

        //switch statement
        switch (color) {
            case "pink":
                System.out.println("color is pink");
            case "blue":
                System.out.println("color is blue");
            default:
                System.out.println("the default color is black");
            case "red":
                System.out.println("color is red");
            case "yellow":
                System.out.println("color is yellow");

        }
        //print array using enhance loop

        String[] name = {"sneha,akansha,shailendra"};
        for (String person : name) {
            System.out.println("the name are " + person);
        }

        //print color of enum
        Colors colors = Colors.green;
        System.out.println(colors);

    }

}
