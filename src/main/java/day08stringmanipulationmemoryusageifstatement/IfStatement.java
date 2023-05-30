package day08stringmanipulationmemoryusageifstatement;

public class IfStatement {
    public static void main(String[] args) {
        //if statement
        //Bazi kodlarin bazi sartlara gore aktif edebilmek icin if statetment kullanilir.
        //if "eger" demek ==> if cumlesi

        //if you study hard, you will learn Java  ==> English

            /*
            if (you study hard) {
            you will learn Java                   ==> Java language
            }
            */

        //1.Sayi pozitif ise ekrana pozitif yazdirin

        int num = -13;
        if (num > 0) {
            System.out.println(num + "==> Pozitiftir");
        }

        //Sayi -1 ile 10 arasinda ise ekrana rakam yazdirin.

        int n = -5;
        if (n > -1 && n < 10) {
            System.out.println("Rakam");
        }
    }
}
