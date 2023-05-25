package day04scannerwrapper;

import java.util.Scanner;

public class Scanner06 {
    public static void main(String[] args) {

        //Let's ask the user for the radius and calculate the circumference of the circle and the area of the circle.

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius");

        double radius = input.nextDouble();
        System.out.println("Circumference of the circle:" + (2 * 3.14 * radius));
        System.out.println("Area of the circle:" + (3.14 * radius * radius));


    }
}
