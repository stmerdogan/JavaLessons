package day04scannerwrapper;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {

        //Take 2 whole numbers from the user input and do four operations and print the results
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers ");

        double firstNumber = input.nextDouble();
        double secondNumber = input.nextDouble();

        System.out.println("Add:" + (firstNumber + secondNumber));
        System.out.println("Substract:" + (firstNumber - secondNumber));
        System.out.println("Multiply:" + firstNumber * secondNumber);
        System.out.println("Divide:" + firstNumber / secondNumber);


    }
}
