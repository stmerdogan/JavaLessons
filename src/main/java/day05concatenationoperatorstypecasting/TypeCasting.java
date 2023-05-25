package day05concatenationoperatorstypecasting;

public class TypeCasting {
    public static void main(String[] args) {
        /*
        Converting numeric primitive data types to each other is called "Type casting"
        Numeric Data types byte- short- int- long- float- double
         */

        /*
        Java automatically converts small data types to large data types.
        This process is called "AutoWidening".
        Converting large data types to small data types is risky.
        Java does not do this risky process automatically,on the contrary, java expects this process from code writers.
        This process is called "ExplicitNarrowing".
         */

        //Convert byte data type to int data type
        byte age = 13;
        int ageInt = age;//Autowidening

        //Convert int data type to short data type

        int weight = 312;
        short weightShort = (short) weight;//ExplicitNarrowing

        //int data type ini float data type a ceviriniz

        int population = 7000;
        System.out.println(population);

        float populationFloat = population;
        System.out.println(populationFloat);

        //double data type short data type a cevirininiz.

        double number = 12.99;
        System.out.println(number);

        short numberShort = (short) number;
        System.out.println(numberShort);

        //Example
        short num = 260;
        System.out.println(num);//260

        byte numByte = (byte) num;
        System.out.println(numByte);//4

        //Donusum yaptigimiz sayi(260) donuseceginiz data type inin sinirlari disinda
        //ise java kullandiginiz sayi ile mod islemi yapar ve mod isleminin sonucu sizin yeni degeriniz olur


    }
}
