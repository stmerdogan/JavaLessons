package day06swapvaluesstringmanipulations;

public class SwapValues {
    public static void main(String[] args) {

        //1.YOL

        //Swap yer degistirmek demek 1.Kap Patates  2.Kap Domates ==> 1.Kap Domates ==> 2.Kap Patates

        int a = 12;
        int b = 5; // Swap den sonra ==> a = 5, ve b = 12
        int temp = 0;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //1. Adim
        temp = a;

        //2.Adim
        a = b;

        //3.Adim
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //2.YOL

        int c = 12;
        int d = 5;

        System.out.println("c = " + c);
        System.out.println("d = " + d);

        c = c + d;

        d = c - d;

        c = c - d;

        System.out.println("c= " + c);
        System.out.println("d = " + d);


    }
}
