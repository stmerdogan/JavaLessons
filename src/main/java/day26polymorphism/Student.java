package day26polymorphism;

public class Student {

    //Encapsulation==>Kapsulleme

    /*
    Encapsulation nedir?Data hiding (veri saklama)
    Data nasil saklanir?
    Access modifier'larini private yaparak datayi diger class'lardan gorunmez hale getiririm.
    Boylece data'yi saklarim.
    Encapsulation yaptigimiz data'yi istersek diger class'lardan okuyabiliriz.
    Nasil okuruz?
    getmethod olusturarak encpsulate edilmis data'nin degerini okuyabiliriz
    1)get method'lar public olur.
    2)get methodun return type'i okudugu variable'in return type'i ile ayni olur
    3)get method bir boolean variable icin olusturulduysa ismi "is" ile baslar
    ornek ==> isSuccessful()
    */

    private String stdId = "AC20230614";
    public String stdName = "Ali Can";

    public int age = 13;
    private double notOrt = 3.13;
    private boolean successful = false;

    public String getStdId() {
        return stdId;
    }

    public double getNotOrt() {
        return notOrt;
    }
     /*
     Encapsulation yaptigimiz datayi istersek diger class'lardan nasil degistirebiliriz?
     "set method" olusturarak encapsulate edilmis datanin degerini degistirebilirz.
     1-set methodlar hep public olur
     2-set methodlarin return type'i hep void olur.
     3-set methodlar parametre kullanir, parametrenin data type'i variable'da neyse o olur'

     NOT;set method kullanarak varolan obje uzerinde degisiklikler yaparak o objeyi sanki yeni bir
     object'mis gibi kullanabiliriz.

     NOT2; get methodlarin diger adi getter, set methodlarin diger adi setter'dir.
     getter ve setter'larin ikisine birden "Java Beans" denir.
     */

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setNotOrt(double notOrt) {
        this.notOrt = notOrt;
    }

    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }

    public boolean isSuccessful() {
        return successful;

    }
}



