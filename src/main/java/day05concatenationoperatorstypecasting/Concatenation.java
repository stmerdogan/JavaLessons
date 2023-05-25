package day05concatenationoperatorstypecasting;

public class Concatenation {
    public static void main(String[] args) {
        // Create a String and two integers variables.Print String and integers values on the console.

        String s = "apple";
        int a = 10;
        int b = 11;
        System.out.println(s + a + b);//apple1011
        System.out.println(s + (a + b));//apple21
        System.out.println(s + a * b);//apple110
        System.out.println(a + b + s);//21apple
        System.out.println(a + s + b);//10apple11

        //In java if "+" symbol is used between two integers it will add them together.
        //In java if "+" symbol is used between two String values or
        //a String value and an integer it is called "concatenation."
        //Note: In join operations, java uses precedence rules in mathematics.

        /*
        Operation priority in mathematics
        First exponential numbers//uslu sayilar
        Operations in parentheses
        Multiplications and divisions
        Additions and subtractions
        Those with the same priority start from left to right.
         */

        //Print the sum of the two prices given to you as a String to the screen.

        String shirt = "2300";
        String shoes = "5200";
        System.out.println(shirt + shirt);//23005200

        //Integer.valueOf() this method turns String values into integer

        int totalPrise = Integer.valueOf(shirt) + Integer.valueOf(shoes);
        System.out.println(totalPrise);//7500

        //Print the sum of the two prices given to you as a String to the screen.

        String tv = "$1100";
        String radio = "$300";

        int totalPrice = Integer.valueOf(tv) + Integer.valueOf(radio);
        System.out.println(totalPrice);//$1000$300

        //Note:valueOf() method is used for Strings that have only digits (numbers)


    }
}
