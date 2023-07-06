package day35lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Lambda02 {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");

        //removeIfLengthGreaterThanFive(myList);
        //removeIfElementsStartsWithZOrEndsWithf(myList);
        //removeIfElementsStartsWithZOrEndsWithf2(myList);
        //System.out.println(getSumFromSevenToSeventy());
        //int multiplication = getMultiplicationFromThreeToNine();
        //System.out.println(multiplication);
        //System.out.println(getMultiplicationFromThreeToNine2());
        //System.out.println(getFactoriel(15));

    }

    //7) Character sayisi 5'ten fazla olan elemanları silen bir method oluşturun.
    public static void removeIfLengthGreaterThanFive(List<String> myList) {
        myList.removeIf(t -> t.length() > 5);
        System.out.println(myList);//[Ali, Elif, Yusuf, Elif]
    }

    //8) 'Z' ile başlayan yada 'f' ile biten elemanları silen bir method oluşturun.

    //1.yol
    public static void removeIfElementsStartsWithZOrEndsWithf(List<String> myList) {
        myList.removeIf(t -> t.charAt(0) == 'Z' || t.charAt(t.length() - 1) == 'f');
        System.out.println(myList);
    }

    //2.yol
    public static void removeIfElementsStartsWithZOrEndsWithf2(List<String> myList) {
        myList.removeIf(t -> t.startsWith("Z") || t.endsWith("f"));
        System.out.println(myList);
    }

    //9) 7'den 70'e kadar tum tamsayilarin toplamini veren kodu yaziniz
    public static int getSumFromSevenToSeventy() {
        return IntStream.
                rangeClosed(7, 70).
                reduce(Math::addExact).
                getAsInt();
    }

    //1.Yol
    public static int getMultiplicationFromThreeToNine() {
        return IntStream.
                rangeClosed(3, 9).
                reduce(Math::multiplyExact).
                getAsInt();
    }

    //2.Yol
    public static int getMultiplicationFromThreeToNine2() {
        return IntStream.
                range(3, 10).//substring mantigi ilkini al sonu alma
                        reduce(Math::multiplyExact).
                getAsInt();
    }

    //11)Size verilen sayinin faktoryelini hesaplayan kodu yaziniz.
    public static int getFactoriel(int x) {
        if (x == 0) {
            return 1;
        } else if (x < 0) {
            System.out.println("Faktoriyel islemi negatif sayilarla yapilamaz");
            return -1;
        } else {
            return IntStream.
                    rangeClosed(1, x).//range closed alinca ikinci sayi birinci sayidan kucuk olamaz.
                                      //ikinci sayi ya birinci sayiya esit olur ya da birincibuyuk olur
                    reduce(Math::multiplyExact).
                    getAsInt();
        }
    }
}