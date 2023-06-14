package day26polymorphism;

public  class Animal {

    /*
    1)parent class'daki method'u child class icinde ozellestirerek kullanmaya overriding denir.
    2)Overriding'de method signature'a dokunulamaz.{method signature = method ismi+parantez).
    3)private method'lar override edilemezler.
    4)child class'taki methodun access modifier'i parenttaki override edilmis(overridden method)
    access modifier'indan dar olamaz.Aynisi olabilir ya da daha genis olabilir.
    5)Child class'da override edilen method'un return ile parent'taki methodun return type'i arasinda
    "IS A RELATION" varsa return type degistirilebilir.
    6)method'un return type'i primitive ise overriding yaparken return type degistirilemez.
    Cunku return type'i ayni olur veya parenttar secilir.
    Ama primitive'ler arasinda parent-child iliskisi olmadigindan aynisi olmak zorundadir.
    7)child class'da override edilen method'un return type ile parent class'daki methodun
    return type'i arasinda "IS A RELATIONSHIP" yoksa degistirilemez.Mesela;
    Integer wrapper class'i ile Long wrapper class'i arasinda "IS A RELATIONSHIP" yoktur.
    O yuzden degistirilemez.
    8)method'un return type'i "void" ise overriding yaparken return type degistirilemez.
    9)static method'lar override edilemezler.Cunku static method'lar gokteki ay gibidirler,tum child'lar
    icin ortak method'lardir.Bir child bir ortak method'u degistirdiginde diger child'lar bundan olumsuz
    etkilenebilir bu yuzden java static method'larin override edilmesine musade etmez.
    10)Final method'lar override edilemezler.final method'larin body'si degistirilemez ama override ederken
    method body degistiririz.O yuzden java final method'larin override edilmesine musade etmez.

        a)final keyword'unu variable'lar ile kullanabiliriz.
        i)eger variable final ise mutlaka deger atanmalidir.
        ii)ilk atanan deger degistirilemez.

        b)final keyword'unu method'lar ile kullanabiliriz.
        i)method final ise body'si degistirilemez.
        ii)degistirilemeyince override mumkun olmaz

        c)final keyword'unu class'lar ile kullanabiliriz.
        i)class final ise child'i olmaz

    Polymorphism = method overloading+overriding

     */

    public void eat() {
        //Parent'taki override edilmis eat() method'una Overridden method denir.
        System.out.println("Animals eat...");
    }

    public void drink() {
        System.out.println("Animals drink");
    }

    public Animal create() {
        return new Animal();
    }

    public int add(int a, int b) {
        return a + b;
    }

    public Integer multiply(Integer a, Integer b) {
        return a * b;
    }

    public  final double circleArea (double r){
        return 3.14*r*r;
    }
}
