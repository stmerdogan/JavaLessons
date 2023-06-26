package day33exceptionsenumsiterator;

import java.util.*;

public class Iterators01 {
    public static void main(String[] args) {

        /*

        1-Iterator'lar loop'larin yaptigi ayni isi yaparlar
        2-Iterator'larda sonsuz loop olusma ihtimali yoktur.
        3-Iterator'lar ile looplar arasinda performans farki yoktur
        4-Iterator'lar bir collection'dan eleman silme ve bir collection'daki elemani silme konusunda daha basarilidirlar
        5-Iki tip Iterator var
        a) Iterator : Bu sadece eleman silmede kullanilir.
                      Eleman eklemek veya elemani degistirmek mumkun degildir

        b)ListIterator:Bu eleman silebilir,ekleyebilir ve degistirebilir.

        Note:Iterator sadece soldan saga (ilk elemandan son elemana )calisir
             ListIterator ise iki yonlu calisabilir.
         */

        List<String> myList = new ArrayList<>();
        myList.add("Niyazi");
        myList.add("Saadet");
        myList.add("Fevzi");
        myList.add("Suat");
        myList.add("Mustafa");
        System.out.println(myList);//[Niyazi, Saadet, Fevzi, Suat, Mustafa]

        Iterator<String> myItr = myList.iterator();//[Niyazi, Saadet, Fevzi, Suat, Mustafa]

        while (myItr.hasNext()) {               //hasNext() pointer'a senden sonra eleman var mi diye sorar
            //eleman varsa true yoksa false return eder
            String el = myItr.next();           //next() pointer'i bir sonraki elemanin onune tasir ve ustunden atladigi elamani return eder.

            if (el.equals("Niyazi")) {
                myItr.remove();                 //next() methodunun return ettigi elemani siler
            }
        }
        System.out.println(myList);//[Saadet, Fevzi, Suat, Mustafa]


        //ListIterator kullanimi ve set() method kullanimi
        List<String> yourList = new ArrayList<>();
        yourList.add("Niyazi");
        yourList.add("Saadet");
        yourList.add("Fevzi");
        System.out.println(yourList);//[Niyazi, Saadet, Fevzi, Suat, Mustafa]


        ListIterator<String> yourListItr = yourList.listIterator();

        while (yourListItr.hasNext()) {

            String el = yourListItr.next();
            yourListItr.set(el + "*");//set () methodu listi update etmeye yarar
        }
        System.out.println(yourList);//[Niyazi*, Saadet*, Fevzi*]


        //ListIterator previous() method kullanimi
        List<String> list3 = new ArrayList<>();
        list3.add("Niyazi");
        list3.add("Saadet");
        list3.add("Fevzi");
        System.out.println(list3);//[Niyazi, Saadet, Fevzi]

        ListIterator<String> listItr = list3.listIterator();

        //Loop kullarak pointer'i en saga almak icin
        while (listItr.hasNext()) {

            listItr.next();
        }
        //pointeri yukaridaki kod ile ensonda biraktigimiz icin
        // elemanlari en sondan basa dogru yazdirabiliriz

        while (listItr.hasPrevious()) {

            String el = listItr.previous();

            System.out.println(el + "<===");   //Fevzi<===
                                               //Saadet<===
                                               //Niyazi<===
        }
    }
}
