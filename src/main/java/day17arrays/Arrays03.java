package day17arrays;

import java.util.Arrays;

public class Arrays03 {

    public static void main(String[] args) {

        //Specific bir elemanin array'de olup olmadigini anlamak icin gereken kodu yaziniz
        String names[] = {"K", "C", "R", "A", "S"};
        String el = "R";

        //1.Yol
        int counter = 0;

        for (String w : names) {
            if (w.equals(el)) {
                counter++;
                break;
            }
        }
        if (counter > 0) {
            System.out.println("Array has " + el);
        } else {
            System.out.println("Array does not have " + el);
        }

         /*
            1-binarySearch() method'unu sort() kullanmadan kullanmayiz; cunku binarySearch() mantigi sirali elemanlar icin gecerlidir
            2-binarySearch() method'u var olan elemanlar icin size o elemanin indexini verir
            3-binarySearch() method'undan aldiginiz index 0 veya 0'dan buyukse bu o eleman array'de o eleman vardir demektir.
            4-binarySearch() method'u olmayan elemanlar icin negatif tam sayi degeri verir.
            "-" isaretinin anlami o eleman yok demektir.
            "sayi" ise o eleman olsaydi kacinci eleman olurdu demektir.
         */

        //2.Yol :binarySearch() methodu hizli calisir.
        Arrays.sort(names);
        int result = Arrays.binarySearch(names, el);
        if (result < 0) {
            System.out.println("Array does not have " + el);

        } else {
            System.out.println("Array has " + el);
        }
        System.out.println(Arrays.toString(names));//[A, C, K, R, S]

        int num1 = Arrays.binarySearch(names, "A");
        System.out.println(num1);//0==>var hem de index'i sifirdir.

        int num2 = Arrays.binarySearch(names, "K");
        System.out.println(num2);//2==>var hem de index'i ikidir.

        int num3 = Arrays.binarySearch(names, "U");
        System.out.println(num3);//-6==>"-" bu eleman yok demek olsaydi 6.eleman olurdu
    }
}
