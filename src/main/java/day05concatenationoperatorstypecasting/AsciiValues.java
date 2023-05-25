package day05concatenationoperatorstypecasting;

public class AsciiValues {
    public static void main(String[] args) {
        /*
        Every character in Java has a numeric value.
        These values are advertised as ASCII values.
        The table with these values is called the ASCII Table.
         */

        char a = 'a';
        System.out.println(a);//a

        int intA = 'a';
        System.out.println(intA);//97

        //To find the ASCII value of any character, I put that character in a variable in "int" data type

        int unlem = '!';
        System.out.println(unlem);//33

        char c1 = 'K';
        char c2 = '?';

        System.out.println(c1 + c2);//138
        //If you use chars in mathematical operations in Java, java uses the ASCII values of the chars.


    }
}
