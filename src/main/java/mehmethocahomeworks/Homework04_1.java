package mehmethocahomeworks;

import java.util.Scanner;

public class Homework04_1 {
    public static void main(String[] args) {
        // 1) Write the code that finds the average of 3 numbers you get from the user.//(3+5+7)/3

        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers");

        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        System.out.println("Average:"+(num1+num2+num3)/3);




    }
}
