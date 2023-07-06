package day04scannerwrapper;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

        //Take name and surname from a user and then print them both in a line.
        //1.Step Create an object from Scanner Class
        Scanner input = new Scanner(System.in);

        //2.Give a message to the user what you want.
        System.out.println("Please enter your first name");

        //next() method takes only one word from user input
        //3.Place the data that you take from the user by using proper method into the memory.
        String firstName = input.next();

        System.out.println("Please enter your surname");
        String lastName = input.next();

        System.out.println(firstName + " " + lastName);
        input.close();
    }
}
