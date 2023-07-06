package day02datatypesmethodcreation;

public class MethodCreation01 {
    /*
    How can we create methods in JAVA?

    1)We create methods in Class, outside main method
                1               2               3        4     5
    2) Access Modifier  + Return type  +  Method name  + () + {}

    How can we use the methods that we created?
    1) To create a method is not sufficient to start the method.The method that will be used
        should be used in main method
    2) Write method name + ()
    3) Put all the arguments in the parentheses.
       This is called "Method Call"
    4) method name + arguments ==> method signature
     */
    public static void main(String[] args) {

        int output = doSum(3, 5);
        System.out.println(output);

        long multiplyOutput = multiply(4, 5);
        System.out.println(multiplyOutput);

        System.out.println(firstTwoMultiplyThirdAdd(2, 3, 4));
    }

    //Example 1: Write a sum method.
    public static int doSum(int a, int b) {//in this part we declare the datas that we want to apply.

        return a + b;
        //return means that return this value where it is called.
    }
    //Because main method is static, the method in main method should be static

    //Example 2: Create a method that multiplies two integers.
    protected static long multiply(int a, int b) {
        return a * b;
    }

    //Example 3: Create a method with three integers that multiplies first two integers and add the third integer.
    private static int firstTwoMultiplyThirdAdd(int a, int b, int c) {
        return a * b + c;
    }
}
