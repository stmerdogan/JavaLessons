package day08stringmanipulationmemoryusageifstatement;

public class StringManipulation01 {
    public static void main(String[] args) {
        //1.Bir String in hic character icermedigini (bos bir string) oldugunu kontrol eden kodu yazin

        //1.yol -length () methodu ile cozun

        String str = "";
        boolean result1 = str.length() == 0;
        System.out.println("String bos mu? " + result1);

        //2.yol -isEmpty() methodu ile cozun====>recomended
        boolean result2 = str.isEmpty();
        System.out.println(result2);

        //2.Bir String in space haric hicbir character icermedigini kontrol eden kodu yaziniz

        String t = "   ";

        //1.yol
        boolean result3 = t.replace(" ", "").length() == 0;
        System.out.println(result3);

        //2.yol
        boolean result4 = t.replace(" ", "").isEmpty();
        System.out.println(result4);

        //3.yol
        boolean result5 = t.isBlank();
        System.out.println(result5);

        //isBlank() methodu sadece space iceren Stringler icin true verir
        //Space disinda bir character var ise false verir
        //isBlank() methodu bos stringler icin de true verir
        //isBlank() methodu space ve hicbir sey icin true verir.
        //isEmpty() methodu sadece hicbir sey icin true verir

        //3.Bir String de a, i, e, karakterlerinin ilk gorunumlerinin indexleri toplamini ekrana yazdiriniz
        //"Java is easy to learn"==>1+5+8=14
        //0123456789.....index

        String r = "Java is easy to learn";
        int idxA = r.indexOf('a');
        System.out.println(idxA);//1

        int idI = r.indexOf('i');
        System.out.println(idI);//5

        int idE = r.indexOf('e');
        System.out.println(idE);//8
        System.out.println(idE + idxA + idI);//14

        //4.Bir String  deki "Java" kelimesinin ilk olarak kacinci index te kullanildigini gosteren kodu yaziniz
        //"Ah Java vah Java sensiz olmuyor Java."
        //Indexof("Java") kullaniminda siz "Java" kelimesinin ilk gorunumundeki ilk harfin (yani J nin) indexini almis olursunuz

        String u = "Ah Java vah Java sensiz olmuyor Java.";
        int idxJava = u.indexOf("Java");
        System.out.println(idxJava);//3

        int idxjava = u.indexOf("java");
        System.out.println(idxjava);//-1 verir
        //indexOf methodu olmayan characterler icin kullanilirsa her zaman -1 return eder

        //5.Bir String de a, i, e, karakterlerinin son gorunumlerinin indexleri toplamini ekrana yazdiriniz
        String v = "Java is easy to learn";//5+17+18=40

        int idxofA = v.lastIndexOf('a');
        int idxofE = v.lastIndexOf('e');
        int idxofI = v.lastIndexOf('i');

        System.out.println(idxofA + idxofE + idxofI);


    }
}
