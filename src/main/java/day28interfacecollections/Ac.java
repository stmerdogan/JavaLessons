package day28interfacecollections;

public interface Ac  {

    public abstract void cool();

    void run();

    int price = 2000;
     /*
    1) Bir interface'i bir classin parenti yapmak icin "implements" keywordunu kullaniriz
    2) java parentlar class oldugunda multiple parent a musaade etmez ama biz bazen
    multiple parent a ihtiyac duyariz
    Bu ihtiyaci gidermek icin java interface adinda yeni bir yapi olusturdu
    Bu yapi sayesinde bir class icin coklu interface parent olusturulabilir
    3) interfacelerin icine conceret method konulamaz, cunku concrete methodlarda body vardir ve
    body o methodun isi nasil yapacagini belirtir. isin nasil yapilacagi bir cok detay icerir ve bu chlid
    classlarda kafa karisikligina sebep olur. Halbuki sadece yapilmasi gereken isi soyleyip
     nasil yapilaacgini childa birakirsaniz chil classin kafa karisikligini engellemis olursunuz
    4) interfacelerdeki tum methodlar otomatik olara public dir, abstracttir, static degildir
    5) interfaceler concrete method iceremezler dolayisyal interface icindeki hicbirsey istege bagli degildir
    hersey child classlar icin mecburidir. Bu yuzden interfacelere" to-do list " de denir
    6)Coklu interface parentlerin her birinin icine ayni isimli methodlar koyabiliriz.
    Mesela "Ac" nin , "Engine" in ve "Security" nin iclerine "run()" methodu koymak gibi
    Child class herhangi birini override ettiginde hepsini override etmis olur, sonra da body'i child
    class'da yazarak uygulamasini yapmis olur.
    7) a)Interface'lerdeki tum variable'lar otomatik olarak(default) final'dir.Bu yuzden interface icindeki
    variable'i olusturdugunuzda mutlaka deger atamasi yapmalisiniz.Bilindigi gibi final variable'larin
    degerleri degistirilemez.
        b)Interface deki tum variable'lar otomatik olarak (default) publictir
        Interface deki tum variable'lar otomatik olarak (default) statictir.
        =>dolayisiyla interfacelerde variable cagirirken interface adini kullanarak cagiririz.Bu hem static
        variable olmanin geregidir. hem de okunurlugu artirir.
    8) Normalde interface icine concrete method konulamaz ama bazen ozel durumlarda concrete method
    koymamiz gerekirse "default" keyword kullanarak bunu yapabiliriz.
    "static" keywordunu kullanarak da interface icine concrete method koyabiliriz.
    9) "default" keyword'unu kullanarak olusturdugunuz "concrete" methnodlara interface'in child class'indan
     object olusturarak ulasabilirsiniz.
     "static" keywordunu kullanarak olusturdugunuz "concrete" methnodlara ulasmak icin, object olsturmaya gerek
     yoktur.interface ismi yeterlidir.
     10) Interface'lerden object olusturulamaz.
     Interface'lerin constructor'lari yoktur.
     11)

            Child          Parent               Keyword

            class          class        ===>    extends
            inteface       interface    ===>    extends
            class          interface    ===>    implements
            interface      class        ===>    OLAMAZ

    Ayni ise "extends" farkli ise "implements" kullaniriz ve interface concrete class'in child'i olamaz

    Abstract class ile interface arasindaki farklar nelerdir?

    1) Abstract classlar hem abstract hem de concrete method icerebilir fakat interfaceler sadece abstract method icerir.
    ama interface'lerde istersek default ve static keyword'lerini kullanarak concrete method uretebiliriz.
    2) Abstract classlar multiple inheritance'i desteklemez ama interface'ler destekler.
    3) Abstract class'lar icinde her turlu variable olusturulabilir ama interface'ler icindeki variable'lar public static
    ve final olmak zorundadir.
    4) interface class'in child'i olamaz ama abstract class'in child'i olabilir.
    5) Abstract class'larda constructor vardir ama object uretemez, interface'lerde constructor yoktur bu yuzden object
    uretemez

   */
}
