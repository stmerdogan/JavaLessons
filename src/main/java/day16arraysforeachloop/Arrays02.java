package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays02 {

    public static void main(String[] args) {

        //Ornek 1.String Array olusturun, icine 5 tane eleman ekleyin.
        //Ilk eleman ile son elemanin icerdigi karakter sayilari toplamini yazdirin.

        String arr[] = new String[5];

        arr[0] = "Math";
        arr[1] = "Science";
        arr[2] = "Music";
        arr[3] = "English";
        arr[4] = "Art";

        System.out.println(Arrays.toString(arr));//[Math, Science, Music, English, Art]

        System.out.println(arr[0].length() + arr[arr.length - 1].length());//7

        //Ornek 2.String Array olusturun, icine 5 tane eleman ekleyin.
        //Tum elemanlarin icerdigi karakter sayilari toplamini ekrana yazdirin

        String[] brr = new String[5];

        brr[0] = "Miami";
        brr[1] = "Istanbul";
        brr[2] = "Oslo";
        brr[3] = "Erzurum";
        brr[4] = "Ankara";

        //1.Yol for loop

        int totalChar = 0;
        for (int i = 0; i < brr.length; i++) {
            totalChar = totalChar + brr[i].length();

        }
        System.out.println(totalChar);//30


        //2.Yol for each loop (enhanced loop)

        //baslangic degeri, loopun calisma sarti ve increment/decrement kismini kendisi halleder.
        //For each loop "Array'lerde ve Collection'larda" ullanilir

        /*
        Kalibini olusturalim
        for (datatype variableName (w) konulur : arr/collection){

            calisacak kodlar
        }
         */

        int sum = 0;

        for (String w : brr) {
            sum = sum + w.length();
        }
        System.out.println(sum);//30

        //Array'le ya da collections'larla calisiyorsaniz mutlaka mutlaka for each loop'la calisiniz

        //Ornek3. Notlar adinda int bir array olusturunuz. Icine 6 adet not yerlestiriniz ve not ortalamasini ekrana yazdiriniz

        int notlar[] = new int[6];
        notlar[0] = 50;
        notlar[1] = 70;
        notlar[2] = 60;
        notlar[3] = 40;
        notlar[4] = 90;
        notlar[5] = 80;
        System.out.println(Arrays.toString(notlar));//65

        int toplam = 0;

        for (int w : notlar) {
            toplam = toplam + w;

        }
        System.out.println(toplam / notlar.length);
    }
}
