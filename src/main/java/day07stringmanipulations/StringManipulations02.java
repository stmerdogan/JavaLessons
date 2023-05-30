package day07stringmanipulations;

import java.util.Scanner;

public class StringManipulations02 {
    public static void main(String[] args) {
        /*
             Asagidaki kurallara gore kullanicini girdigi password u kontrol ediniz.
             1-En az 8 character olsun
             2-Space characteri password de olmasin
             3-En az bir buyuk harf olsun
             4-En az bir  kucuk harf olsun
             5-En az bir rakam olsun
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen password giriniz");
        String pwd = input.nextLine();

        //1-En az 8 character olsun
        boolean first = pwd.length() > 7;
        System.out.println("first " + first);

        //2-Space characteri password de olmasin
        boolean second = !pwd.contains(" ");
        System.out.println("second = " + second);

        // 3-En az bir buyuk harf olsun
        // Buyuk harf olmayanlari sil
        // Kalan karakter sayisina bak
        // Karakter sayisi sifir ise buyuk harf yok demektir
        //Methodlari yanyana kullanmaya method chain denir

        boolean third = pwd.replaceAll("[^A-Z]", "").length() > 0;
        System.out.println("third = " + third);

        //4-En az bir  kucuk harf olsun
        boolean fourth = pwd.replaceAll("[^a-z]", "").length() > 0;
        System.out.println("fourt = " + fourth);

        //5-En az bir rakam olsun
        boolean fifth = pwd.replaceAll("[^0-9]", "").length() > 0;
        System.out.println("fifth = " + fifth);

        System.out.println(("Password gecerli mi? " + (first && second && third && fourth && fifth)));
        input.close();
    }
}
