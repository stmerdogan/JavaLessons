package day24stringbuilder;

public class Student {

    /*
    Access Modifier
    1)public
    2)protected
    3)default (Access modifier i default yapmak icin acces modifier yazmayiz )
    4)private

    Note: Access Modifierlari genisten dara dogru siralayiniz
    public > protected > default > private

    Note: public ==> olanlar her class dan kullanilabilir.
          protected ==> olanlar baska package lardan kullanilamaz.
          ama baska package'da child class icinden kullanilabilir.
          default ==> olanlar baska package den kullanilamazlar.
          private ==> olanlar sadece olusturulduklari class icinde kullanilabilirler.

   Note: "protected" ile "default" un farkini soyleyiniz?
          protected olanlar baska package tan kullanilamaz ancak baska package'de child class icinden kullanilabilir.
          default olanlar baska package'larden kullanilamazlar.
     */

    //public her class'dan kullanilabilir
    public String stdName = "Ali Can";

    //protected olanlar kendi package ve baska package'dan sadece child classlardan gorulur.
    protected String address = "Istanbul";

    //default olanlar baska package'dan kullanilamazlar.
    String email = "alican@gmail.com";

    //private olanlar sadece olusturulduklari class icinde kulllanilabilirler.
    private String ssnId = "123456789";
}