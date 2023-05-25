package day13loops;
public class Loops01 {
    public static void main(String[] args) {

        //Ekrana 5 kere "Hi" YAZDIRIN

        System.out.println("Hi..");
        System.out.println("Hi..");
        System.out.println("Hi..");
        System.out.println("Hi..");
        System.out.println("Hi..");

        /*
        Kod standartlari
        1.Tekrar olmamalidir
        2.Kodlar dynamic olmalidir
        3.Tamir(fix) ve update kolay yapilabilmelidir.
        */

        //2.Yol
        //Ayni adimlar tekrar tekrar yapilmasi gerektiginde "Loop"lar kullanilir
        //Dort adet loop vardir.1.for-loop 2.while loop 3.do-while-loop 4.for-each loop

        //1.for loop

        //i++ ------i=i+1------i+=1 (hepsi ayni anlamda bir artir demek)
        /*for (Baslangic degeri ; Loop calisma sarti; Artirma/eksiltme){
        Calisacak kodlar
        }
        */
        //Ornek 1.

        for (int i = 1; i < 6; i++) {
            System.out.println("Hi..!");

        }

        //Ornek 2.11'den 14'e kadar tum tamsayilari ekrana yazdiran kodu yaziniz

        for (int i = 11; i < 15; i++) {
            System.out.println(i);

        }
        //Ornek 3.40'dan 23'e kadar tum cift sayilari ekrana yazdiran kodu yaziniz

        for (int i = 40; i > 22; i--) {

            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        //Ornek 3.18'den 56'ya kadar tum tek sayilari ekrana yazdiran kodu yaziniz

        for (int i = 18; i < 57; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}
