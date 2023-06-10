package day21arraylists;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListMethods {

    public static void main(String[] args) {

        System.out.println("******** List tanımlama ilk dğer atama(initialize)*********");

        List<Integer> listSayilar = new ArrayList();
        listSayilar.add(1);
        listSayilar.add(23);
        listSayilar.add(35);
        listSayilar.add(17);

        List<String> listIsimler = new ArrayList(Arrays.asList("Reha", "hakan", "haluk", "ahsen", "ZEHRA", "CEMAL"));
        List<String> listUlkeler = new ArrayList(List.of("Almanya", "Fransa", "Ingiltere", "Ispanya", "Italya"));

        System.out.println("listIsimler : " + listIsimler);
        System.out.println("listSayilar :" + listSayilar);
        System.out.println("listUlkeler : " + listUlkeler + "\n");

        System.out.println("******** List'e eleman ekleme : add() *********");

        listSayilar.add(-123);
        System.out.println(listSayilar);
        listSayilar.add(2, 33);
        System.out.println("2. index'e 33 eklendi " + listSayilar + "\n");

        System.out.println("******** Özel bir metod:Collections nCopies kullanimi... *********");

        ArrayList<Integer> nums = new ArrayList(Collections.nCopies(10, 5));
        System.out.println("nums : 10 tane 5 den oluşan arrayList :" + nums + "\n");

        System.out.println("******** Özel bir metod: addAll(Collection C) *********");

        ArrayList<Integer> listRakam = new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        ArrayList<Integer> listIkiBasamakli = new ArrayList(List.of(10, 20, 30, 40, 50));
        System.out.println("listRakam : " + listRakam);
        listRakam.addAll(listIkiBasamakli);
        System.out.println("listIkiBasamakli'nin sona eklenmis hali");
        System.out.println("listRakam ListIkiBasamaklı eklenmiş hali : " + listRakam);
        listRakam.addAll(3, listIkiBasamakli);
        System.out.println("listIkiBasamakli'nın 3.indexten itibaren listRakam'a eklenmis hali" + listRakam + "\n");

        System.out.println("******** List'in içinden istenen index'teki elemanı alma : get() *********");

        listIsimler.get(2);
        System.out.println("listIsimler'den 2. index teki eleman haluk alındı : " + (String)listIsimler.get(2) + "\n");

        System.out.println("******** List'in boyutunu bulma : size() *********");
        System.out.println("listSayilar'in eleman sayısı : " + listSayilar.size() + "\n");

        System.out.println("******** List'in istenen elemanını silme : remove() *********");
        listSayilar.remove(3);
        listIsimler.remove("haluk");
        System.out.println("listSayilar 3. index teki elemanı silindi : " + listSayilar);
        System.out.println(listSayilar.remove("-123"));
        System.out.println(listIsimler);
        System.out.println(listIsimler.remove("haluk"));
        listIsimler.add("Reha");
        System.out.println("listIsimler'in sonuna Reha eklanmiş hali : " + listIsimler);
        listIsimler.remove("Reha");
        System.out.println("listIsimler'de bulduğu ilk reha'yı silindi : " + listIsimler);
        listIsimler.remove("haluk");
        System.out.println(listIsimler.remove("haluk"));
        System.out.println("" + listIsimler + "\n");

        System.out.println("******** List'te herhangi bir elemanın index(yerini) bulma : indexOf() *********");

        System.out.println("indexOf ZEHRA sonrası :" + listIsimler.indexOf("ZEHRA"));
        System.out.println("indexOf haluk sonrası :" + listIsimler.indexOf("haluk"));
        Collections.sort(listSayilar);
        System.out.println("listSayilar'da 48'in indexOf sonrası :" + listSayilar.indexOf(48) + "\n");

        System.out.println("******** List'te herhangi bir elemanın son bulma index(yerini) bulma : lastIndexOf() *********");

        ArrayList<Integer> tekrarlilist = new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 2, 7, 8, 9));
        System.out.println("2 elemanının listede son bulunduğu yerin index'i :" + tekrarlilist.lastIndexOf(2) + "\n");

        System.out.println("******** list teki istenen hehangi bir  elemanı update etme :set() *********");

        listIsimler.set(0, "ahmet");
        System.out.println("listIsimler'de 0. inex' ahmet set edildi : " + listIsimler + "\n");

        System.out.println("******** list teki istenen hehangi bir parçasını alma :subList(int fromIndex, int toIndex) *********");

        ArrayList<Integer> listParcasi = new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 18, 9));
        System.out.println(listParcasi);
        System.out.println("2. index dahil, 5. index haric parcası alındı : " + listParcasi.subList(2, 5));
        ArrayList<Integer> yeniList = new ArrayList(listParcasi.subList(4, 8));
        System.out.println("list.subList(4,8) ile yeniList tanimlandi : " + yeniList + "\n");

        System.out.println("******** list'in boş dolu olduğunu öğreneme : isEmpty() *********");

        System.out.println(listIsimler.isEmpty() + "\n");

        System.out.println("******** List te istenen eleman var mı yok mu?öğrenme : contains() *********");

        System.out.println("listIsimler'de ipek elamanı var mı? : " + listIsimler.contains("ipek") + "\n");

        System.out.println("******** List'teki elemanları düzenli sıralama : Collections.sort() *********");
        Collections.sort(listIsimler);
        System.out.println("listIsimler'de harf sırası  : " + listIsimler);
        Collections.sort(listSayilar);
        System.out.println("listSayilar'da küçükten büyüge elemanların sırası : " + listSayilar + "\n");

        System.out.println("******** List'teki elemanları düzenli tersten sıralama : Collections.reverse() *********");

        Collections.reverse(listSayilar);
        System.out.println("listSayilar'daki elemanları düzenli tersten sıralaması  = " + listSayilar + "\n");
        ArrayList<Integer> ipek = new ArrayList(Arrays.asList(45, 23, 67, -100, 1, 0));
        System.out.println("ilk hali: reverse olmadan : " + ipek);
        Collections.reverse(ipek);
        System.out.println("reverse hali : " + ipek);

        System.out.println("******** List'teki elemanları max min elemanını bulma : Collections.max/min() *********");

        System.out.println("listSayilar deki en büyük sayı = " + Collections.max(listSayilar));
        System.out.println("listSayilar deki en küçük sayı = " + Collections.min(listSayilar) + "\n");

        System.out.println("******** List'teki belli bir değerdeki elemanlara , başka bir değer atama : Collections.replaceAll() *********");

        Collections.replaceAll(listSayilar, 33, 9);
        System.out.println("listSayilar'da 33 değerindeki elemanlara 9 değeri atandı  = " + listSayilar + "\n");

        System.out.println("******** List'teki elemanlara aynı değeri atama : Collections.fill() *********");

        Collections.fill(listSayilar, 8);
        System.out.println("listSayilar'a tüm elemanlara 8 atanadı = " + listSayilar + "\n");

        System.out.println("******** iki list'in eşitliğini bulma : equals() *********");

        List<String> name1 = new ArrayList(Arrays.asList("a", "b"));
        List<String> name2 = new ArrayList(Arrays.asList("b", "a"));
        List<String> name3 = new ArrayList(Arrays.asList("A", "b"));
        List<String> name4 = new ArrayList(Arrays.asList("A", "b"));
        System.out.println(name1.equals(name2));
        System.out.println(name1.equals(name3));
        PrintStream var10000 = System.out;
        boolean var10001 = name3.equals(name4);
        var10000.println("" + var10001 + "\n");

        System.out.println("******** list'i Array'a çevirme : toArray() *********");

        String[] arr = (String[])listIsimler.toArray(new String[0]);
        System.out.println("listIsimler'in array hali: " + Arrays.toString(arr));
        Object[] arr1 = listSayilar.toArray();
        System.out.println("listSayilar'ın  array hali: " + Arrays.toString(arr1) + "\n");

        System.out.println("******** Array'i list'e çevirme : Arrays.asList(arrName) *********");

        String[] arr2 = new String[]{"Aliye", "Canan"};
        List<String> list1 = Arrays.asList(arr2);
        System.out.println(list1);
        System.out.println(Arrays.toString(arr1) + "\n");

        System.out.println("******** list'i  boşaltma silme : clear() *********");

        listIsimler.clear();
        System.out.println(listIsimler);
    }
}
