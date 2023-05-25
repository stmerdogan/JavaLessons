package day08stringmanipulationmemoryusageifstatement;

public class StringMnipulation02 {
    public static void main(String[] args) {
        //1.Bir stringin belirli bir karakterinden baslayarak belirli bir karaktere kadar dynamic olarak aliniz 
        //abc@gmail.com  ===> gmail

        String a = "abc@gmail.com";
        int startingIndex = a.indexOf('@') + 1;
        int endingIndex = a.indexOf('.');
        String companyName = a.substring(startingIndex, endingIndex);
        System.out.println("companyName = " + companyName);

        //2.Verilen iki  stringin birbirinin aynisi olup olmadigini kontrol eden kodu yaziniz
        String h = "ali can";
        String i = "Ali Can";

        boolean result = h.equals(i);
        System.out.println(result);

        //Java da Memory kullanimi
        /*
        java da iki tane memory vardir
        1)Stack Memory ==> small
            a)Kucuk memorydir
            b)Primitive leri ve Non-Primitivelerin adreslerini (reference) tutar

        2) Heap Memory ==> Huge
            a)Buyuk memory dir
            b)Non-Primitive datalari icerir
            ==>Java heap memory de yerlestirilen tum Non-primitive datalar icin bir adres olusturur
            ve bu adresi stack memory de saklar
         */

        /*
        Note: String lerin esitliklerini kontrol ederken "==" yerine "equals()" methodu kullaniriz
        Neden kullaniriz?
        Cunku; "==" sembolu iki string i karsilastirirken hem adreslerine hemde degerlerine bakar,
        ikisi de ayni ise stringler esittir der ama biz code yazarken genellikle Stringlerin adressleri ile degil
        degerleri ile ilgileniriz. Bu yuzden String karsilastirmalarinda "==" kullanmayiz

        "equals()" methodu ise iki string i karsilastirirken sadece degerlerine bakar. degerleri ayni ise bu iki string
        esittir der, degerler farkli ise bu iki string farklidir der ki bu bizim kod yazarken ihtiyac duyudugumuz seydir

         */

        String s = "Tom";
        String t = "Terry";
        String r = new String("Tom");

        System.out.println(s == t);
        //false verir cunku adresler ve degerler farklidir.
        System.out.println(s.equals(t));
        //false verir cunku degerler farkli
        System.out.println(s == r);
        //false verir cunku adresler farkli degerler ayni olsa da
        System.out.println(s.equals(r));
        //true verir cunku equals sadece degerlere bakar."s" ve "r" nin degerleri aynidir.

        //3.Verilen iki stringin birbirinin aynisi olup olmadigini buyuk harf kucuk harf dikkate  almadan kontrol eden kodu yaziniz.

        String j = "ali can";
        String k = "Ali Can";

        boolean result3 = j.equalsIgnoreCase(k);
        //equalsIgnoreCase() verilen iki stringin birbirinin aynisi olup olmadigini  buyuk harf kucuk harf dikkate almadan kontrol eder


    }
}
