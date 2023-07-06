package day05concatenationoperatorstypecasting;

public class Operators {

    /*
    1) +, -, *, / operations are used in java as in mathematics.
    int/ int => int
    double + int => double
    Because if different data types are used in mathematical operations in java, the result will always be in large data type..

    2)Java has "Logical Operators". AND and OR operations are logical operators.

     >>AND (&&) Everything must be true to get true in operations.
     >>AND (&&) is perfectionist.
     >>AND (&&) makes one false result false in its operations.


    TEA                AND               COFFEE           RESULT
     T                  &&                 F               F
     F                  &&                 T               F
     F                  &&                 F               F
     T                  &&                 T               T

     >> OR  (||) one true result is enough to make true in your operations
     >> OR  (||) everything must be false for the result to be false.
     >> OR  (||) their actions are like "pollyanna".


    TEA                AND               COFFEE           RESULT
    T                   ||                 F               T
    F                   ||                 T               T
    T                   ||                 T               T
    F                   ||                 F               F

    >>The NOT Operator (!) returns true if false,  returns false if true.
    !true==> false
    !false==> true
    !!true==> true

    3)Comparison Operators

    <,>   <=,  >=,  ==,  !=
    Note: You definitely get boolean (true or false) when you use comparison operators.

    Note: We use && for AND operation, but the use of & is also valid.
    What are the differences?
    && doesn't check the rest if the first expression is false. So it runs fast.
    Because in the AND operation, if the first expression is false, it doesn't matter what the others are. The result is false.
    & checks the others regardless of the first expression, so it runs slowly..
    */
    public static void main(String[] args) {

        boolean first = 3 < 5;
        boolean second = 2 + 3 != 5;
        boolean third = 2 + 3 * 5 > 19;

        System.out.println(first + " - " + second + " - " + third);
        System.out.println(first && second);
        System.out.println(first || second || third);

    }
}
