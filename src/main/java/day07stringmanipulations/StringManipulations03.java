package day07stringmanipulations;

public class StringManipulations03 {
    public static void main(String[] args) {
        //1.Bir String in bas ve sonunda space characteri varsa siliniz

        String s = "   Ali           Can   ";

        //split() method u bir String i istedigimiz karakterden parcalamaya yarar.
        //trim() method'u bir String in bas ve sonunda space characterlerini siler aradaki spacelere dokunmaz
        String sTrimmed = s.trim();
        System.out.println(sTrimmed);

        //2.Asagidaki fiyatlari verilen urunlerin toplam fiyatini bulunuz
        // String tv = "$456.99"; String laptop = "$875.99; ==>456.99+875.99 = 1332.98

        String tv = "$456.99";
        String laptop = "$875.99";

        String tv2 = tv.replace("$", "");
        System.out.println(tv2);

        String laptop2 = laptop.replace("$", "");
        System.out.println(laptop2);

        double totalPrice = Double.valueOf(tv2) + Double.valueOf(laptop2);
        System.out.println(totalPrice);

        //3.Verilen ismin ilk isminin ilk harfini ve soyismin ilk harfini ekrana yazdiriniz.
        //"  Ali Can  " ==>AC

        String name = "    Ali Can   ";
        char first = name.trim().toUpperCase().charAt(0);
        System.out.println(first);//A

        char last = name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(last);//C

        System.out.println("" + first + last);//AC


        System.out.println(s.trim().replaceAll("\\s+", " "));
    }
}
