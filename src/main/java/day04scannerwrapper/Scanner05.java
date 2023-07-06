package day04scannerwrapper;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {

        //Write the code that prints the sum of the first two and
        //the last two digits of a 5-digit number you will take from the user.

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a five digit number");
        int number = input.nextInt();

        //To get the last digit of a number, we must divide by 10 and get the remainder.
        //% ==>modulus operator returns the remainder of the division of the number to the left of the number to the right.
        //%10 always returns the ones digit.
        //If you divide an integer by an integer, java will make the result an integer.
        //java does not round in this case, it cancels the decimal part.
        //Therefore, if we divide an integer by 10, we will delete the ones digit according to java.

        //Take the ones digit
        int onesDigit = number % 10;
        //Reduce number
        number = number / 10;

        //Take the second last digit.
        int secondLast = number % 10;
        //Reduce number
        number = number / 10;

        //Take the third last digit.
        int thirdLast = number % 10;
        //Reduce number
        number = number / 10;

        //Take the fourth last digit.
        int fourthLast = number % 10;
        //Reduce number
        number = number / 10;

        //Take the fifth last digit.
        int fifthLast = number % 10;

        //No need to reduce as it is the last digit

        System.out.println(fifthLast + fourthLast + onesDigit + secondLast);
        input.close();
    }
}
