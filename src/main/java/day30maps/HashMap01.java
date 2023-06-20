package day30maps;

import java.util.*;

public class HashMap01 {
    public static void main(String[] args) {

        /*
       1) Map'lerde sözlüklerdeki gibi kelime ve manasi seklinde bir kullanim vardir.
       2) Key kismi tekrarsiz olur , ama value kismi tekrarli olabilir
       3) Map'lerdeki her bir elemana "Entry" denir tamamina ise "EntrySet" denir.
       4) Entry'ler tekrarsiz oldugu icin EntrySet denir.
       5) Key ve Value'lar ayri ayri data typelarinda olabilirler.
       6) Map'ler "Collection" degildir, farkli bir yapidir.
       7) Hashmap'ler enrty'leri rastgele siralar bu yuzden en hizli map'tir.
        */

        //Map nasil olusturulur

        HashMap<String, Integer> countryPopulation = new HashMap<>();

        countryPopulation.put("Germany", 83000000);
        countryPopulation.put("Albania", 30000000);
        countryPopulation.put("USA", 40000000);
        countryPopulation.put("Turkey", 83000000);
        countryPopulation.put("Netherlands", 180000000);

        System.out.println(countryPopulation);//{USA=40000000, Netherlands=180000000, Turkey=83000000, Germany=83000000, Albania=30000000}

        //get() methodu "key" ile calisir ve value kismini verir.
        int usaPopulation = countryPopulation.get("Turkey");
        System.out.println(usaPopulation);//83000000

        //Butun key'leri nasil alabiliriz?
        Set<String> keys = countryPopulation.keySet();
        System.out.println(keys);//[USA, Netherlands, Turkey, Germany, Albania]

        //Butun value'lari nasil alabilriz?
        Collection<Integer> value = countryPopulation.values();
        System.out.println(value);//[40000000, 180000000, 83000000, 83000000, 30000000]

        //Ornek:Country population map'indeki ulkelerin nufuslarinin ortalamasi nedir?
        Collection<Integer> values = countryPopulation.values();

        int sum = 0;
        for (Integer w : values) {
            sum = sum + w;
        }
        System.out.println(sum / values.size());//83200000

        //Looplar map'ler ile kullanilamaz, bunu icin entrySet methodunu kullaniriz.
        //entrySet() map'teki entry'leri kalip halinde alip bize Set'in icine koyarak verir.
        Set<Map.Entry<String, Integer>> entries = countryPopulation.entrySet();
        System.out.println(entries);//[USA=40000000, Netherlands=180000000, Turkey=83000000, Germany=83000000, Albania=30000000]

        //Ornek 2: countryPopulation Map'indeki ulkelerin isimlerinin character sayisi ile nufuslarin toplamini bulunuz.

        int toplam = 0;
        for (Map.Entry<String, Integer> w : entries) {
            toplam = toplam + w.getKey().length() + w.getValue();
        }
        System.out.println(toplam);//416000034
    }
}
