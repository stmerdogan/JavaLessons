package homeworks;

import java.util.Scanner;

public class Homework04_2 {
    public static void main(String[] args) {
        // 2) Find the sum of the digits of a 3-digit number you received from the user/ 3+1+2 = 6 for /312

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a three digit number");
        int number = input.nextInt();

        int firstDigit = number %10;//2
        number = number/10;//31

        int secondDigit = number%10;//1
        number = number/10;//3

        int thirdDigit = number%10;//3

        System.out.println("Sum:"+(firstDigit+secondDigit+thirdDigit));





    }


}
