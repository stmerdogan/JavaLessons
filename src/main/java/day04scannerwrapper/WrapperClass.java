package day04scannerwrapper;

public class WrapperClass {
    public static void main(String[] args) {

        //primitive types : char-boolean- byte- short- int- long- float- double
        //Wrapper Class   : Character- Boolean- Byte- Short- Integer- Long- Float- Double
        //Wrapper Class   :They are non-primitive classes. Therefore, they take up a lot of memory.

        // If you write i and put a period, you will not see any method because primitives do not contain methods.
        int i = 12;
        System.out.println(i);

        // If you write i2 and put a period, you will not see many methods because wrapper classes do not contain methods.
        Integer i2 = 20;
        System.out.println(i2);

        byte b1 = 33;
        System.out.println(b1);

        Byte b2 = 44;
        System.out.println(b2);

        //Find the minimum and maximum values of the short data type by writing code
        short maxShort = Short.MAX_VALUE;
        System.out.println("maxShort = " + maxShort);

        short minShort = Short.MIN_VALUE;
        System.out.println("minShort = " + minShort);

        //Find the minimum and maximum values of the int data type by writing code

        int maxInt = Integer.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;

        System.out.println(maxInt + maxByte);
    }
}
