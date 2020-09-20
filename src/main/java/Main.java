import entity.*;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String args[]) throws IOException {
        start();
    }

    private static void start() throws IOException {
        print();
        String input = scan.next();
        while(!validateInput(input))
        {
            System.out.print("Please enter a valid input(A, B, C, D, or E): ");
            input = scan.next();
        }

        calculate(Character.toUpperCase(input.charAt(0)));
    }

    protected static boolean validateInput(String input){
        input = input.toUpperCase();
        return input.length() == 1 && (input.charAt(0) == 'A' || input.charAt(0) == 'B'
                || input.charAt(0) == 'C' || input.charAt(0) == 'D' || input.charAt(0) == 'E');
    }

    private static void calculate(char input) throws IOException {
        switch(input) {
            case 'A':
                System.out.print("Please enter the length of the base: ");
                double base = inputDimension();
                System.out.print("Please enter the length of the height: ");
                double height = inputDimension();

                Shape triangle = new Triangle(base, height);
                System.out.println(triangle.getResult());

                System.out.println("Press Enter to continue...");
                System.in.read();
                start();
                break;
            case 'B':
                System.out.print("Please enter the length of the width: ");
                double width = inputDimension();

                Shape square = new Square(width);
                System.out.println(square.getResult());

                System.out.print("Press Enter to continue...");
                System.in.read();
                start();
                break;
            case 'C':
                System.out.print("Please enter the length of the width: ");
                double rectangle_width = inputDimension();
                System.out.print("Please enter the length of the height: ");
                double rectangle_height = inputDimension();

                Shape rectangle = new Rectangle(rectangle_width, rectangle_height);
                System.out.println(rectangle.getResult());

                System.out.print("Press Enter to continue...");
                scan.nextLine();
                System.in.read();
                start();
                break;
            case 'D':
                System.out.print("Please enter the length of the side: ");
                double side = inputDimension();

                Shape hexagon = new Hexagon(side);
                System.out.println(hexagon.getResult());

                System.out.print("Press Enter to continue...");
                scan.nextLine();
                System.in.read();
                start();
                break;
            case 'E':
                System.exit(0);
                break;
            default:
                System.out.print("Please enter a valid input: ");
                start();
        }
    }

    protected static double inputDimension(){
        String input = scan.next();
        while(!ifNumber(input) || Double.parseDouble(input) < 0)
        {
            System.out.print("Please enter a valid length: ");
            input = scan.next();
        }

        return Double.parseDouble(input);
    }

    protected static boolean ifNumber(String input){
        boolean numeric = true;

        try {
           Double.parseDouble(input);
        } catch (NumberFormatException e) {
            numeric = false;
        }

        return numeric;
    }

    private static void print(){
        System.out.println("Choose the shape type to get the area");
        System.out.println("A: Triangle");
        System.out.println("B: Square");
        System.out.println("C: Rectangle");
        System.out.println("D: Hexagon");
        System.out.println("E: Exit");
        System.out.println("Please enter A, B, C, D, or E ");
        System.out.print("Please enter your choice: ");
    }
}
