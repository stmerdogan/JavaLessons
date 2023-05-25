package day04scannerwrapper;

public class AutoBoxingUnboxing {
    public static void main(String[] args) {

        //Turning a primitive int to Wrapper int.
        //Turning a primitive data type to a wrapper Class is called AUTOBOXING.

        int num = 14;
        Integer wrapperNum = num;
        System.out.println(wrapperNum);

        //Turn a Wrapper Byte to a  primitive byte.
        //Turning a wrapper Class  to a primitive data type is called UNBOXING.

        Byte k = 127;
        byte primitiveK = k;
        System.out.println(primitiveK);

        //Turn Primitive char into Wrapper Character .

        char initial = 'm';
        Character initialWrapper = initial;
        System.out.println(initialWrapper);

        //Turn Wrapper boolean into primitive boolean.
        Boolean isOldWrapper = true;
        boolean isOldPrimitive = isOldWrapper;
        System.out.println(isOldPrimitive);


    }
}
