package day03methodobjectcreationscanner;

public class MethodCreation01 {
    public static void main(String[] args) {

        double cube = getCube(5);
        System.out.println("cube = " + cube);

        print("Java is easy");

        //Second way to create a method.
        //Create a method of a word that is given to you..and write it on console.
        //Create the variable

        String str = "TechproEdu";

        //Write the method name and arguments.
        //On red bulb you wait, then click create method and then design the code as you wish.

        printConsole(str);

        //Create a method that multiply two numbers and write on the console

        int a = 3;
        int b = 5;

        multiply(a, b);

        //Create a method that find a number's square.

        int num1 = 5;

        square(num1);


    }

    private static void square(int num1) {

        System.out.println(num1 * num1);
    }

    private static void multiply(int a, int b) {

        System.out.println(a * b);
    }

    private static void printConsole(String str) {

        System.out.println(str);
    }

    //Create a method that calculates the cube of a decimal number, then use it.
    //If you want to make access modifier "default" do not write default while creating a method.
    static double getCube(double a) {

        return a * a * a;
    }

    //Create a method of a word that is given to you..and write it on console.
    //If a method doesn't produce a new data, its return type is void.
    //If the return type is void, you don't need to write return keyword in main method.
    public static void print(String str) {

        System.out.println(str);
    }





}
