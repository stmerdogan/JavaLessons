package day03methodobjectcreationscanner;

//From java util library scanner class imported.
import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {

        //First step.Create an object from Scanner Class.

        Scanner input = new Scanner(System.in);

        //Second step.Give message to users what you want them to write.

        System.out.println("Lutfen yasinizi giriniz");

        //Third step.Using the proper method put the data that users give you  into memory.

        byte age = input.nextByte();
        System.out.println("age = " + age);

    }

}
