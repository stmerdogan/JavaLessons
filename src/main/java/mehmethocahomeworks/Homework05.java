package mehmethocahomeworks;

import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args) {

        //1) Bir string variable olusturunuz ve bu string deki rakam olmayan tum karakterlerin sayisini console a yazdiriniz
        String s = "Bu kurs 6 ay surecek";
        int rakamHaric = s.replaceAll("[0-9]", "").length();
        System.out.println("rakamHaric = " + rakamHaric);//19

        //2) Bir string variable olusturunuz ve ilk karakter ile son karakter disindaki tum karakterleri console  buyuk harflerle yazdiriniz
        String motto = "No pain, no gain";
        String lastView = motto.substring(1, motto.length() - 1).toUpperCase();
        System.out.println("lastView = " + lastView);// O PAIN, O GAI

        //3) Bir string variable olusturunuz ve bu string deki ilk ve son karakterlerin ASCII degerleri toplamini console a yazdiriniz
        String st = "Geccek geccek";
        int firstIdx = st.charAt(0);
        int lastIdx = st.charAt(st.length() - 1);
        System.out.println("Sum :" + (firstIdx + lastIdx));//178

        //4) Tek kelimeli bir sehir ismi icin string variable olusturun ve sehir isiminin ilk harfini buyuk harfle diger harflerini kucuk harflerle console a yazdirin.
        String city = "bURSA";
        char fistLetter = city.toUpperCase().charAt(0);
        String secondLetter = city.substring(1).toLowerCase();
        System.out.println(fistLetter + secondLetter);//Bursa

        //5)Asagidaki kurallara gore kullanicinin girdigi passwordu kontrol ediniz
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your password");

        String sfr = input.nextLine();
        //a)En az 6 character olsun
        boolean sfrChar = sfr.length() > 5;
        System.out.println("Karakter sayisi en az 6 mi?  " + sfrChar);//true

        //b)En az bir tane buyuk harf olsun
        boolean sfrLower = sfr.replaceAll("[^a-z]", "").length() > 0;
        System.out.println("En az 1 kucuk harf iceriyor mu?   " + sfrLower);//true

        //c)En az bir tane kucuk harf olsun
        boolean sfrUpper = sfr.replaceAll("[^A-Z]", "").length() > 0;
        System.out.println("En az 1 buyuk harf iceriyor mu?   " + sfrUpper);//true

        //d)En az bir tane rakam olsun
        boolean sfrNum = sfr.replaceAll("[^0-9]", "").length() > 0;
        System.out.println("En az 1 tane  rakam  iceriyor mu?  " + sfrNum);//true

        System.out.println("Sifre Gecerli mi?   " + (sfrNum && sfrUpper && sfrLower && sfrChar));//true


    }
}
