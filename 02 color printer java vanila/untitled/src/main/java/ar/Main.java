package ar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello please choose a color: (blue, red, yellow)");
        String color = scanner.nextLine().toLowerCase();

        while (!color.equals("blue") && !color.equals("red") && !color.equals("yellow")) {
            System.out.println("Invalid entry!");
            System.out.println("Please choose a color: (blue, red, yellow)");
            color = scanner.nextLine().toLowerCase();
        }

        if (color.equals("blue")) {
            Blue blue = new Blue();
            blue.paint();
        } else if (color.equals("red")) {
            Red red = new Red();
            red.paint();
        } else if (color.equals("yellow")) {
            Yellow yellow = new Yellow();
            yellow.paint();
        }
    }
}
