package day06swapvaluesstringmanipulations;

public class StringManipulation01 {
    public static void main(String[] args) {

        //String bir non-primitive data type dir ve ayni zamanda classdir.
        String s = "Java is easy";

        //1."s" String indeki tum karakterleri buyuk harf yapiniz.
        String sUpper = s.toUpperCase();
        System.out.println(sUpper);//JAVA IS EASY

        //2."s" String indeki tum karakterleri kucuk harf yapiniz.
        String sLower = s.toLowerCase();
        System.out.println(sLower);//java is easy

        //3."s" String indeki ilk karakteri aliniz
        char firstchar = s.charAt(0);
        System.out.println(firstchar);//J

        //4."s" String indeki bastan ikinci ve sondan ikinci karakteri aliniz.
        char secondChar = s.charAt(1);
        char secondLastChar = s.charAt(10);
        System.out.println("" + secondChar + secondLastChar);//as

        //5."s" String inde kullanilan character sayisini bulunuz
        int sLength = s.length();
        System.out.println(sLength);//12

        //6."s" String inde kullanilan ilk dort karakteri aliniz
        //s.substring(0,4);==> bu kullanimda ilk index dahildir, son ikinci index harictir.
        String sub1 = s.substring(0, 4);
        System.out.println(sub1);//Java

        //7."s" String inde kullanilan "is" kelimesini aliniz
        String sub2 = s.substring(5, 7);
        System.out.println(sub2);

        //8."s" String inde kullanilan "easy" kelimesini aliniz
        String sub3 = s.substring(8, 12);
        System.out.println(sub3);

        //ikinci yol
        String sub4 = s.substring(8);
        System.out.println(sub4);

        //9."s" String inde "money" kelimesi var mi kontrol ediniz
        boolean isExist = s.contains("money");
        System.out.println(isExist);

        boolean isExist2 = s.contains("java");//Case sensitive- "" hiclik demek ve true dondurur.
        System.out.println(isExist2);

        //10."s" String inde belli bir karakterle ya da kararkterlerle balayip baslamadigini kontrol ediniz
        boolean isStart = s.startsWith("Java");
        System.out.println(isStart);

        //11."s" String inin 5.index dahil olmak uzere bu index ten itibaren
        // "i" karakteri ile baslayip basalamdigini kontrol ediniz

        boolean isBegin = s.startsWith("v", 2);
        System.out.println(isBegin);


    }


}


