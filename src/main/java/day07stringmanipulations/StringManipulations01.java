package day07stringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {

        String t = "     Ali13yasindadir!...    ";
        //Note:Bir grup datayi ifade etmek icin "Regular Expressions" yani Regex kullaniriz.
        //Bir grup datayi degistirmek icin replaceAll() methodu kullanilir

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
        11-Sadece space karakteri ...............................\\s
        12-Space karakteri haric.................................\\S
        13-Sadece rakamlar.......................................\\d
        14-Rakamlar haric........................................\\D

        */

        //1."t" String indeki tum rakamlari "*" cevirin

        String t1 = t.replaceAll("[0-9]", "*");
        System.out.println(t1);//Ali ** yasindadir!...

        //2."t" String indeki tum rakamlari ve harfleri "!" e ceviriniz

        String t2 = t.replaceAll("[a-zA-Z0-9]", "!");
        System.out.println(t2);//!!! !! !!!!!!!!!!!...

        //3."t" String indeki tum sesli rakamlari ve harfleri "?" e ceviriniz

        String t3 = t.replaceAll("[aeiouAEIOU]", "?");//?l? 13 y?s?nd?d?r!...
        System.out.println(t3);

        //4."t" String indeki kucuk harfler disindaki tum characterleri  "<>" e ceviriniz

        String t4 = t.replaceAll("[^a-z]", "<>");//<>li<><><><>yasindadir<><><><>
        System.out.println(t4);

        //5."t" String indeki tum harfler disindaki characterleri "+" ya cevirin.

        String t5 = t.replaceAll("[^a-zA-Z]", "+");//Ali++++yasindadir++++
        System.out.println(t5);

        //6."t" String indeki space ler disindaki tum characterleri "?" cevirin

        String t6 = t.replaceAll("[^ ]", "?");//??? ?? ??????????????
        System.out.println(t6);

        //7."t" String indeki sesli harfler disindaki tum characterleri "&" ceviriniz

        String t7 = t.replaceAll("[^aeiouAEIOU]", "&");//A&i&&&&&a&i&&a&i&&&&&
        System.out.println(t7);
    }
}