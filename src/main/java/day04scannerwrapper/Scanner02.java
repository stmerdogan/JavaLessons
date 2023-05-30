package day04scannerwrapper;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

        //Take adress information from user and print it to screen

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter adress information");

        //nextLine() method takes only many word from user input
        String adress = input.nextLine();
        System.out.println(adress);
        input.close();
    }
}
