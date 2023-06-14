package day25inheritance;

public class Vehicle {
    public Vehicle() {
        this(3000);
        System.out.println("Vehicle 1");
    }

    public Vehicle(int price) {
        System.out.println("Vehicle 2");
    }
}

/*
 1) Child classtan bir object olusturdugunuzda Constructor en ustteki parent class'tan baslatilarak alta dogru calisitirilir.
 2) Child class'taki constructor'dan Parent class'taki constructor'a gidebilmek icin super() kullanilir.
 3) Parent Class'ta birden fazla constructor varsa istenilen constructor super() ifadesinin icine yazilan parametreler yardimi
  ile secilebilir.
 4) Ayni class icindeki constructor'i secmek icin this() kullanilir ,ayni class'ta birden fazla constructor varsa istenilen
 constructor this() ifadesinin parantez icine yazilan parametreler yardimi ile secilebilir.
 5)super() ifadesini yazmak istege baglidir, yazmassaniz da java  sanki super() varmis gibi davaranir,
 Ama kodunuzun daha okunur kilmak icin yazmaniz tavsiye edilir.
 6) super() ve this() ifadeleri constructor icinde herzaman ilk satirda olmalidir
 7) Bir constructor icinde super() ve this() ifadeleri sadece bir kere kullanilabilir. (Bakiniz 6.)
 8) Inheritance da variable lari ve methodlari bir classtan cagirmak icin this veya super kullanilir
    this ayni class icindeki variable lari veya methodlari cagirmak icin kullanilir
    super parent class icindeki variable lari veya methodlari cagirmak icin kullanilir
 */