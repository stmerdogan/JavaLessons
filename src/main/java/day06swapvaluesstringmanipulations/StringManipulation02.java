package day06swapvaluesstringmanipulations;

public class StringManipulation02 {
    public static void main(String[] args) {

        String s = "Learn Java earn money";

        //1."s" String inin "money" ile bitip bitmedigini kontrol ediniz
        boolean isEnd = s.endsWith("money");
        System.out.println(isEnd);

        //2."s" String indeki "money" kelimesini "dolar" kelimesine ceviriniz
        String s1 = s.replace("money", "dolar");
        System.out.println(s1);//Learn Java earn dolar

        //3."s" String indeki "earn" kelimesini "win" kelimesine ceviriniz
        String s2 = s.replace("earn", "win");
        System.out.println(s2);//Lwin Java win money

        //4."s" String indeki tum 'a' harfleri  '*' karakterine ceviriniz
        String s3 = s.replace('a', '*');
        System.out.println(s3);//Le*rn J*v* e*rn money

        //5."s" String indeki tum 'n' harfleri  '***' karakterine ceviriniz
        String s4 = s.replace("n", "***");
        System.out.println(s4);//Lear*** Java ear*** mo***ey

        //6."s" String indeki tum 'e' harfleri  siliniz
        String s5 = s.replace("e", "");
        System.out.println(s5);//Larn Java arn mony

        String t = "Ali 13 yasindadir!...";
        //Note:Bir grup datayi ifade etmek icin "Regular Expressions" yani Regex kullaniriz.

        /*
        Meshur Regex

        1-Tum rakamlar...........................................[0-9]
        2-Tum kucuk harfler......................................[a-z]
        3-Tum buyuk harfler......................................[A-Z]
        4-Tum kucuk ve buyuk harfler.............................[a-zA-Z]
        5-Tum harfler ve rakamlar................................[a-zA-Z0-9]
        6-Tum noktalama isaretleri...............................\\p{Punct}
        7-Tum sesli harfler......................................[aeiouAEIOU]
        8-Tum   -x,q,m-    ......................................[xqw]-baska harfler de olabilir.
        9-Kucuk harflerden farkli tum characterler...............[^a-z]
        10-Tum harflerden farkli tum characterler................[^a-zA-Z]
        */

        //7."t" String indeki tum rakamlari "*" cevirin

        String t1 = t.replaceAll("[0-9]", "*");
        System.out.println(t1);//Ali ** yasindadir!...
    }
}
