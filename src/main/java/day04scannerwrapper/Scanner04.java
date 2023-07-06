package day04scannerwrapper;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {

        //Take two lines of a rectangle from user;
        //a-Calculate the area of the rectangle: short line* long line
        //b-Calculate the perimeter of the rectangle:2*short line + 2*long line

        Scanner input = new Scanner(System.in);

        System.out.println("Enter short line");
        double shortLine = input.nextDouble();

        System.out.println("Enter long line");
        double longLine = input.nextDouble();

        System.out.println("Rectangle Area:" + (shortLine * longLine));
        System.out.println("Rectangle Perimeter:" + (2 * shortLine + 2 * longLine));
        input.close();
    }
}
