package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        int a = 13;

        //Bu yapinin icinde sadece bir tane data depolanabilir.
        // Ama biz code yazarken bir yapinin icinde coklu data depolama ihtiyaci hissederiz.
        // bir yapinin icinde coklu data depolayabilmek icin java Array yapisini olusturmustur.

        //Array nasil olusturulur

        String stdNames[] = new String[5];
        System.out.println(Arrays.toString(stdNames));

        /*
        SuperFasttir kullanilacak eleman sayisi belli ise
        Arrayler tercih edilir haftanin gunleri aylar vb gibidatalar icin.
        Yazdirmak icin herzamanArray.toString(Variable Name) olarak kullanilir sout icinde

        */

        //Array e nasil eleman eklenir

        stdNames[0] = "Ekim";
        stdNames[1] = "Mesut";
        stdNames[2] = "Benna";
        stdNames[3] = "Abdullah";
        stdNames[4] = "Recep";

        System.out.println(Arrays.toString(stdNames));

        //Array den specific bir elemani nasil aliriz?

        System.out.println(stdNames[3]);
        System.out.println(stdNames[4]);

        //1.Arraydaki her elemanin sonuna unlem isareti koyarak yadiriniz.
        //length() String'lerde method (parantezli) Array'lerde ise parantezsiz yazilir.

        for (int i = 0; i < stdNames.length; i++) {
            System.out.println(stdNames[i] + "!");

        }


    }
}
